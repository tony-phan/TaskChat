import java.util.*;
import java.net.*;
import java.io.*;

public class Server {
	private int port;
	private Set<String> userNames = new HashSet<>();
	private Set<UserThread> userThreads = new HashSet<>();
	
	public Server(int port) {
		this.port = port;
	}
	
	public void execute() {
		
	}
}