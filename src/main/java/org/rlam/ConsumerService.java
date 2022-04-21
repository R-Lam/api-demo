package org.rlam;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/acquisitions")
@RegisterRestClient
public interface ConsumerService {

    @GET
    List<Consumer> fetchAllConsumers();
    
}
