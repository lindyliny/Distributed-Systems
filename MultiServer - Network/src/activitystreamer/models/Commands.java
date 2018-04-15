package activitystreamer.models;
	
public enum Commands {
	AUTHENTICATE, INVALID_MESSAGE, AUTHENTICATION_FAIL, LOGIN, LOGIN_SUCCESS, 
	REDIRECT, LOGIN_FAILED, LOGOUT, ACTIVITY_MESSAGE, SERVER_ANNOUNCE,
	ACTIVITY_BROADCAST, REGISTER, REGISTER_FAILED, REGISTER_SUCCESS, LOCK_REQUEST, 
	LOCK_DENIED, LOCK_ALLOWED;


	public static boolean contains(Commands commands) {
		for (Commands c : Commands.values()) {
	        if (c.name().equals(commands)) {
	            return true;
	        }
	    }
	    return false;
	}
}
	

