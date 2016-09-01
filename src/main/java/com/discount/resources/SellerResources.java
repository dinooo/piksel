package com.discount.resources;

import com.discount.representation.Product;
import com.discount.representation.Seller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dino on 8/31/16.
 */

@Path("/sellers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SellerResources {

    @GET
    public List<Seller> getAll(@QueryParam("name") String name) {
        List<Seller> sellers = SellersCache.getAll();
        if (name != null && !name.equals("")) {
            ArrayList<Seller> sellersFiltered = new ArrayList<>();
            for (Seller seller : sellers) {
                if (seller.getName().equals(name))
                    sellersFiltered.add(seller);
            }
            return sellersFiltered;
        }
        return sellers;
    }

    @GET
    @Path("{id}")
    public Seller getOne(@PathParam("id") Long id) {
        if (id == 888) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
            return SellersCache.get(id);
        }
    }

    @POST
    public Seller createOne(Seller seller) {
        SellersCache.create(seller);
        return seller;
    }

    @DELETE
    @Path("{id}")
    public Seller deleteOne(@PathParam("id") Long id) {
        return SellersCache.delete(id);
    }

    @PUT
    @Path("{id}")
    public Seller updateOne(@PathParam("id") Long id, Seller seller) {
        return SellersCache.update(id, seller);
    }
}




