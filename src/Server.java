import java.util.*;
import java.net.*;
import java.io.*;

public class Server {
	private int port;
	private Set<String> users = new HashSet<>();
	private Set<UserThread> userThreads = new HashSet<>();
	
	public Server(int port) {
		this.port = port;
	}
	
	public void execute() {
		try(ServerSocket serverSocket = new ServerSocket()) {
			System.out.println("The server is listening on port " + port);
			while(true) {
				Socket socket = serverSocket.accept();
				System.out.println("New user connected");
				UserThread newUser = new UserThread(socket, this);
				userThreads.add(newUser);
			}
		} catch(IOException e) {
			System.out.println("Error in the server: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void addUsers(String name) {
		users.add(name);
	}
	
	public void broadcast(String message, UserThread excludeUser) {
		for(UserThread user : userThreads) {
			
		}
	}
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Syntax: java ChatServer <port-number>");
			System.exit(0);
		}
		int port = Integer.parseInt(args[0]);
		Server server = new Server(port);
		server.execute();
	}
}