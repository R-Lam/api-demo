package org.rlam;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api")
public class SimpleResource {

    private Set<Simple> simple = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public SimpleResource() {
        simple.add(new Simple("acquisition-01-ab345df","Successful"));
        simple.add(new Simple("acquisition-02-c5g88l0","Failed"));
    }

    @GET
    @Path("/acquisitions")
    public Set<Simple> list() {
        return simple;
    }
    
}
