//Routes class decide what to do with the request command

package activitystreamer.server;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

import activitystreamer.models.*;
import activitystreamer.server.commands.*;

public class Routes {

	private String jsonResponse;
	private Request request;
	private Gson gson = new Gson();
	private static final Logger log = LogManager.getLogger();

	
	public Routes(String data) {
		
		request = gson.fromJson(data, Request.class);

		if(Commands.contains(request.getCommand())) {
			commandAction(request.getCommand());
		}
	}
	

	public void commandAction(Commands commands) {
		switch (commands) {
			
		case AUTHENTICATE:
			Authenticate auth = new Authenticate(request);
			jsonResponse = auth.getResponse();
			break;
		case LOGIN:
			Login login = new Login(request);
			jsonResponse = login.getResponse();
			break;
		case LOGOUT:
			Logout logout = new Logout(request);
			jsonResponse = logout.getResponse();
			break;
		case ACTIVITY_MESSAGE:
			ActivityMessage actMess = new ActivityMessage(request);
			jsonResponse = actMess.getResponse();
			break;
		case SERVER_ANNOUNCE:
			ServerAnnounce serverAnno = new ServerAnnounce(request);
			jsonResponse = serverAnno.getResponse();
			break;
		case REDIRECT:
			Redirect redirect = new Redirect(request);
			jsonResponse = redirect.getResponse();
			break;
		case REGISTER:
			Register reg = new Register(request);
			jsonResponse = reg.getResponse();
			break;
		case LOCK_REQUEST:
			Lock lock = new Lock (request);
			jsonResponse = lock.getResponse();
			break;
		case ACTIVITY_BROADCAST:
			ActivityBroadcast actBroad = new ActivityBroadcast(request);
			jsonResponse = actBroad.getResponse();
			break;
		default:
			break;
				
		}
	}


	public String getResponse() {
		log.info(jsonResponse);
		return jsonResponse;
	}

}
