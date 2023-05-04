package com.platzimarket.persistence;

import com.platzimarket.persistence.crud.ProductCrudRespository;
import com.platzimarket.persistence.entity.Product;

import java.util.List;

public class ProductRepository {

    private ProductCrudRespository productCrudRespository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRespository.findAll();
    }
}
