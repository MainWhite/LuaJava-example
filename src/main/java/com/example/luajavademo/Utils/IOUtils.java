package com.example.luajavademo.Utils;

import java.io.FileReader;
import java.io.Reader;

public class IOUtils {
	public static String read(String path) {
		try {
			Reader r=new FileReader(path);
			StringBuilder sb=new StringBuilder();
			int ch=0;
			while ((ch=r.read())!=-1) {
				sb.append((char) ch);
			}
			return sb.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
