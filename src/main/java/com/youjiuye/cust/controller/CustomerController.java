package com.youjiuye.cust.controller;

import com.youjiuye.common.ResultEntity;
import com.youjiuye.cust.bean.Customer;
import com.youjiuye.cust.service.CustomerService;
import com.youjiuye.sys.bean.Employee;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/cust")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@ResponseBody
	@RequestMapping(value = "/import",method = RequestMethod.POST)
	public Map<String,Object> importExcel(MultipartFile excel){
		Map<String,Object> map = new HashMap<String, Object>();
		List<Customer> customers = new ArrayList<Customer>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Workbook wb = WorkbookFactory.create(excel.getInputStream());
			for(int k=0;k<wb.getNumberOfSheets();k++){
				Sheet sheet = wb.getSheetAt(k);
				for (int i=sheet.getFirstRowNum()+1; i<=sheet.getLastRowNum();i++){
					Row row = sheet.getRow(i);
					Customer customer = new Customer();
					if(row != null){

						String linkMan = row.getCell(1).getStringCellValue();
						customer.setCompanyperson(linkMan);
						String companyName = row.getCell(2).getStringCellValue();
						customer.setComname(companyName);
						Date dateCellValue = row.getCell(3).getDateCellValue();
						String format = sdf.format(dateCellValue);
						Date addTime = sdf.parse(format);
						customer.setAddtime(addTime);
						double numericCellValue = row.getCell(4).getNumericCellValue();
						BigDecimal decimal = new BigDecimal(String.valueOf(numericCellValue));
						customer.setComphone(decimal.toPlainString());
						   /* for( int j = row.getFirstCellNum(); j<row.getLastCellNum();j++){
								Cell cell = row.getCell(j);
								String value= ExcelUtils.parseExcelValueToString(cell);
								if(i>0 && j==0){
									value = value.substring(0, value.indexOf("."));
									customer.setId(Integer.parseInt(value));
								}
								System.out.print(value+"    ");
							}*/
						System.out.println();
					}
					customers.add(customer);
				}
			}
			//System.out.println(customers);
			customerService.batchInsert(customers);
			map.put("statusCode",200);
			map.put("message","上传成功");
		}catch (Exception ex){
			System.out.println(ex.getMessage());
			System.out.println("出异常了");
			map.put("statusCode",500);
			map.put("message","上传失败");
		}


		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/export",method = RequestMethod.GET)
	public Map<String,Object> exportExcel(){

		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet("customers");
		sheet.setColumnWidth(3,4000);
		Row row = sheet.createRow(0);
		Cell[] cell = new HSSFCell[5];
		for(int i=0; i<5; i++){
			cell[i] = row.createCell(i);
		}
		cell[0].setCellValue("ID");
		cell[1].setCellValue("联系人");
		cell[2].setCellValue("公司名称");
		cell[3].setCellValue("添加时间");
		cell[4].setCellValue("联系电话");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<Customer> list = customerService.showCustomer();
		for (int i = 0; i < list.size(); i++) {
			Customer customer = list.get(i);
			Row row1 = sheet.createRow(i+1);
			Cell[] cell1 = new HSSFCell[5];
			for(int j=0; j<5; j++){
				cell1[j] = row1.createCell(j);
			}

			cell1[0].setCellValue(customer.getId());
			cell1[1].setCellValue(customer.getCompanyperson());
			cell1[2].setCellValue(customer.getComname());
			Date addtime = customer.getAddtime();
			String format = sdf.format(addtime);
			cell1[3].setCellValue(format);
			cell1[4].setCellValue(customer.getComphone());
		}
		FileOutputStream fos = null;
		try {
			 fos = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\customers.xls"));
			 wb.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code",200);
		map.put("message","下载成功");
		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/info/{id}",method = RequestMethod.GET)
	public Customer getCustomerLeader(@PathVariable("id") Integer id){
		Customer customer = customerService.detailCustomer(id);
		return customer;
	}

	@ResponseBody
	@RequestMapping(value = "/shcujson",method = RequestMethod.GET)
	public List<Customer> showCustomerJson(){
		return customerService.showCustomer();
	}

	@RequestMapping(value="/search", method = RequestMethod.GET)
	public ModelAndView search(Integer cid, String keyword, Integer orderby){
		ModelAndView modelAndView = new ModelAndView("customer");
		List<Customer> list = customerService.search(cid, keyword, orderby);
		modelAndView.addObject("list",list);
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping(value = "/delete/{ids}", method = RequestMethod.DELETE)
	public Map<String,Object> batchDelete(@PathVariable("ids") Integer[] ids){
		boolean result = customerService.batchDelete(ids);
		Map<String,Object> map = new HashMap<String,Object>();
		if (result){
			map.put("statusCode",200);
			map.put("message","删除成功");
		}else{
			map.put("statusCode",500);
			map.put("message","删除失败");
		}
		return map;
	}

	@RequestMapping(value = "update",method = RequestMethod.PUT)
	public String updateCustomer(Customer customer){

		customerService.updateCustomer(customer);
		return "redirect:/cust/shcu";
	}

	@RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
	public String editCustomer(@PathVariable("id") Integer id, Map<String, Object> map){

		Customer customer = customerService.detailCustomer(id);
		map.put("customer",customer);
		return "customer-edit";
	}

	@RequestMapping(value = "/detail/{id}",method = RequestMethod.GET)
	public String detailCustomer(@PathVariable("id") Integer id, Map<String, Object> map){

		Customer customer = customerService.detailCustomer(id);
		map.put("customer",customer);
		return "customer-look";
	}

	@RequestMapping(value = "incu",method = RequestMethod.POST)
	public String insertCustomer(Customer customer){

		customerService.insertCustomer(customer);
		return "redirect:/cust/shcu";
	}

	@RequestMapping(value = "/shcu",method = RequestMethod.GET)
	public ModelAndView showCustomer(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
									 @RequestParam(value = "pageSize",defaultValue = "3") Integer pageSize){

		ModelAndView modelAndView = new ModelAndView("customer");
		List<Customer> list = customerService.showCustomer();
		modelAndView.addObject("list",list);
		return modelAndView;
	}


}
