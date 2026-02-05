package com.example.item.service;
import com.example.item.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ItemService {
    //arraylist
    private List<Item> itemList=new ArrayList<>();
    // add item
    public Item addItem(Item item){
        itemList.add(item);
        return item;

    }
    //get item
    public Item getItemById(int id){
        for(Item item :itemList){
            if(item.getId()== id){
                return item;

            }
        }

        return null;
    }
    public List<Item> getAllItems() {
        return itemList;
    }

}
