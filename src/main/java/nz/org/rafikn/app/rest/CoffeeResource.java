package nz.org.rafikn.app.rest;

import nz.org.rafikn.app.dto.CoffeeDto;
import nz.org.rafikn.app.services.CoffeeService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by rafik on 24/09/16.
 */
@Path("/coffee")
public class CoffeeResource {

    private final CoffeeService coffeeService;

    @Inject
    public CoffeeResource(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CoffeeDto getCoffee(@PathParam("id") int coffeeId) {
        return coffeeService.getCoffeeById(coffeeId);
    }

}
