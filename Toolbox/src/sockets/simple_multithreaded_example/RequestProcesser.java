package sockets.simple_multithreaded_example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * This will take care of processign a single request
 * 
 * @author eiorio
 * 
 */
public class RequestProcesser implements Runnable {

	// the socket currently connected to the client
	private final Socket	serverSocket;

	/**
	 * Contstruct this object by passign the socket currently connected to the
	 * client
	 * 
	 * @param socket
	 */
	public RequestProcesser(Socket serverSocket) {
		this.serverSocket = serverSocket;
	}

	@Override
	public void run() {

		// Each single request will be processed here
		System.out
				.println(StaticValues.NEW_REQUEST_INCOMING
						.replace(
								StaticValues.SERVER_ENCLOSED,
								serverSocket
										.getRemoteSocketAddress()
										.toString()));

		// collect the inputstream and print message from client
		try {
			DataInputStream dis = new DataInputStream(
					serverSocket.getInputStream());
			System.out.println(dis.readUTF());

			DataOutputStream dos = new DataOutputStream(
					serverSocket
							.getOutputStream());
			dos.writeUTF(StaticValues.MESSAGE_FROM_SERVER);

		} catch (IOException IOex) {
			IOex.printStackTrace();
		}
	}

}
