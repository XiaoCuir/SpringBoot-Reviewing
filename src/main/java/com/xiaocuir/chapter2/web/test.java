package com.xiaocuir.chapter2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiaocuir.chapter2.properties.Blogproperties;

@RestController
public class test {

	@Autowired
	private Blogproperties blogproperties;
	
	@RequestMapping("/test")
	private String test() {
		return blogproperties.getDesc();
	}
}
