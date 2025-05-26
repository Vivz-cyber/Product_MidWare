package com.example.Product_Midware.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product_Midware.DTO.ProductDto;
import com.example.Product_Midware.Service.ProductProxyService;

@RestController
@RequestMapping("/api/products")
public class ProductProxyController {
    @Autowired
    private ProductProxyService service;

    @PostMapping
    public ResponseEntity<ProductDto> register(@RequestBody ProductDto dto) {
        return ResponseEntity.ok(service.register(dto));
    }

    @GetMapping("/{name}")
    public ResponseEntity<ProductDto> fetch(@PathVariable String name) {
        return ResponseEntity.ok(service.fetch(name));
    }

}
