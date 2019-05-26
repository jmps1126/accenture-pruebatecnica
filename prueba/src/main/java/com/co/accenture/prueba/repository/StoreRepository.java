package com.co.accenture.prueba.repository;

import com.co.accenture.prueba.model.Store;

import java.util.List;

/**
 * Interface encargada del procesamiento de los datos
 */

public interface StoreRepository {


    /**
     * metodo encargado de consultar todas las tiendas almacenadas
     * @return
     */
    List<Store> findAllStores();


    /**
     * Metodo encargado de buscar una tienda por id de la tienda
     * @param id
     * @return
     */
    Store findStoreById(String id);

    /**
     * metodo encargado de almacenar las tiendas
     * @param listStore
     */
    void saveStore(List<Store> listStore);


    /**
     * Metodo encargado de actualizar la tienda
     * @param store
     */
    void updateStore(Store store);

    /**
     * metodo encargado de eliminar una tienda por id
     * @param id
     */
    void deleteStore(String id);


}
