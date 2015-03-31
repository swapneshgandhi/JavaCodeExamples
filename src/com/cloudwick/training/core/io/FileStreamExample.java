package com.cloudwick.training.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {

	public void createMyFile(String name) throws FileExistsException,
			IOException {
		File file = new File(name);

		if (file.exists()) {
			throw new FileExistsException("Please provide unique filename");
		} else {
			System.out.println("File Created");
			file.createNewFile();
		}

	}

	public void writeContent(String name) {

		FileOutputStream fout = null;

		try {

			fout = new FileOutputStream(name);
			String data = "My name is ______";
			fout.write(data.getBytes());
			fout.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public void readContent(String fileName) {
		FileInputStream fin = null;

		try {
			fin = new FileInputStream(fileName);

			int d = 0;

			while ((d = fin.read()) != -1) {
				System.out.print((char) d);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {

		try {

			FileStreamExample obj = new FileStreamExample();
			obj.createMyFile("user.txt");
			obj.writeContent("user.txt");
			obj.readContent("user.txt");

		}

		catch (FileExistsException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
