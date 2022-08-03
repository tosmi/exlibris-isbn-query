package at.stderr.isbn.query;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/isbn")
public class VolumesResource {
    @Inject
    @RestClient
    VolumesService volumesService;

    @GET
    @Path("/isbn/{isbn}")
    public Volume isbn(@PathParam String isbn) {
        return volumesService.getById(isbn);
    }
}
