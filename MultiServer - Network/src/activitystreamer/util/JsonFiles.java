package activitystreamer.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import activitystreamer.models.User;


public class JsonFiles {
	public static void writeUserFile(User u) {
		
		Gson gson = new Gson();
		//User u = gson.fromJson(data, User.class);
		
		try (Writer writer = new FileWriter("Users.json")) {
		    gson = new GsonBuilder().setPrettyPrinting().create();
		    gson.toJson(u, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
