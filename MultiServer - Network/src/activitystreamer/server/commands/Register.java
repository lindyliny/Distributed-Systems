package activitystreamer.server.commands;

import com.google.gson.Gson;

import activitystreamer.models.Commands;
import activitystreamer.models.Request;
import activitystreamer.models.User;
import activitystreamer.util.JsonFiles;

public class Register {
	private String jsonResponse;
	private Gson gson;
	
	public Register(Request request) {
		User u = new User(request.getUsername(), request.getSecret());
		JsonFiles.writeUserFile(u);
		Request r = new Request(Commands.REGISTER_SUCCESS,"register success for "+u.getUser());
		jsonResponse = gson.toJson(r);
	}

	public String getResponse() {
		return jsonResponse;
	}
}
