package com.cloudwick.training.core.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextStreamExample {

	private void writeTextContent(String name) {

		try {
			FileWriter fw = new FileWriter(name);
			BufferedWriter bw = new BufferedWriter(fw, 50);

			String data = "11,fn,lm,32131\n11,fn,lm,32131\n11,fn,lm,32131\n22,dd,ff,11111";
			bw.write(data);
			bw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void readTextContent(String name) {

		try {
			FileReader fr = new FileReader(name);
			BufferedReader br = new BufferedReader(fr, 50);
			String data = null;
			FileWriter fw = new FileWriter(name + ".out");
			BufferedWriter bw = new BufferedWriter(fw, 50);
			while ((data = br.readLine()) != null) {
				String columns[] = data.split(",");
				bw.write(columns[3] + "," + columns[1] + "," + columns[2]
						+ "\n");

			}
			bw.flush();
			fw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		TextStreamExample obj = new TextStreamExample();
		obj.writeTextContent("asdas.sa");
		obj.readTextContent("asdas.sa");

	}

}
