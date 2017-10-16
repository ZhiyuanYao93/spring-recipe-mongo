package com.zhiyuan.springrecipe.repositories;

import com.zhiyuan.springrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,String> {
    Optional<Category> findByDescription(String description);
}
