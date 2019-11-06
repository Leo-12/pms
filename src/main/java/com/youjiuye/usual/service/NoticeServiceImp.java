package com.youjiuye.usual.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.youjiuye.usual.bean.Notice;
import com.youjiuye.usual.bean.NoticeExample;
import com.youjiuye.usual.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoticeServiceImp implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public void insertNotice(Notice notice) {
		notice.setNdate(new Date());
		noticeMapper.insert(notice);
	}

	@Override
	public PageInfo<Notice> showNotice(Integer pageNum) {

		NoticeExample example = new NoticeExample();
		PageHelper.startPage(pageNum,3);
		List<Notice> list = noticeMapper.selectByExample(example);
		PageInfo<Notice> page = new PageInfo<Notice>(list,5);
		return page;
	}

	@Override
	public List<Notice> showLatestNotice() {

		NoticeExample example = new NoticeExample();
		example.setOrderByClause("ndate desc limit 0,3");
		List<Notice> list = noticeMapper.selectByExample(example);
		return list;
	}

	@Override
	public Notice showClick(Integer nid) {
		Notice notice = noticeMapper.selectByPrimaryKey(nid);
		return notice;
	}
}
