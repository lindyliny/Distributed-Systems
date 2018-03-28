//Routes class decide what to do with the request command

package activitystreamer.util;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

import activitystreamer.models.*;

public class Routes {

	String command, jsonResponse;
	Request request;
	Gson gson = new Gson();
	private static final Logger log = LogManager.getLogger();

	
	public Routes(String data) {
		
		request = gson.fromJson(data, Request.class);

		if(Commands.contains(request.getCommand())) {
			this.command = request.getCommand();
			commandAction(request.getCommand());
		}
	}
	

	public void commandAction(String action) {
		switch (action) {
			
			case "AUTHENTICATE":
				
			case "INVALID_MESSAGE":
				
			case "AUTHENTICATION_FAIL":
				
			case "LOGIN":
				
			case "LOGIN_SUCCESS":
				
			case "LOGIN_FAILED":
				
			case "LOGOUT":
				
			case "ACTIVITY_MESSAGE":
				
			case "SERVER_ANNOUNCE":
				
			case "REDIRECT":
				
			case "REGISTER":
				User u = new User(request.getUsername(), request.getSecret());
				JsonFiles.writeUserFile(u);
				Request r = new Request("REGISTER_SUCCESS","register success for "+u.getUser());
				jsonResponse = gson.toJson(r);
				
			case "REGISTER_FAILED":
				
			case "REGISTER_SUCCESS":
				
			case "LOCK_REQUEST":
				
			case "LOCK_DENIED":
				
			case "LOCK_ALLOWED":
				
		}
	}


	public String getResponse() {
		log.info(jsonResponse);
		return jsonResponse;
	}

}
