import java.io.*;
import java.net.*;

class Webserver {
	ServerSocket providerSocket;
	Socket connection = null;
	URL requestedUrl = null;
	HttpURLConnection connection = null;
	int PORT = 2013;
	int BACKLOG = 10; // maximum queue length for incoming conn. requests


	void run() {
			try {
		providerSocket = new ServerSocket(PORT, BACKLOG);
		System.out.println("Waiting for connection");
		connection = providerSocket.accept();
			} catch(IOException e) {
					System.err.println("Could not create server socket");
			}
	}
}
