package com.guardanthealth.core.io.persist;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public abstract class AbstractMongoDbDao {

    private Datastore datastore;

    public void start() {
        // Initialize the MongoClient with the correct connection string
        MongoClient mongoClient = new MongoClient("localhost", 27017);  // MongoDB should be running locally
        Morphia morphia = new Morphia();
        
        // Get the database with the name "testdb"
        MongoDatabase database = mongoClient.getDatabase("testdb"); // This sets the db name as "testdb"
        
        if (database == null) {
            throw new RuntimeException("Failed to connect to MongoDB database 'testdb'");
        }

        // Create the Datastore for the connection
        datastore = morphia.createDatastore(mongoClient, "testdb");  // Use "testdb" explicitly
        
        // Ensure indexes are created
        datastore.ensureIndexes();
    }

    public Datastore getDatastore() {
        return datastore;
    }
}
