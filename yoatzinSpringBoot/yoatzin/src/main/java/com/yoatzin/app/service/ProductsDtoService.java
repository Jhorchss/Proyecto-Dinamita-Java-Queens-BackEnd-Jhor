package com.yoatzin.app.service;

import com.yoatzin.app.dto.ProductsDto;
import com.yoatzin.app.model.Products;

public interface ProductsDtoService {
	
	ProductsDto createProducts(Products products);
	ProductsDto getProductsById(Long id);
	ProductsDto getProductsByname(String name);
	ProductsDto getProductsByCategory(String category);
	ProductsDto getProductsByOrigin(String origin);
	ProductsDto getProductsByStock(int stock);
	ProductsDto updateProducts(Products products, Long id);
	void deleteProducts(Long id);
	

}
