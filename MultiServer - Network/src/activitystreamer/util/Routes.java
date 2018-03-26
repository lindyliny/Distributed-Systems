//Routes class decide what to do with the request command

package activitystreamer.util;

import com.google.gson.Gson;

import activitystreamer.models.*;

public class Routes {

	//Commands command;
	Request request;
	Gson gson = new Gson();
	
	public Routes(String data) {
		
		request = gson.fromJson(data, Request.class);

		if(Commands.contains(request.getCommand())) {
			commandAction(request.getCommand());
		}
	}
	

	private void commandAction(String action) {
		switch (action) {
			case "REGISTER":
				User u = new User(request.getUsername(), request.getSecret());
				JsonFiles.writeUserFile(u);
		}
	}

}
