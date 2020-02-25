package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job testJob1;
    Job testJob2;
    Job testJob3;
    Job testJob4;
    Job testJob5;



    @Before
    public void init() {
        testJob1 = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob4 = new Job("Product tester 1", new Employer("Wal-mart"), new Location("Ocean"), new PositionType("Door Greeter"), new CoreCompetency("Greeting"));
        testJob5 = new Job("Product tester 2", new Employer("Target"), new Location("Mountain"), new PositionType("Customer Service"), new CoreCompetency("Patience"));
        }

    @Test
    public void testSettingJobId(){
        assertEquals(testJob1.getId(), testJob2.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(testJob3.getEmployer(), testJob2.getEmployer());
        assertEquals(testJob3.getLocation(), testJob2.getLocation());
        assertEquals(testJob3.getPositionType(), testJob2.getPositionType());
        assertEquals(testJob3.getCoreCompetency(), testJob2.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(testJob4.getId() == testJob5.getId());

    }

}
