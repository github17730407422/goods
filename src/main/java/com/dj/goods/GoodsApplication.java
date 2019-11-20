package com.dj.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.battcn.swagger.annotation.EnableSwagger2Doc;

@SpringBootApplication
@EnableSwagger2Doc //构建在线接口文档
@MapperScan("com.dj.goods.dao") //扫描的mapper
public class GoodsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodsApplication.class, args);
	}

}
