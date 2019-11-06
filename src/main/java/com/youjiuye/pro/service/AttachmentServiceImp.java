package com.youjiuye.pro.service;

import com.youjiuye.pro.bean.Attachment;
import com.youjiuye.pro.bean.AttachmentExample;
import com.youjiuye.pro.mapper.AttachmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentServiceImp implements AttachmentService {

	@Autowired
	private AttachmentMapper attachmentMapper;

	@Override
	public void insertAttach(Attachment attachment) {
		attachmentMapper.insert(attachment);
	}

	@Override
	public List<Attachment> showAttach() {
		AttachmentExample example = new AttachmentExample();
		List<Attachment> attachments = attachmentMapper.selectByExample(example);
		return attachments;
	}
}
