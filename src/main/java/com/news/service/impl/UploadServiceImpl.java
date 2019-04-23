package com.news.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.collect.Lists;
import com.news.dto.ImageDto;
import com.news.mapper.ImageMapper;
import com.news.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService {

	@Value("${upload_base_path}")
	private String UPLOAD_BASE_PATH;
	
	@Autowired
	private ImageMapper imageMapper;

	
	@Override
	public List<ImageDto> upload(MultipartFile[] file) {
		List<ImageDto> images=Lists.newArrayList();
		ImageDto image=null;
		for (MultipartFile m : file) {
			String originalFilename = m.getOriginalFilename();
			int lastIndexOf = originalFilename.lastIndexOf(".");
			String fileName = UUID.randomUUID().toString().replace("-", "")
					+ originalFilename.substring(lastIndexOf, originalFilename.length());
			File directory = new File(UPLOAD_BASE_PATH);
			if (!directory.exists()) {
				directory.mkdirs();// 级联创建目录
			}

			String fullFilePath = directory +"/"+ fileName;

			try {
				IOUtils.copy(m.getInputStream(), new FileOutputStream(fullFilePath));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			image=new ImageDto();
			image.setImageUrl(fullFilePath);
			imageMapper.insert(image);
			images.add(image);
		}
		
		return images;
	}

}
