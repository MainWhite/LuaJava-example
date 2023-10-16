package com.example.luajavademo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//配置类此处用于调用bean中的对象
@Configuration
@ComponentScan("com.example.luajavademo.Java")
public class SpringConfig {
}
