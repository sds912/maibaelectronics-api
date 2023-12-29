package sn.maiba.maibashop.infrastructure.adapter.output.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sn.maiba.maibashop.infrastructure.adapter.output.persistence.entity.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
}
