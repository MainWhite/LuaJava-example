--- Created by 白.
--- DateTime: 2023/10/15 23:58

-- 例子：调用LuaJava表中的变量
print(LuaJava.name)

--例子：调用LuaJava表中的对象
LuaJava.object:print("demo")

--例子：调用LuaJava表中的对象(Java jdk原生对象)
LuaJava.object:newMap()--创建一个mao对象 具体Map怎么使用请自己测试或查询资料

--例子：调用LuaJava表中的函数(这个函数为可变长参数) 具体可以自己测试
LuaJava.Function.print("name:","白")