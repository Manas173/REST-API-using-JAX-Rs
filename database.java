package org.manas.java.trail2.database;

import java.util.HashMap;
import java.util.Map;

import org.manas.java.trail2.MessageResource;
import org.manas.java.trail2.Profiles;

public class database {
	private static Map<String, MessageResource> message = new HashMap<>();
	private static Map<String, Profiles> profile= new HashMap<>();
	
	public static Map<String, MessageResource> getMessages(){
		return message;
	
	}
}
