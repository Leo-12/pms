package com.youjiuye.pro.service;

import com.youjiuye.pro.bean.Attachment;

import java.util.List;

public interface AttachmentService {

	void insertAttach(Attachment attachment);

	List<Attachment> showAttach();
}
