package com.thiagobarbosa;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;

@Path("/unipds")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class UniPDSResource {

    private int i = 0;

    @GET
    public int get() {
        return i;
    }

    @GET
    @Path(("getIDiferentao"))
    public int getIdeferentao() {
        return LocalDateTime.now().getNano();
    }

    @POST
    public void addI() {
        i++;
    }

    @DELETE
    public void removeI() {
        i--;
    }

    @PUT
    public void setI(int i) {
        this.i = i;
    }
}
