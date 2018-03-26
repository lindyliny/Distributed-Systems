package activitystreamer.models;

public class User {
	private String id;
	private String name;
	private String lastName;
	private String userName;
	private String secret;
	
	
	public User(String username, String secret) {
		this.userName = username;
		this.secret = secret;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUser() {
		return userName;
	}
	public void setUser(String user) {
		this.userName = user;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + ", userName=" + userName + ", secret=" + secret
				+ "]";
	}
	
	
}
