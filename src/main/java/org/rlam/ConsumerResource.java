package org.rlam;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/v1/acquisitions")
public class ConsumerResource {

    @Inject
    @RestClient
    ConsumerService consumerService;

    @GET
    @Path("/consume")
    public List<Consumer> fetchAllConsumer() {
        return consumerService.fetchAllConsumers();
    }
    
}
