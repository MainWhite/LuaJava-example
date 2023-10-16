package com.example.luajavademo.Java.LuaJava;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Java对象 这里用于转换为lua中的对象 一般用于调用Java原生jdk对象
 * @author 白
 */
@Component
public class MyExtend {
	/**
	 * 平平无奇的打印方法
	 * 在Luaj中
	 * Java对象里的方法可以明确写参数lua传递的参数会自动进去
	 * 但请注意参数类型 因为Java并不同lua他是强类型语言
	 * @param text 打印的内容
	 */
	public void print(String text) {
		System.out.println(text);
	}

	public Map<String, Objects> newMap() {
		return new HashMap<>();
	}
}
