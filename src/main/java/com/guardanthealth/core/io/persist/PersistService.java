package com.guardanthealth.core.io.persist;

public interface PersistService {
    void save(Object entity);
    Object findById(String id);
} 
