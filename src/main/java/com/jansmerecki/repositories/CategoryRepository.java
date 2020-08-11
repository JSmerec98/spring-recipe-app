package com.jansmerecki.repositories;

import com.jansmerecki.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
