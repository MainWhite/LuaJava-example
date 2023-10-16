package com.example.luajavademo;

import com.example.luajavademo.Java.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//springboot启动类
@SpringBootApplication
public class LuaJavaDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LuaJavaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext(SpringConfig.class);
		app.getBean(demo.class).RunLua();
	}
}
