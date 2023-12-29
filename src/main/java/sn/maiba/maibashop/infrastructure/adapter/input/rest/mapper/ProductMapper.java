package sn.maiba.maibashop.infrastructure.adapter.input.rest.mapper;

import sn.maiba.maibashop.domain.model.Product;

public class ProductMapper {

    public sn.maiba.maibashop.infrastructure.adapter.output.persistence.entity.Product map(Product product){
        sn.maiba.maibashop.infrastructure.adapter.output.persistence.entity.Product product1 = new sn.maiba.maibashop.infrastructure.adapter.output.persistence.entity.Product();
        product1.setDescription(product.getDescription());
        product1.setId(product.getId());
        product1.setName(product.getName());
        product1.setPrice(product.getPrice());
        return product1;
    }
}
