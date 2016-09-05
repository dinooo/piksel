package com.discount.resources;

import com.discount.representation.Product;
//import com.discount.representation.Seller;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import com.discount.persistence.ProductDao;


import javax.inject.Inject;
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
@Transactional
public class ProductResources {
    private ProductDao productDao;

    @Inject
    public ProductResources(ProductDao productDao){
        this.productDao = productDao;
    }

    @GET
    public List<Product> getAll() {
        return productDao.findAll();
    }

    @GET
    @Path("{id}")
    public Product getOne(@PathParam("id") Long id) {
        if (id == 888) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
            return this.productDao.findOne(id);
        }
    }

    @POST
    public Product createOne(Product product) {
        return this.productDao.save(product);
    }

    @DELETE
    @Path("{id}")
    public void deleteOne(@PathParam("id") Long id) {
        Product product = this.productDao.findOne(id);
        this.productDao.delete(product);
    }

    @PUT
    @Path("{id}")
    public Product updateOne(@PathParam("id") Long id, Product product) {
        if(productDao.findOne(id) == null){
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        else{
            product.setId(id);
            return productDao.save(product);
        }
    }
}
