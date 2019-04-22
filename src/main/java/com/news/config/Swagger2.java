package com.news.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.withMethodAnnotation(RequestMapping.class))
				// 为当前包路径
				.apis(RequestHandlerSelectors.basePackage("com.news.controller")).paths(PathSelectors.any()).build();
	}

	@Value("${name}")
	private String name;

	@Value("${url}")
	private String url;

	@Value("${email}")
	private String email;

	@Value("${title}")
	private String title;

	@Value("${version}")
	private String version;

	@Value("${description}")
	private String description;

	// 构建 api文档的详细信息函数,注意这里的注解引用的是哪个
	private ApiInfo apiInfo() {
		Contact contact = new Contact(name, url, email);
		return new ApiInfoBuilder()
				// 页面标题
				.title(title)
				// 版本号
				.version(version)
				// 联系方式
				.contact(contact)
				// 描述
				.description(description).build();
	}

}
