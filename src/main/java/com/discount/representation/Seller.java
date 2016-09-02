package com.discount.representation;

import java.util.List;

/**
 * Created by dino on 8/31/16.
 */
public class Seller {

    private Long id;
    private String name;
    private List<Product> products;

    public Seller() {
    }


    public Seller(Long id, String name) {

        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
