package com.example.item.controller;
import com.example.item.model.Item;
import com.example.item.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/items")


public class ItemController {
    @Autowired
    private ItemService itemService;
    //api add new item
    @PostMapping("/add")
    public ResponseEntity<?> addItem(@RequestBody Item item) {

        if(item.getName() == null || item.getName().isEmpty())
            return ResponseEntity.badRequest().body("Item name is required!");
        if(item.getPrice() <= 0)
            return ResponseEntity.badRequest().body("Price must be greater than 0");
        if(item.getQuantity() < 1)
            return ResponseEntity.badRequest().body("Quantity must be at least 1");

        Item savedItem = itemService.addItem(item);
        return ResponseEntity.ok(savedItem);
    }

    // Get item by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getItemById(@PathVariable int id) {
        Item item = itemService.getItemById(id);
        if(item == null) return ResponseEntity.status(404).body("Item not found!");
        return ResponseEntity.ok(item);
    }

    // Get all items
    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }

}
