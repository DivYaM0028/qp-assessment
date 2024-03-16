package com.questionpro.qpassessment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questionpro.qpassessment.model.GroceryItem;
import com.questionpro.qpassessment.repo.ItemRepo;

@Service
public class GroceryItemService {

    @Autowired
    private ItemRepo repo;
    
    public ItemRepo getRepo() {
        return repo;
    }


    public void setRepo(ItemRepo repo) {
        this.repo = repo;
    }

    public GroceryItem addGroceryItem(GroceryItem groceryItem) {
        repo.save(groceryItem);
        System.out.println("Item Saved!!");
        return groceryItem;
    }


    public List<GroceryItem> getAllGroceryItems() {
        return repo.findAll();
    }


    public void changeGroceryItem(GroceryItem groceryItem) {
        repo.save(groceryItem);
    }


    public void removeGroceryItem(int groceryItemId) {
        repo.deleteById(groceryItemId);
    }


    public void load() {
        List<GroceryItem> groceryItems = new ArrayList<>(List.of(
            new GroceryItem(1,"Apple", 1.25, 10),
            new GroceryItem(2,"Banana", 0.75, 15),
            new GroceryItem(3,"Milk", 2.50, 5),
            new GroceryItem(4,"Bread", 1.50, 8),
            new GroceryItem(5,"Eggs", 2.00, 12)
        ));
        repo.saveAll(groceryItems);
    }


}
