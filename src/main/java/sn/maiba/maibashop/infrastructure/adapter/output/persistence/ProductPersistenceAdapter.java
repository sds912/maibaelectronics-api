package sn.maiba.maibashop.infrastructure.adapter.output.persistence;

import org.springframework.stereotype.Component;
import sn.maiba.maibashop.infrastructure.adapter.output.persistence.entity.Product;
import sn.maiba.maibashop.infrastructure.adapter.output.persistence.repository.ProductRepository;

@Component
public class ProductPersistenceAdapter {
    private final ProductRepository productRepository;

    public ProductPersistenceAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

  public Product save(Product product){
        return productRepository.save(product);
   }
}
