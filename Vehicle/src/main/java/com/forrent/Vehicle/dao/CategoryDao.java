package com.forrent.Vehicle.dao;

import com.forrent.Vehicle.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryDao extends JpaRepository<Category, Integer>{
    Category findById (int id);


}
