package com.discount.resources;

import com.discount.representation.Product;
import com.discount.representation.Seller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by dino on 8/30/16.
 */

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResources {

    @GET
    public List<Product> getAll(@QueryParam("price") Double price) {
        List<Product> products = ProductsCache.getAll();
        if (price != null && price > 0 ) {
            ArrayList<Product> productsFiltered = new ArrayList<>();
            for (Product prod : products) {
                if(prod.getRegularPrice() == price)
                    productsFiltered.add(prod);
            }

            return productsFiltered;

        }
        return products;
    }

    @GET
    @Path("{id}")
    public Product getOne(@PathParam("id") Long id) {
        if (id == 888) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
            return ProductsCache.get(id);
        }
    }

    @POST
    public Product createOne(Product product) {
        ProductsCache.create(product);
        return product;
    }

    @DELETE
    @Path("{id}")
    public Product deleteOne(@PathParam("id") Long id) {
        return ProductsCache.delete(id);
    }

    @PUT
    @Path("{id}")
    public Product updateOne(@PathParam("id") Long id, Product product) {
        return ProductsCache.update(id, product);
    }


}
