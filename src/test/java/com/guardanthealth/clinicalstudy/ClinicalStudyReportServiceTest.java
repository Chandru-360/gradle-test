package com.guardanthealth.clinicalstudy;

import com.guardanthealth.core.io.persist.PersistService;
import org.mockito.Mockito;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClinicalStudyReportServiceTest {

    private PersistService persistService;

   @BeforeSuite
public void beforeSuite() {
    // Create a mock PersistService
    persistService = Mockito.mock(PersistService.class);

    // Log the persistService object to verify it's initialized
    if (persistService == null) {
        throw new RuntimeException("Initialization error: PersistService is null!");
    }

    System.out.println("PersistService initialized successfully: " + persistService);
}

    @Test
    public void testSomething() {
        // Test logic with the mock PersistService
        System.out.println("Running test...");

        // Example: Call save method (it won't actually do anything)
        persistService.save("Test entity");

        // Example: Call findById method (returns mock data)
        Object result = persistService.findById("123");
        System.out.println("Find result: " + result);
    }
}
