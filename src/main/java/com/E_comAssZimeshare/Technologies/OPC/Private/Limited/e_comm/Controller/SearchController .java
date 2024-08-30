package com.E_comAssZimeshare.Technologies.OPC.Private.Limited.e_comm.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    @GetMapping("/api/search")
    public List<ClothingItem> searchItems(@RequestParam String q) {
        // Simulate a database search
        List<ClothingItem> allItems = getAllItems();
        List<ClothingItem> filteredItems = new ArrayList<>();

        for (ClothingItem item : allItems) {
            if (item.getName().toLowerCase().contains(q.toLowerCase())) {
                filteredItems.add(item);
            }
        }

        return filteredItems;
    }

    private List<ClothingItem> getAllItems() {
        List<ClothingItem> items = new ArrayList<>();
        items.add(new ClothingItem(1, "Red T-Shirt", "A vibrant red t-shirt.", 80));
        items.add(new ClothingItem(2, "Blue Jeans", "Classic blue jeans.", 39));
        items.add(new ClothingItem(3, "Black Jacket", "Stylish black jacket.", 599));
        // Add more items as needed
        return items;
    }

     
}
