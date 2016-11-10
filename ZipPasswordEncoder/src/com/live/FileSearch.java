package com.live;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileSearch {

	public static void main(String[] args) {

		File[] files = find("E:\\");
		System.out.println(Arrays.toString(files));

		// #####################################################################

		File file = new File("E:\\");

		// Reading directory contents
		File[] file1 = file.listFiles();
		int count = 0;
		int Count = 0;
		for (int j = 0; j < file1.length; j++) {		
			
			if(file1[j].isFile()){
				count++;
//				System.out.println(file1[j].getName());
			}
			else{
				Count++;
				File s1 = file1[j];
				
				System.out.println(file1[j].getName());
							
			}
		}
		System.out.println("Total File "+count);
		System.out.println("Total Folder "+Count);

		// #####################################################################
	}

	

	


	private static File[] find(String string) {

		File file = new File(string);
		return file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				return name.contains(".pdf");
			}
		});
	}

}
