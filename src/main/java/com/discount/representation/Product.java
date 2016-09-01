package com.discount.representation;

/**
 * Created by dino on 8/30/16.
 */
public class Product {
    private Long id;
    private Long idSeller;
    private String name;
    private String currency;
    private double regularPrice;
    //make object
    private double discountPrice;
    private double discountPercentage;

    public Product() {
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Product(Long id, Long idSeller, String name, String currency, double regularPrice, double discountPrice) {
        this.id = id;
        this.idSeller = idSeller;
        this.name = name;
        this.currency = currency;
        this.regularPrice = regularPrice;
        this.discountPrice = discountPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Long idSeller) {
        this.idSeller = idSeller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
