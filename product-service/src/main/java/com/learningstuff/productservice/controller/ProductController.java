package com.learningstuff.productservice.controller;


import com.learningstuff.productservice.configuration.ProductProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductProfileConfiguration productProfileConfiguration;


    @GetMapping(value = "product-profile-config")
    public ProductProfileConfiguration product() {
        return productProfileConfiguration;
    }

}
