package org.rlam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.resteasy.reactive.RestQuery;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

@Path("/env")
public class VariableResource {

    @ConfigProperty(name = "txt.msg")
    String txt;
    @ConfigProperty(name = "db.url")
    String dbUrl;
    @ConfigProperty(name = "quarkus.custom.welcome.message")
    String customMessage;
    @ConfigProperty(name = "quarkus.java.version")
    String javaV;
    @ConfigProperty(name = "quarkus.http.port")
    String quarkusPort;

    @Inject
    Template main;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return main.data("txt", txt, "dbUrl", dbUrl, "customMessage", customMessage, "javaV", javaV, "quarkusPort", quarkusPort);
    }
}