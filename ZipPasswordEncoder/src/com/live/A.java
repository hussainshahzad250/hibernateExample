package com.live;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class A {

	// public static void main(String[] args) {
	// Map<String, String> map = new HashMap<>();
	// map.put("Name", "Shahzad");
	// map.put("Age", "24");
	// map.put("Salary", "25000");
	//
	// System.out.println(map);
	//
	// Iterator<String> it = map.keySet().iterator();
	// Map<String, String> map1 = new HashMap<>();
	// while (it.hasNext()) {
	// String key = (String) it.next();
	// String value = map.get(key);
	// map1.put(value, key);
	// }
	// System.out.println(map1);
	// }

	// 2. Second
	// public static void main(String[] args) {
	// String s1 = "i am shahzada";
	//
	// String[] s2 = s1.split(" ");
	// int k;
	// for (k = 0; k < s2.length; k++) {
	// String s = s2[k];
	//
	//// StringBuffer sb = new StringBuffer(s);
	//// System.out.print(sb.reverse() + " ");
	//
	// for(int i=s.length()-1;i>=0;i--){
	// char c = s.charAt(i);
	// System.out.print(c + "");
	// }
	// System.out.print( " ");
	// }
	// }

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		int[] a = { 4, 5, 7, 8, 9, 10, 16, 13 };

		List list = new ArrayList<>();
		List list1 = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {

				list.add(a[i]);
				Collections.sort(list);

			} else {

				list1.add(a[i]);
				// Collections.sort(list1);
				list1.sort(Collections.reverseOrder());

			}

		}
		list.addAll(list1);
		System.out.println(list);
	}
}
