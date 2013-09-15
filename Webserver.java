import java.io.*;
import java.net.*;

class Webserver {
	ServerSocket providerSocket;
	Socket connection = null;

	void run() {
		providerSocket = new ServerSocket(2004, 10);
		Syste.out.println("Waiting for connection");
		connection = providerSocket.accept();
	}
