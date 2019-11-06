package com.youjiuye.pro.controller;

import com.youjiuye.pro.bean.Attachment;
import com.youjiuye.pro.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/attach")
public class AttachmentController {

	@Autowired
	private AttachmentService attachmentService;

	@RequestMapping(value = "show",method = RequestMethod.GET)
	public ModelAndView showAttach(){

		ModelAndView modelAndView = new ModelAndView("project-file");
		List<Attachment> list = attachmentService.showAttach();
		modelAndView.addObject("list",list);
		return modelAndView;
	}

	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public String insertAttach(Attachment attach, MultipartFile attachment, HttpSession session){

		ServletContext context = session.getServletContext();
		String realPath = context.getRealPath("/upload");
		File file = new File(realPath);
		if (!file.exists()){
			file.mkdirs();
		}
		String originalFilename = attachment.getOriginalFilename();
		String realName = UUID.randomUUID().toString().replaceAll("-","") + originalFilename;
		try {
			attachment.transferTo(new File(realPath + "\\" + realName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		attach.setPath(realPath + "\\" + realName);
		attachmentService.insertAttach(attach);
		return "redirect:/project-file.jsp";
	}
}
