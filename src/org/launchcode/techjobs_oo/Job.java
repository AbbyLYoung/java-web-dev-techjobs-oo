package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        int count = 0;
        if(name == "" || name == null ){
            name = "Data not available";
            count++;
        }
        if(employer.getValue() == "" || employer.getValue() == null ){
            employer = new Employer("Data not available");
            count++;
        }
        if(location.getValue() == "" || location.getValue() == null ){
            location = new Location("Data not available");
            count++;
        }
        if(positionType.getValue() == "" || positionType.getValue() == null ){
            positionType = new PositionType("Data not available");
            count++;
        }
        if(coreCompetency.getValue() == "" || coreCompetency.getValue() == null ){
            coreCompetency = new CoreCompetency("Data not available");
            count++;
        }

        return  "\n ID = " + id +
                "\n Name = " + name +
                "\n Employer = " + employer +
                "\n Location = " + location +
                "\n PositionType = " + positionType +
                "\n CoreCompetency = " + coreCompetency +
                '\n';
    }




    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public Integer getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public void setName(String aName) {

        this.name = aName;
    }

    public Employer getEmployer() {

        return employer;
    }

    public void setEmployer(Employer aEmployer) {
        this.employer = aEmployer;
    }

    public Location getLocation() {

        return location;
    }

    public void setLocation(Location aLocation) {

        this.location = aLocation;
    }

    public PositionType getPositionType() {

        return positionType;
    }

    public void setPositionType(PositionType aPositionType) {

        this.positionType = aPositionType;
    }

    public CoreCompetency getCoreCompetency() {

        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency aCoreCompetency) {

        this.coreCompetency = aCoreCompetency;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
