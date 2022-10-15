package com.apex.apex.services;

import com.apex.apex.jpa.Product;

import java.util.Collection;

public interface ProductService {

    Collection<Product> getProducts();
    Product addProduct(Product product);
}
