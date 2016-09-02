package com.discount.persistence;

/**
 * Created by dino on 9/2/16.
 */

import com.discount.representation.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductDao extends JpaRepository<Product, Long> {
}
