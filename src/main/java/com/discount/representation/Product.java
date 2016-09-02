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
    private Double discountPrice;
    private Double discountPercentage;

    public Product() {
    }

    public double getDiscountPercentage() {
        if(this.getDiscountPrice() != null)
            return ((this.getDiscountPrice() / this.getRegularPrice()) * 100);
        else
            return 0;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Product(Long id, Long idSeller, String name, String currency, double regularPrice, double discountedPrice) {
        this.id = id;
        this.idSeller = idSeller;
        this.name = name;
        this.currency = currency;
        this.regularPrice = regularPrice;
        this.discountPrice = discountedPrice;
        this.discountPercentage = null;
    }

    public Product(Long id, Long idSeller, String name, String currency, double regularPrice) {
        this.id = id;
        this.idSeller = idSeller;
        this.name = name;
        this.currency = currency;
        this.regularPrice = regularPrice;
        this.discountPrice = null;
        this.discountPercentage = null;
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

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
