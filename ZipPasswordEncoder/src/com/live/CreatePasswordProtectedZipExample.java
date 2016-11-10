package com.live;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class CreatePasswordProtectedZipExample {
	public static void main(String[] args) {
		try {
			
			System.out.println("Choose a password to unlock File");
			Scanner sc = new Scanner(System.in);
			String name =sc.nextLine();
			
			
			ZipFile zipFile = new ZipFile("D:/Appointment_SalarySlip.zip");

			ArrayList<File> filesToAdd = new ArrayList<File>();
			filesToAdd.add(new File("E:\\Appointment Letter\\Salary Slip\\Pay Slip_Shahzad_March16.pdf"));
			filesToAdd.add(new File("E:\\Appointment Letter\\Page 1.jpg"));
			filesToAdd.add(new File("E:\\Appointment Letter\\Page 2.jpg"));
			filesToAdd.add(new File("E:\\Appointment Letter\\Page 3.jpg"));
			filesToAdd.add(new File("E:\\Appointment Letter\\Page 4.jpg"));
			filesToAdd.add(new File("E:\\Appointment Letter\\Page 5.jpg"));
			filesToAdd.add(new File("E:\\Appointment Letter\\Page 6.jpg"));
			filesToAdd.add(new File("E:\\Appointment Letter\\Page 7.jpg"));
			filesToAdd.add(new File("E:\\Appointment Letter\\Page 8.jpg"));
//			filesToAdd.add(new File("E:\\Pay Slip_Shahzad_March16.pdf"));
//			filesToAdd.add(new File("D:\\SystemProblem.txt"));

			ZipParameters parameters = new ZipParameters();
			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
			parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);

			parameters.setEncryptFiles(true);

			parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);

			parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);

			parameters.setPassword(name);

			zipFile.addFiles(filesToAdd, parameters);
			
			System.out.println("Password Set Successfully");
		} catch (ZipException e) {
			e.printStackTrace();
		}
	}
}
