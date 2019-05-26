package com.co.accenture.prueba.service;

import com.co.accenture.prueba.model.Store;

import java.util.List;

/**
 * interfeca de service que realiza la declaración de los metodos utilizados para el crud y que se
 * conectan con el repositorio para obtener o procesar los datos
 */
public interface StoreService {


    /**
     * Metodo que retorna la lista completa de tiendas
     * @return
     */
    List<Store> findAllStores();

    /**
     * Metodo encargado de retornar un objeto json de la tienda que se desea buscar por id
     * @param id
     * @return
     */
    Store findStoreById(String id);

    /**
     * Metodo encargado de almacenar una tienda
     * @param listStore
     */
    void saveStore(List<Store> listStore);

    /**
     * metodo encargado de actualizar una tienda
     * @param store
     */
    void updateStore(Store store);

    /**
     * metodo encargado de eliminar una tienda
     * @param id
     */
    void deleteStore(String id);
}
