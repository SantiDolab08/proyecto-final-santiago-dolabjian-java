package Coderhouse.proyectofinalsantiagodolabjian.repository;


import Coderhouse.proyectofinalsantiagodolabjian.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
