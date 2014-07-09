package sockets.simple_example_nomultithread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * This creates a Clinet Socket to connect to a Server @ any location
 * 
 * @author eiorio
 * 
 */
public class Client {

	public static void main(String... args) {

		String host = args[0];
		Integer port = Integer.parseInt(args[1]);

		Socket socket;

		try {
			System.out
					.println("... Attempting connection to "
							+ host
							+ " on port "
							+ port);
			socket = new Socket(host, port);
			System.out.println("Connected...!");
			// arrange output stream
			OutputStream os = socket
					.getOutputStream();
			DataOutputStream dos = new DataOutputStream(
					os);

			dos.writeUTF("Sending stuff from "
					+ socket.getLocalAddress());

			// arrange the input from the server
			InputStream is = socket
					.getInputStream();
			DataInputStream dis = new DataInputStream(
					is);

			System.out
					.println("Receiving from server: "
							+ dis.readUTF());

			// cose the writer and reader and the socket

			System.out
					.println("Closing the client, BYE!");
			dis.close();
			dos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
