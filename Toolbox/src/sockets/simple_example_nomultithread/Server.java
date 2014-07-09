package sockets.simple_example_nomultithread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Simple represetation of a server-side socket implementation
 * 
 * @author eiorio
 * 
 */
public class Server extends Thread {

	private ServerSocket	serverSocket;

	/**
	 * Construct this
	 * 
	 * @param host
	 * @param port
	 */
	public Server(String port) {
		try {
			this.serverSocket = new ServerSocket(
					Integer.parseInt(port));
			serverSocket.setSoTimeout(50000);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {

		while (true) {
			try {
				System.out
						.println("Waiting for incoming requests on port.."
								+ serverSocket
										.getLocalPort());

				Socket socket = serverSocket
						.accept();
				System.out
						.println("Just connected to.. "
								+ socket.getRemoteSocketAddress());
				// Arrange the input from the client
				InputStream is = socket
						.getInputStream();
				DataInputStream dis = new DataInputStream(
						is);
				System.out.println(dis.readUTF());

				// Arrange the output to the client
				OutputStream os = socket
						.getOutputStream();
				DataOutputStream dos = new DataOutputStream(
						os);

				dos.writeUTF("Replying from.. "
						+ socket.getLocalAddress());
				dis.close();
				dos.close();
				socket.close();

			} catch (SocketTimeoutException stoe) {
				System.out
						.println("Socket has timed out");
				stoe.printStackTrace();
			} catch (IOException IOex) {
				IOex.printStackTrace();
			}
		}
	}

	/**
	 * Start this thread
	 * 
	 * @param args
	 */
	public static void main(String... args) {
		String port = args[0];
		Thread server = new Server(port);
		server.run();
	}
}
