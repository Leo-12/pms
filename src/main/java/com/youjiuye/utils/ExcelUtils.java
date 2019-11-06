package com.youjiuye.utils;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelUtils {

	public static String parseExcelValueToString(Cell cell){

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String result = "";
		switch(cell.getCellType()){
			case Cell.CELL_TYPE_STRING:
				result = cell.getStringCellValue();
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				result = String.valueOf(cell.getBooleanCellValue());
				break;
			case Cell.CELL_TYPE_FORMULA:
				result = cell.getCellFormula();
				break;
			case Cell.CELL_TYPE_NUMERIC:
				if (HSSFDateUtil.isCellDateFormatted(cell)){
					Date date = cell.getDateCellValue();
					result = sdf.format(date);
				}else{
					BigDecimal bigDecimal = new BigDecimal(String.valueOf(cell.getNumericCellValue()));
					result = bigDecimal.toPlainString();
				}
				break;
			default:
				result = "";
		}
		return result;
	}
}
