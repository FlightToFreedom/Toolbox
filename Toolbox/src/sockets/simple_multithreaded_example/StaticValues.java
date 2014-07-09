package sockets.simple_multithreaded_example;

public class StaticValues {

	protected static String	SERVER_ENCLOSED				= "%server%";
	protected static String	PORT_ENCLOSED				= "%port%";
	protected static String	CONNECTION_ATTEMPT_MESSAGE	= "Trying to connect to .... %server% on port %port%";
	protected static String	CONNECTION_SUCCESSFULL		= "Successfully connected to remote server";

	// client specific messages
	protected static String	REQUEST_COMING_FROM_CLIENT	= "Client from %server% trying to connect";
	protected static String	CLOSING_FROM_CLIENT			= "About to close communication from client side... BYE!";

	// server specific messages
	protected static String	NEW_REQUEST_INCOMING		= "New request incoming from ... %server%";
	protected static String	MESSAGE_FROM_SERVER			= "This is a message coming from a socket instance (a Thread) from the server";

}
