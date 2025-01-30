package com.guardanthealth.core.io.persist;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public abstract class AbstractMongoDbDao {

    private Datastore datastore;

    public void start() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        Morphia morphia = new Morphia();
        
        // This line causes the error because databaseName is null
        MongoDatabase database = mongoClient.getDatabase(null); // <-- Error here
        
        datastore = morphia.createDatastore(mongoClient, database.getName());
        datastore.ensureIndexes();
    }

    public Datastore getDatastore() {
        return datastore;
    }
} 
