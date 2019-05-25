package com.co.accenture.prueba.service.impl;

import com.co.accenture.prueba.model.Store;
import com.co.accenture.prueba.repository.StoreRepository;
import com.co.accenture.prueba.service.StoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StoreService")
public class StoreServiceImpl implements StoreService {

    private StoreRepository storeRepository;

    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public List<Store> findAllStores() {
        List<Store> listStore = storeRepository.findAllStores();
        return listStore;
    }

    @Override
    public Store findStoreById(String id) {
        Store store = storeRepository.findStoreById(id);

        return store;
    }

    @Override
    public void saveStore(List<Store> listStore) {

        storeRepository.saveStore(listStore);

    }

    @Override
    public void updateStore(Store store) {
        storeRepository.updateStore(store);
    }

    @Override
    public void deleteStore(String id) {
        storeRepository.deleteStore(id);
    }
}
