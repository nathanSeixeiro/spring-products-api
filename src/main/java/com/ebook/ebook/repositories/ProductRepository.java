package com.ebook.ebook.repositories;

import com.ebook.ebook.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// interface que usa os metódos da jpa
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
