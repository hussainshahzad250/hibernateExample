package com.live;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public class NonRepeatCharAndFileWrite {

	public static void main(String[] args) throws IOException {
		String s1 = "shahzad hussain";
		char result = firstNonRepeatingNumber(s1);
		System.out.println("first Non Repeating Character = " + result);

		// #############################
		System.out.println("Second Task ");
		copy(new File("abc.txt"), new File("shahzad.txt"));
		System.out.println("file write success");
	}

	private static void copy(File file, File file2) throws IOException {

		InputStream in = new FileInputStream(file);
		OutputStream out = new FileOutputStream(file2);
		
		byte[] b = new byte[1024];
		if (in.read(b) > 0) {
			out.write(b);
		}
		in.close();
		out.close();
	}

	private static char firstNonRepeatingNumber(String s1) {
		int i, length;
		length = s1.length();
		Character c;
		HashMap<Character, Integer> map = new HashMap<>();
		for (i = 0; i < length; i++) {

			c = s1.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				c = s1.charAt(i);
				map.put(c, 1);
			}
		}
		for (i = 0; i < length; i++) {
			c = s1.charAt(i);
			if (map.get(c) == 1) {
				return c;
			}
		}
		return 0;
	}
}
