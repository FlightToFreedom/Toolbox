package sockets.simple_multithreaded_example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String... args) {

		String host = args[0];
		Integer port = Integer.parseInt(args[1]);

		Socket socket;
		try {
			String message = StaticValues.CONNECTION_ATTEMPT_MESSAGE
					.replace(
							StaticValues.SERVER_ENCLOSED,
							host);
			message = message.replace(
					StaticValues.PORT_ENCLOSED,
					port.toString());

			System.out.println();

			socket = new Socket(host, port);
			System.out
					.println(StaticValues.CONNECTION_SUCCESSFULL
							+ socket.getRemoteSocketAddress());

			// Arrange the outputStream, this section arranges the request to
			// the server
			DataOutputStream dos = new DataOutputStream(
					socket.getOutputStream());
			// print message to the server
			dos.writeUTF(StaticValues.REQUEST_COMING_FROM_CLIENT
					.replace(
							StaticValues.SERVER_ENCLOSED,
							host));

			// arrange the inputStream, this section arranges the response from
			// the server, for now we simply print via stdout
			DataInputStream dis = new DataInputStream(
					socket.getInputStream());

			System.out.println(dis.readUTF());

			// done, for now, close IO classes and sockets
			dos.close();
			dis.close();
			socket.close();

		} catch (IOException IOEx) {
			IOEx.printStackTrace();
		}
	}

}
