package com.zhiyun.ec.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SettingController {
	@Value("${application.name}")
	private String name;

	@GetMapping("main")
	public String main() {
		return name;
	}
}
