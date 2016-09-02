package com.discount.resources;

import com.discount.representation.Product;

import java.util.*;

/**
 * Created by dino on 8/30/16.
 */
public class ProductsCache {

    private static Map<Long, Product> productList = new HashMap<Long, Product>();
    private static Long index = 7L;

    static {
        Product product1 = new Product(1L, 1L, "nokia 3310", "KM", 500, 400);
        productList.put(1L, product1);
        Product product2 = new Product(2L, 1L, "nokia lumia", "KM", 550);
        productList.put(2L, product2);
        Product product3 = new Product(3L, 1L, "lg g2", "KM", 500, 500);
        productList.put(3L, product3);
        Product product4 = new Product(4L, 1L, "samsung s2", "KM", 700, 400);
        productList.put(4L, product4);
        Product product5 = new Product(5L, 1L, "samsung s3", "KM", 401);
        productList.put(5L, product5);
        Product product6 = new Product(6L, 1L, "huawei", "KM", 500, 500);
        productList.put(6L, product6);
        Product product7 = new Product(7L, 1L, "Sonx", "KM", 1000, 400);
        productList.put(7L, product7);
    }

    public static Product create(Product product) {
        index++;
        product.setId(index);
        if(product.getDiscountPrice() != null)
            product.setDiscountPercentage(product.getDiscountPercentage());
        productList.put(index, product);
        /*
        kada unesemo u products cache novi produkt, treba updateovati sellercache
         */
//        Seller seller = SellersCache.get(product.getSellerID());
//        //npe check
//        if(seller.getProducts() != null){
//            List<Product> products = seller.getProducts();
//            products.add(product);
//        }
//        SellersCache.update(seller.getId(), seller);

        return product;
    }

    public static Product get(Long id) {
        return productList.get(id);
    }

    public static Product update(Long id, Product product) {
        productList.put(id, product);
        return product;
    }

    public static Product delete(Long id) {
        return productList.remove(id);
    }

    public static List<Product> getAll() {

        return new ArrayList<>(productList.values());
    }
}
