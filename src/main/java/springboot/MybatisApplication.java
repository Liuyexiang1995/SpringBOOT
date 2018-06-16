package springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import webapp.dao.dataObject.CountryExample;
import webapp.dao.mapper.CountryMapper;

/**   
 * Copyright © 2018 eazytec.com(卓易科技) All rights reserved.
 * 
 * @Package: springboot 
 * @author: createdByliuyx 
 * @date: 2018年6月15日 下午1:16:39 
 */
@SpringBootApplication
/*@MapperScan({"webapp.dao.mapper"})*/
public class MybatisApplication implements CommandLineRunner{
	
	@Autowired
	private CountryMapper countryMapper;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MybatisApplication.class, args);
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		countryMapper.selectAll();
	}

}
