package com.discount.resources;

import com.discount.representation.Product;
import com.discount.representation.Seller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("/sellers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SellerResources {

    @GET
    public List<Seller> getAll() {
        return SellersCache.getAll();
    }

    @GET
    @Path("{id}")
    public Seller getOne(@PathParam("id") Long id) {
        Seller seller = SellersCache.get(id);

        if (seller == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
            return seller;
        }
    }

    @GET
    @Path("{id}/products")
    public List<Product> getSellerProducts(@PathParam("id") Long id) {
        List<Product> products = new ArrayList<>();
        for (Product product : ProductsCache.getAll()) {
            if (product.getIdSeller() == id)
                products.add(product);
        }
        if (products == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
            return products;
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




