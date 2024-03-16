package com.questionpro.qpassessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.questionpro.qpassessment.model.GroceryItem;
import com.questionpro.qpassessment.service.GroceryItemService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GroceryRestController {
   
    @Autowired
    private GroceryItemService service;

    @GetMapping("groceryItems")
    public List<GroceryItem> getAllGroceryItems(){
        return service.getAllGroceryItems();
    }

    @PostMapping("groceryItems/addItem")
    public List<GroceryItem> addGroceryItem(@RequestBody GroceryItem groceryItem){
        service.addGroceryItem(groceryItem);
        return service.getAllGroceryItems();
    }    

    @PutMapping("groceryItems/changeItem")
    public List<GroceryItem> changeGroceryItem(@RequestBody GroceryItem groceryItem ){
        service.changeGroceryItem(groceryItem);
        return service.getAllGroceryItems();
    }

    @DeleteMapping("groceryItem/removeItem/{groceryItemId}")
    public String removeGroceryItem(@PathVariable int groceryItemId){
        service.removeGroceryItem(groceryItemId);
        return "Grocery Item Removed!!";
    }

    @GetMapping("/")
    public String loadData(){
        service.load();    
        return "success";
    }

}
