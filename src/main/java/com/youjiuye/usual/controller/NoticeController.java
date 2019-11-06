package com.youjiuye.usual.controller;

import com.github.pagehelper.PageInfo;
import com.youjiuye.common.MapCommon;
import com.youjiuye.common.ResultEntity;
import com.youjiuye.usual.bean.BaoXiao;
import com.youjiuye.usual.bean.Notice;
import com.youjiuye.usual.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	@ResponseBody
	@RequestMapping(value = "/showClick",method = RequestMethod.GET)
	public ResultEntity showClick(Integer nid){
		Notice notice = noticeService.showClick(nid);
		return ResultEntity.success().put("notice",notice);
	}

	@ResponseBody
	@RequestMapping(value = "/showLatest",method = RequestMethod.GET)
	public ResultEntity showLatestNotice(){
		List<Notice> notices = noticeService.showLatestNotice();
		return ResultEntity.success().put("notices",notices);
	}

	@ResponseBody
	@RequestMapping(value = "/show",method = RequestMethod.GET)
	public ResultEntity showNotice(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum ){

		PageInfo<Notice> page = noticeService.showNotice(pageNum);
		return ResultEntity.success().put("page",page);
	}

	@ResponseBody
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public ResultEntity insertNotice(Notice notice){
		noticeService.insertNotice(notice);
		return ResultEntity.success();
	}
}
