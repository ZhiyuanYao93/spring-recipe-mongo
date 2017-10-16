package com.zhiyuan.springrecipe.repositories;

import com.zhiyuan.springrecipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,String>{
    Optional<UnitOfMeasure> findByDescription(String description);
}
