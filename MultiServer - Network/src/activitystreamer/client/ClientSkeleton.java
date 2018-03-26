package activitystreamer.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import activitystreamer.util.Settings;

public class ClientSkeleton extends Thread {
	private static final Logger log = LogManager.getLogger();
	private static ClientSkeleton clientSolution;
	private TextFrame textFrame;
	

	
	public static ClientSkeleton getInstance(){
		if(clientSolution==null){
			clientSolution = new ClientSkeleton();
		}
		return clientSolution;
	}
	
	public ClientSkeleton(){
		textFrame = new TextFrame();
		start();
	}
	
	
		
	@SuppressWarnings("unchecked")
	public String sendActivityObject(JSONObject activityObj){
		System.out.println("object "+activityObj.toJSONString());
		String data = null;
		Socket s = null;
		try{
			s = new Socket(Settings.getRemoteHostname(), Settings.getRemotePort());
			System.out.println("Connection Established");
			DataInputStream in = new DataInputStream( s.getInputStream());
			DataOutputStream out =new DataOutputStream( s.getOutputStream());
			System.out.println("Sending data");
			out.writeUTF(activityObj.toJSONString());
			// UTF is a string encoding see Sn. 4.4
			data = in.readUTF();
			// read a line of data from the stream
			System.out.println("Received: "+ data) ;
		}catch (UnknownHostException e) {
			System.out.println("Socket:"+e.getMessage());
		}catch (EOFException e){
			System.out.println("EOF:"+e.getMessage());
		}catch (IOException e){
			System.out.println("readline:"+e.getMessage());
		}finally {
			if(s!=null) try {
				s.close();
			}catch (IOException e){
				System.out.println("close:"+e.getMessage());
			}
		}
		return data;
	}
	
	
	public void disconnect(){
		interrupt();
		System.exit(0);
	}
	
	
	public void run(){
		System.out.println("Run thread");
		
	}

	
}
