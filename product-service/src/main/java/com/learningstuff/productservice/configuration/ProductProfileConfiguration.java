package com.learningstuff.productservice.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProductProfileConfiguration {

    @Autowired
    private Environment environment;

    public String getProductName() {
        return environment.getProperty("product.name");
    }

    public String getProductPrice() {
        return environment.getProperty("product.price");
    }

}
