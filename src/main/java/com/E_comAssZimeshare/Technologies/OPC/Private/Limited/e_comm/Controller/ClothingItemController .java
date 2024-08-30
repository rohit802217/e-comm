package com.E_comAssZimeshare.Technologies.OPC.Private.Limited.e_comm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clothing")
public class ClothingItemController {

  
    @Autowired
    private ClothingItemService clothingItemService;

    @GetMapping("/home")
    public String index(){
        return "index.html";
    }


    @GetMapping
    public List<ClothingItem> getAllClothingItems() {
        return clothingItemService.getAllClothingItems();
    }

    @GetMapping("/{id}")
    public ClothingItem getClothingItemById(@PathVariable Long id) {
        return clothingItemService.getClothingItemById(id);
    }

    @PostMapping
    public ClothingItem createClothingItem(@RequestBody ClothingItem clothingItem) {
        return clothingItemService.saveClothingItem(clothingItem);
    }

    @DeleteMapping("/{id}")
    public void deleteClothingItem(@PathVariable Long id) {
        clothingItemService.deleteClothingItem(id);
    }
}
