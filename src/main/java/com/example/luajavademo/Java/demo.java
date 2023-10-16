package com.example.luajavademo.Java;

import com.example.luajavademo.Java.LuaJava.JavaTableFunction;
import com.example.luajavademo.Java.LuaJava.MyExtend;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.JsePlatform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 白
 */
@Service
public class demo {

	@Autowired
	private MyExtend myExtend;

	@Autowired
	private JavaTableFunction javaTableFunction;

	private final String LuaPath="src/main/java/com/example/luajavademo/Lua/demo.lua";

	public void RunLua() {
		//创建lua全局环境
		LuaValue lua=JsePlatform.standardGlobals();

		//创建二级数组 此数组用于放Lua中的函数
		LuaTable arrFun=new LuaTable();
		arrFun.set("print",javaTableFunction.new print());

		//创建lua中的一级数组
		LuaTable arrLua=new LuaTable();
		arrLua.set("name","白");//在数组中创建名为name的key 而他的value为白
		arrLua.set("qq",3224886279L);//同理
		arrLua.set("object", CoerceJavaToLua.coerce(myExtend));//创建lua中的对象 此处是Java对象自动转换的
		arrLua.set("Function",arrFun);

		//将数组添加到全局环境中
		lua.set("LuaJava",arrLua);

		//调用loadfile函数来加载并执行com.example.luajavademo.Lua.demo.lua中的内容
		lua.get("loadfile").call(LuaPath).call();
	}

}