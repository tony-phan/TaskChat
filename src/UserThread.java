import java.net.*;
import java.io.*;
import java.util.*;

public class UserThread extends Thread {
	private Socket socket;
	private Server server;
	private PrintWriter writer;
	
	public UserThread(Socket socket, Server server) {
		this.socket = socket;
		this.server = server;
	}
}
