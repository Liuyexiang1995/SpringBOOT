package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**   
 * Copyright © 2018 eazytec.com(卓易科技) All rights reserved.
 * 
 * @Package: springBoot 
 * @author: createdByliuyx 
 * @date: 2018年6月15日 下午12:06:00 
 */

/*
 * springBoot启动类
 */
/*@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})*/
/*@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})*/
public class Application {

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}
