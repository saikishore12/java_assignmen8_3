package com.acadgild;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) throws Exception {
		BufferedWriter out1 = new BufferedWriter(new FileWriter("C:/Users/samirishetty.OSIUS/Desktop/input.txt"));
		out1.write("Hi this my text\n");
	   out1.close();
		InputStream in = new FileInputStream(new File("C:/Users/samirishetty.OSIUS/Desktop/input.txt"));
		OutputStream out = new FileOutputStream(new File("C:/Users/samirishetty.OSIUS/Desktop/out.txt"));
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
		BufferedReader in1 = new BufferedReader(new FileReader("C:/Users/samirishetty.OSIUS/Desktop/out.txt"));
		String str;
		while ((str = in1.readLine()) != null) {
			System.out.println(str);
		}
		in.close();
	}
}
