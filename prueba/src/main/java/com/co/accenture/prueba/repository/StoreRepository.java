package com.co.accenture.prueba.repository;

import com.co.accenture.prueba.model.Store;

import java.util.List;

public interface StoreRepository {


    List<Store> findAllStores();

    Store findStoreById(String id);

    void saveStore(List<Store> listStore);

    void updateStore(Store store);

    void deleteStore(String id);


}
