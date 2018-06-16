package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webapp.dao.dataObject.CountryExample;
import webapp.dao.mapper.CountryMapper;

/**   
 * Copyright © 2018 eazytec.com(卓易科技) All rights reserved.
 * 
 * @Package: webapp.controller 
 * @author: createdByliuyx 
 * @date: 2018年6月15日 下午12:09:20 
 */
@RestController
public class IndexController {

	@Autowired
	private CountryMapper countryMapper;
	
	@RequestMapping("/")
	String home(){
		return "Hello world";
	}
	
	@RequestMapping("/test")
	String test(){
		return "This is TEST";
	}
	
	@RequestMapping("/mapper")
	String mapper(){
		CountryExample example=new CountryExample();
		CountryExample.Criteria criteria=example.createCriteria();
		criteria.andCountrycodeIsNotNull();
		countryMapper.selectByExample(example);
		return "This is TEST";
	}
}
