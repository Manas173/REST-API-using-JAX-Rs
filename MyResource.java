package org.manas.java.trail2;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.manas.java.trail2.service.MessageService;


@Path("/messages")
public class MyResource {

	MessageService obj =new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageResource> getIt() {
    	return obj.getAllMessages();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MessageResource receive(MessageResource add)
    {
    	return obj.addMessage(add);
    }
    
    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MessageResource remove(@PathParam("messageId") String messageId)
    {
    	return obj.removeMessage(messageId);
    }
    
    @GET
    @Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MessageResource sendmessage(@PathParam("messageId") String messageId)
	{
		return obj.getMessage(messageId);
	}
}
