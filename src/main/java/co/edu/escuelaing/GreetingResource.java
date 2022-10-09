package co.edu.escuelaing;

import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello RESTEasy";
    }

    /**
     * @param name
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("custom/{name}")
    public String customHello(@PathParam("name") String name) {
        return "Hello RESTEasy: " + name;
    }
}