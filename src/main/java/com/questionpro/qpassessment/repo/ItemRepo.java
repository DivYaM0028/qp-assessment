package com.questionpro.qpassessment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questionpro.qpassessment.model.GroceryItem;

@Repository
public interface ItemRepo extends JpaRepository<GroceryItem,Integer> {


}
