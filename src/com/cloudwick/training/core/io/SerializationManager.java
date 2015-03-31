package com.cloudwick.training.core.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

public class SerializationManager {

	private static void serializeObject() throws IOException {
		System.out.println(Thread.currentThread());
		FileOutputStream fos = new FileOutputStream("serialize.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		UserSerialize obj = new UserSerialize();
		obj.setName("swapnesh");
		obj.setSsn("sss");
		oos.writeObject(obj);
		oos.flush();
		fos.close();

	}

	private static void compressContent() throws IOException {
		FileOutputStream fos = new FileOutputStream("serialize.gz");
		GZIPOutputStream gos = new GZIPOutputStream(fos);
		FileInputStream fis = new FileInputStream("serialize.txt");

		int data = 0;
		while ((data = fis.read()) != -1) {
			gos.write(data);
		}

		gos.finish();
		gos.close();
		fos.flush();
		fis.close();
		fos.close();

	}

	private static void deSerializeObject() throws IOException,
			ClassNotFoundException {
		FileInputStream fis = new FileInputStream("serialize.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object o = ois.readObject();

		if (o instanceof UserSerialize) {
			UserSerialize obj = (UserSerialize) o;
			System.out.println(obj.getName());
			System.out.println(obj.getSsn());
		}
		ois.close();
	}

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		serializeObject();
		deSerializeObject();
		compressContent();

	}

}
