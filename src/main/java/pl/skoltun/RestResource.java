package pl.skoltun;

import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/hello")
public class RestResource {
    private static final Logger log = Logger.getLogger(RestResource.class);

    @GET
    @Path("/")
    public Response get() {
        log.info("Request received...");
        return Response.ok().entity("Hello world!").build();
    }
}
