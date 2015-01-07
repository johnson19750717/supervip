package com.askinsight.shoppingguide.vip.repository;

import com.askinsight.shoppingguide.vip.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Johnson on 2015/1/7.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
