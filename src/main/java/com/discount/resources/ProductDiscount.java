package com.discount.resources;

import com.discount.representation.Product;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dino on 9/1/16.
 */
@Path("/products/discounts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductDiscount {

    @GET
    public List<Product> getAllDiscountedProducts() {
        List<Product> productsDiscount = new ArrayList<>();
        for (Product product : ProductsCache.getAll()) {
            //make sure this will work
            if (product.getDiscountPrice() != null && product.getRegularPrice() > product.getDiscountPrice()) {
                //avoid code duplication
                product.setDiscountPercentage(product.getDiscountPercentage());
                productsDiscount.add(product);
            }
        }
        return productsDiscount;
    }
}
