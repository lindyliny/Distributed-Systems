package activitystreamer.models;

public class Request {

	Commands command;
	String secret;
	String info;
	String username;
	String hostname;
	String activity; 
	transient int id;
	transient int load;
	transient int port;
	
	
	public Request(Commands command, String info) {
		this.command = command;
		this.info = info;
	}
	public Commands getCommand() {
		return command;
	}
	public void setCommand(Commands command) {
		this.command = command;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLoad() {
		return load;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
