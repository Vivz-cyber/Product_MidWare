package com.example.Product_Midware.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Product_Midware.DTO.ProductDto;

@Service
public class ProductProxyService {
    @Value("${jpa.url}")
    private String jpaUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public ProductDto register(ProductDto dto) {
        String url = jpaUrl + "/product";
        return restTemplate.postForObject(url, dto, ProductDto.class);
    }

    public ProductDto fetch(String name) {
        String url = jpaUrl + "/product/" + name;
        return restTemplate.getForObject(url, ProductDto.class);
    }
}
