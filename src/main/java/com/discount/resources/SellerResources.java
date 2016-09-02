/*
package com.discount.resources;

import com.discount.persistence.ProductDao;
//import com.discount.persistence.SellerDao;
import com.discount.representation.Product;
import com.discount.representation.Seller;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("/sellers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Component
@Transactional
public class SellerResources {
    private final SellerDao sellerDao;
    private final ProductDao productDao;

    @Inject
    public SellerResources(SellerDao sellerDao, ProductDao productDao) {
        this.sellerDao = sellerDao;
        this.productDao = productDao;
    }

    @GET
    public List<Seller> getAll() {
        return this.sellerDao.findAll();
    }

    @GET
    @Path("{id}")
    public Seller getOne(@PathParam("id") Long id) {
        Seller seller = this.sellerDao.findOne(id);

        if (seller == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
            return seller;
        }
    }

    @GET
    @Path("{id}/products")
    public Seller getSellerProducts(@PathParam("id") Long id) {

        Seller seller = this.sellerDao.findOne(id);
        if (seller == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        seller.getProducts().size();
        return seller;

    }

    @POST
    public Seller createOne(Seller seller) {

        return this.sellerDao.save(seller);
    }

    @DELETE
    @Path("{id}")
    public void deleteOne(@PathParam("id") Long id) {
        Seller seller = this.sellerDao.findOne(id);
        sellerDao.delete(seller);
    }

    @PUT
    @Path("{id}")
    public Seller updateOne(@PathParam("id") Long id, Seller seller) {
        if(sellerDao.findOne(id) == null){
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        else{
            seller.setId(id);
            return sellerDao.save(seller);
        }
    }
}




*/
