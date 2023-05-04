package com.platzimarket.persistence.crud;

import com.platzimarket.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRespository extends CrudRepository<Product, Long> {
}
