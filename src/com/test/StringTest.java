package com.test;

public class StringTest {
	
	
	public static void main(String[] args) {
		
		
		
		String a= "abc";
		String format= "%1$s";
		String hint = "";
		long stringStart = System.currentTimeMillis();
		for(int i = 0 ; i< 10000;i++) {
			a += "abc";
		}
		long stringend = System.currentTimeMillis();
		System.out.println("string 拼接时间：" + (stringend - stringStart));
		
		
		long stringFormatStart = System.currentTimeMillis();
		for(int i = 0 ; i< 10000;i++) {
			a += String.format(format, "abc");
		}
		long stringFormatend = System.currentTimeMillis();
		System.out.println("stringFormat 拼接时间：" + (stringFormatend - stringFormatStart));
	
		
		StringBuilder sbuider = new StringBuilder("abc");
		long StringBuilderStart = System.currentTimeMillis();
		for(int i = 0 ; i< 10000;i++) {
			sbuider.append("abc");
		}
		long StringBuilderend = System.currentTimeMillis();
		System.out.println("StringBuilder 拼接时间：" + (StringBuilderend - StringBuilderStart));

		StringBuffer sbu = new StringBuffer("abc");
		long StringBufferStart = System.currentTimeMillis();
		for(int i = 0 ; i< 10000;i++) {
			sbu.append("abc");
		}
		long StringBufferend = System.currentTimeMillis();
		System.out.println("StringBuffer 拼接时间：" + (StringBufferend - StringBufferStart));
	}
}
