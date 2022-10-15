package com.apex.apex.controllers;

import com.apex.apex.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController (ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String viewAll(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "view-products";
    }

}
