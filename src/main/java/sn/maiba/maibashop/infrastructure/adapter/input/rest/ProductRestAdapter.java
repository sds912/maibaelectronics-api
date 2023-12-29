package sn.maiba.maibashop.infrastructure.adapter.input.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.maiba.maibashop.domain.model.Product;
import sn.maiba.maibashop.infrastructure.adapter.input.rest.mapper.ProductMapper;
import sn.maiba.maibashop.infrastructure.adapter.output.persistence.ProductPersistenceAdapter;

@RestController
@RequestMapping("/api/v1/products")
public class ProductRestAdapter {
    private final ProductPersistenceAdapter productPersistenceAdapter;
    private final ProductMapper productMapper;

    public ProductRestAdapter(ProductPersistenceAdapter productPersistenceAdapter, ProductMapper productMapper) {
        this.productPersistenceAdapter = productPersistenceAdapter;
        this.productMapper = productMapper;
    }

    @PostMapping(value = "/")
    sn.maiba.maibashop.infrastructure.adapter.output.persistence.entity.Product saveProduct(@RequestBody Product product){

      return   productPersistenceAdapter.save(productMapper.map(product));
    }

}
