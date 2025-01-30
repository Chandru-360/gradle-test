package com.guardanthealth.clinicalstudy;

import com.google.inject.Inject;
import com.guardanthealth.core.io.persist.PersistService;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClinicalStudyReportServiceTest {

    @Inject
    private PersistService persistService; // Injected dependency

    @BeforeSuite
    public void beforeSuite() {
        // Initialize services (this is where the error occurs)
        if (persistService == null) {
            throw new RuntimeException("Initialization error!");
        }
    }

    @Test
    public void testSomething() {
        // Test logic here
    }
} 
