package br.com.junim.dscommerce.controllers;

import br.com.junim.dscommerce.dto.ProductDTO;
import br.com.junim.dscommerce.entities.Product;
import br.com.junim.dscommerce.repositories.ProductRepository;
import br.com.junim.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        ProductDTO dto = service.findById(id);

        return dto;
    }
}
