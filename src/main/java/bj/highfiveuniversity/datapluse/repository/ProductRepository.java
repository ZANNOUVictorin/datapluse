package bj.highfiveuniversity.datapluse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.highfiveuniversity.datapluse.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    
}
