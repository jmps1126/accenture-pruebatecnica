package com.co.accenture.prueba.repository.impl;

import com.co.accenture.prueba.model.Store;
import com.co.accenture.prueba.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StoreRepositoryImpl  implements StoreRepository {

    @Autowired
    private final MongoOperations mongoOperations;


    public StoreRepositoryImpl(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }


    @Override
    public List<Store> findAllStores() {
        List<Store> listStores = this.mongoOperations.find(new Query(), Store.class);

        return listStores;
    }

    @Override
    public Store findStoreById(String id) {
        Store store = this.mongoOperations.findOne(new Query(Criteria.where("id").is(id)), Store.class);

        return store;
    }

    @Override
    public void saveStore(List<Store> store) {
        this.mongoOperations.insertAll(store);
    }

    @Override
    public void updateStore(Store store) {
        this.mongoOperations.save(store);
    }

    @Override
    public void deleteStore(String id) {
        this.mongoOperations.findAndRemove(new Query(Criteria.where("id").is(id)), Store.class);
    }
}
