package com.cloudwick.training.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class CloudwickClient {

	public static void main(String[] args) throws IOException {
		
		Socket sock = new Socket("localhost",7000);
		
		DataOutputStream out = new DataOutputStream(sock.getOutputStream());
		out.writeUTF("HELLOO");
		DataInputStream in = new DataInputStream(sock.getInputStream());
		System.out.println(in.readUTF());
		
	}
	
}
