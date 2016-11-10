package com.live;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CopyFileData {
	
	
	public static void main(String[] args) throws Throwable {
		// 1.First Method
		copy(new File("abc.txt"), new File("xyzaaa.txt"));
		System.out.println("Write Successfully");

		// 2.Second Method
		String s1 = "shahzad hussain ejaz danish ";
		char c = firstNonRepeatedCharacter(s1);
		System.out.println("firstNonRepeatedCharacter = " + c);

		String word = "shahzad hussain";
		char re = nonRepeat(word);
		System.out.println(re);

		char nonrepeat = NonrepeatChar(word);
		System.out.println("nonrepeat " + nonrepeat);
	}

	private static char NonrepeatChar(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");

		// Read more:
		// http://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz4NH8GaXh9
	}

	private static char nonRepeat(String word) {

		Set<Character> repeating = new HashSet<>();

		List<Character> nonRepeating = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (repeating.contains(letter)) {
				continue;
			}
			if (nonRepeating.contains(letter)) {
				nonRepeating.remove((Character) letter);
				repeating.add(letter);
			} else {
				nonRepeating.add(letter);
			}
		}
		return nonRepeating.get(0);

		// Read more:
		// http://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz4NH5g6mGI
	}

	private static char firstNonRepeatedCharacter(String s1) {
		Character c;
		Map<Character, Integer> map = new HashMap<>();
		int length = s1.length();
		for (int i = 0; i < length; i++) {
			c = s1.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (int i = 0; i < length; i++) {
			c = s1.charAt(i);
			if (map.get(c) == 1) {
				return c;
			}
		}
		return 0;
	}

	private static void copy(File file, File file2) throws Throwable {
		InputStream in = new FileInputStream(file);
		OutputStream out = new FileOutputStream(file2);
		byte[] buf = new byte[1024];
		while (in.read(buf) > 0) {
			out.write(buf);
		}
		in.close();
		out.close();
	}
}
