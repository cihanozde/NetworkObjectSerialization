package org.csystem.server;

public class App {

	public static void main(String[] args) 
	{
		try (Server server = new Server()) {
			
			server.run();
		}
		catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
}