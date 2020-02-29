package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;


import org.launchcode.techjobs_oo.*;

import javax.naming.Name;

import static org.junit.Assert.*;

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
        testJob5 = new Job(  "Product tester 1", new Employer(), new Location(""), new PositionType("Door Greeter"), new CoreCompetency("Greeting"));
        }

    @Test
    public void testSettingJobId(){
        assertEquals(testJob1.getId(), testJob2.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(testJob3.getId()instanceof Integer);
        assertNotNull(testJob5.getId());
        assertTrue(testJob3.getName() instanceof String);
        assertEquals(testJob3.getName(), "Product tester");
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertEquals(testJob3.getEmployer().getValue(), "ACME");
        assertTrue(testJob3.getLocation() instanceof Location);
        assertEquals(testJob3.getLocation().getValue(), "Desert");
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertEquals(testJob3.getPositionType().getValue(), "Quality control");
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(testJob4.getId() == testJob5.getId());
    }

    @Test
    public void testJobNewLines() {
        assertTrue(testJob3.toString().startsWith("\n"));
        assertTrue(testJob3.toString().endsWith("\n"));
        //System.out.println(testJob5.toString());
    }

    @Test
    public void testJobToStringLabels(){
            assertTrue(testJob5.toString().contains("\n ID = " + testJob5.getId()));
            assertTrue(testJob5.toString().contains("\n Name = " + testJob5.getName()));
            assertTrue(testJob5.toString().contains("\n Employer = " + testJob5.getEmployer()));
            assertTrue(testJob5.toString().contains("\n Location = " + testJob5.getLocation()));
            assertTrue(testJob5.toString().contains("\n PositionType = " + testJob5.getPositionType()));
            assertTrue(testJob5.toString().contains("\n CoreCompetency = " + testJob5.getCoreCompetency()));

    }
    @Test
    public void testEmptyJobFields() {
        assertTrue(testJob5.toString().contains("Data not available"));
        System.out.println(testJob5.toString());
    }


    





}
