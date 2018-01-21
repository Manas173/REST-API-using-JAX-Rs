package org.manas.java.trail2;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageResource
{
	private String id;
	private int value;
	private String type;
	private String message;
	public MessageResource()
	{
		
	}
	public MessageResource(String id,int value,String type,String message)
	{
		this.id=id;
		this.value=value;
		this.type=type;
		this.message=message;
	}
	public String getId() {
		return id;
	}
	public void setId(String i) {
		this.id = i;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
