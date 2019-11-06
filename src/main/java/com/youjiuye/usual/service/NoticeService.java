package com.youjiuye.usual.service;

import com.github.pagehelper.PageInfo;
import com.youjiuye.usual.bean.Notice;

import java.util.List;

public interface NoticeService {

	void insertNotice(Notice notice);

	PageInfo<Notice> showNotice(Integer pageNum);

	List<Notice> showLatestNotice();

	Notice showClick(Integer nid);
}
