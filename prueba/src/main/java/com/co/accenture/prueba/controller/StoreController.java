package com.co.accenture.prueba.controller;

import com.co.accenture.prueba.model.Status;
import com.co.accenture.prueba.model.Store;
import com.co.accenture.prueba.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Clase que se encarga del direccionamiento de los servicios y los valores de retorno del mismo
 */

@RestController
@RequestMapping("store")
public class StoreController {

    //Códigos de error o success
    private static final int ERROR = -1;
    private static final int SUCCES = 0;

    @Autowired
    private StoreService storeService;

    /**
     * Metodo encargado de buscar todas las tiendas almacenas en el sistema
     *
     * @return List<Store>
     */
    @RequestMapping(value = "getAllStores", method = RequestMethod.GET)
    public ResponseEntity<List<Store>> getAllStores() {
        return ResponseEntity.ok(storeService.findAllStores());
    }

    /**
     * Metodo encargado de buscar una tienda almacena por el id de la tienda
     *
     * @param id
     * @return store
     */
    @RequestMapping(value = "getStoreById/{id}", method = RequestMethod.GET)
    public ResponseEntity<Store> getStoreById(@PathVariable("id") String id) {
        Store store;
        try {
            store = storeService.findStoreById(id);
        } catch (Exception e) {
            store = null;
        }

        return ResponseEntity.ok(store);
    }

    /**
     * Metodo encargado almacenar una tienda o varias si lo desea
     *
     * @param listStore
     * @return
     */
    @RequestMapping(value = "saveStore", method = RequestMethod.POST)
    public ResponseEntity<Void> saveStore(@RequestBody @Valid List<Store> listStore) {
        storeService.saveStore(listStore);

        return ResponseEntity.noContent().build();
    }

    /**
     * Metodo encargado de actualizar una tienda en especifico
     *
     * @param store
     * @return
     */
    @RequestMapping(value = "updateStore", method = RequestMethod.POST)
    public ResponseEntity<Void> updateStore(@RequestBody @Valid Store store) {

        storeService.updateStore(store);

        return ResponseEntity.noContent().build();
    }

    /**
     * Metodo encargado de eliminar una tiena en especifico
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "deleteStore/{id}", method = RequestMethod.POST)
    public ResponseEntity<Void> deleteStore(@PathVariable("id") String id) {

        storeService.deleteStore(id);

        return ResponseEntity.noContent().build();
    }


}
