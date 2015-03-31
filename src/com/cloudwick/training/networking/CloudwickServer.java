package com.cloudwick.training.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.codehaus.jackson.format.InputAccessor;

public class CloudwickServer extends Thread {

	public static void main(String[] args) throws IOException {

		ServerSocket socket = new ServerSocket(7000);

		while (true) {
			System.out.println("Accepting clients now:");

			Socket sock = socket.accept();
			InputStream is = sock.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println(dis.readUTF());
			DataOutputStream out = new DataOutputStream(sock.getOutputStream());
			out.writeUTF("Thanks for sending");
			sock.close();

		}

	}

}
