/**
 * 
 */
package com.chenxing.eurekaserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HXDF
 *
 */
@RestController
public class MyController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/hello")
	public String index() {
		log.info("你好，42332---9997733435345!");
		return "你好12";
	}
}
