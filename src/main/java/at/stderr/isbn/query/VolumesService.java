package at.stderr.isbn.query;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/volumes")
@RegisterRestClient
public interface VolumesService {

    Volume getById(@QueryParam("isbn") String isbn);
}
