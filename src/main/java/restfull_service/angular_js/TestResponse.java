package restfull_service.angular_js;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/test")
public class TestResponse
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response test()
	{
		return Response.status(Status.OK).entity("Hellow world!").build();
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response testPost(String msg)
	{
		System.out.println(msg);
		return Response.status(Status.OK).entity(msg).build();
	}
}
