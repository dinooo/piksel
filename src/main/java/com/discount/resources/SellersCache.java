package com.discount.resources;

import com.discount.representation.Product;
import com.discount.representation.Seller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by dino on 8/31/16.
 */
public class SellersCache {

    private static Map<Long, Seller> sellerList = new HashMap<Long, Seller>();
    private static Long index = 1L;


    static {
        List<Product> products = ProductsCache.getAll();

        Seller seller = new Seller(1L, "Mobis", products);

        sellerList.put(1L, seller);
    }



    public static Seller create(Seller seller){
        index++;
        seller.setId(index);
        sellerList.put(index, seller);
        return seller;
    }


    public static Seller get(Long id) {
        return sellerList.get(id);
    }

    public static Seller update(Long id, Seller seller) {
        sellerList.put(id, seller);
        return seller;
    }

    public static Seller delete(Long id) {
        return sellerList.remove(id);
    }

    public static List<Seller> getAll(){

        return new ArrayList<>(sellerList.values());
    }
}
