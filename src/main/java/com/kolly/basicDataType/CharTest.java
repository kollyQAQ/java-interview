package com.kolly.basicDataType;

/**
 * Created by kolly on 2018/2/6.
 *
 */
public class CharTest {
	public static void main(String[] args){
		String str = "你好hello";
		int byte_len = str.getBytes().length;
		int len = str.length();
		System.out.println("字节长度为：" + byte_len);
		System.out.println("字符长度为：" + len);
		System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
	}
}
