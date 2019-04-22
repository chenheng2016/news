package com.news.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {

	public void upload(MultipartFile[] file);
}
