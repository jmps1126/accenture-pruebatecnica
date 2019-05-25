package com.co.accenture.prueba.controller;

import com.co.accenture.prueba.model.Store;
import com.co.accenture.prueba.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @RequestMapping(value = "getAllStores", method = RequestMethod.GET)
    public ResponseEntity<List<Store>> getAllStores(){
        return ResponseEntity.ok(storeService.findAllStores());
    }

    @RequestMapping(value = "getStoreById/{id}", method = RequestMethod.GET)
    public ResponseEntity<Store> getStoreById(@PathVariable("id") String id){
        Store store;
        try{
            store = storeService.findStoreById(id);
        }catch (Exception e){
            store = null;
        }

        return ResponseEntity.ok(store);
    }

    @RequestMapping(value = "saveStore", method = RequestMethod.POST)
    public ResponseEntity<Void> saveStore (@RequestBody @Valid List<Store> listStore){
        storeService.saveStore(listStore);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "updateStore", method = RequestMethod.POST)
    public ResponseEntity<Void> updateStore (@RequestBody @Valid Store store){
        storeService.updateStore(store);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "deleteStore/{id}", method = RequestMethod.POST)
    public ResponseEntity<Void> deleteStore (@PathVariable("id") String id){
        storeService.deleteStore(id);
        return ResponseEntity.noContent().build();
    }


}
