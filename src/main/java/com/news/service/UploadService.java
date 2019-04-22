package com.news.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.news.dto.ImageDto;

public interface UploadService {

	public List<ImageDto> upload(MultipartFile[] file);
}
