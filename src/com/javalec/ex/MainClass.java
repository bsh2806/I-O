package com.javalec.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Users\\kihong.In\\Downloads\\jain.txt");
			os = new FileOutputStream("C:\\Users\\kihong.In\\Downloads\\jain_copy.txt");
			
			/*
			byte[] bs = new byte[5];
			while (true) {
				int count = is.read(bs);
				if (count == -1) break;
				os.write(bs, 0, count);
			}
			*/
			
			while (true) {
				int i = is.read();
				if (i == -1) break;
				os.write(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			try {
				if (is != null) is.close();
				if (os != null) os.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
	}
} 
 