package com.example.luajavademo.Java.LuaJava;

import org.luaj.vm2.LuaValue;
import org.luaj.vm2.Varargs;
import org.luaj.vm2.lib.VarArgFunction;
import org.springframework.stereotype.Component;

/**
 * 自写函数
 *
 * @author 白
 */
@Component
public class JavaTableFunction {

	//print函数 变长参数
	public class print extends VarArgFunction {
		@Override
		public Varargs invoke(Varargs args) {
			StringBuilder s=new StringBuilder();
			//遍历所有的参数并拼接字符串 这里获取的是字符串类型的参数
			for (int i = 0; i < args.narg(); i++) {
				s.append(args.checkjstring(i+1));
			}
			System.out.println(s);
			return LuaValue.NIL;
		}
	}
}
