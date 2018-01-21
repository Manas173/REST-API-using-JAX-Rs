package org.manas.java.trail2.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.manas.java.trail2.MessageResource;
import org.manas.java.trail2.database.database;

public class MessageService {
	
	private Map<String, MessageResource> message=database.getMessages();
	public MessageService()
	{
	}
	public List<MessageResource> getAllMessages(){
	return new ArrayList<MessageResource>(message.values());
	}
	
	public MessageResource getMessage(String id) {
		return message.get(id);
	}
	public MessageResource addMessage(MessageResource messages)
	{
		message.put(messages.getId(),messages);
		return messages;
	}
	public MessageResource updateMessage(MessageResource messages)
	{
		if((messages.getId()).isEmpty())
			return null;
		message.put(messages.getId(),messages);
		return messages;
	}
	public MessageResource removeMessage(String id) {
		return message.remove(id);
	}
}
