package org.acme;

import io.quarkus.cache.CacheInvalidate; // unsure if i should delete this
import io.quarkus.cache.CacheResult;     // this aswell 
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

//define the path for the resource
@Path("/labseq")
public class LabSeqResource {

    // inject the service
    @Inject
    LabSeqService service;

    // define the endpoint GET
    @GET
    // define the path for the endpoint
    @Path("/{n}")
    public int getLabSeqValue(@PathParam("n") int n) {
        // call the service to calculate the value to return to the response
        return service.calculateLabSeq(n);
    }
}
