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

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType,
               CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
        String empty = "Data unavailable";
        boolean flagId = true;
        String name;
        String employer;
        String location;
        String positionType;
        String coreCompetency;

        if (this.name != null && !this.name.isBlank()) {
            name = this.name;
            flagId = false;
        } else {
            name = empty;
        }
        if (this.employer != null && !this.employer.getValue().isBlank()) {
            employer = this.employer.toString();
            flagId = false;
        } else {
            employer = empty;
        }
        if (this.location != null && !this.location.getValue().isBlank()) {
            location = this.location.toString();
            flagId = false;
        } else {
            location = empty;
        }
        if (this.positionType != null && !this.positionType.getValue().isBlank()) {
            positionType = this.positionType.toString();
            flagId = false;
        } else {
            positionType = empty;
        }
        if (this.coreCompetency != null && !this.coreCompetency.getValue().isBlank()) {
            coreCompetency = this.coreCompetency.toString();
            flagId = false;
        } else {
            coreCompetency = empty;
        }
        if (flagId) {
            return "\nID: " + id + "Could not be found!!!.\n\n";
        } else {
            return ("\nID: " + id + "\nName: " + name +
                    "\nEmployer: " + employer + "\nLocation: " +
                    location + "\nPosition Type: " + positionType +
                    "\nCore Competency: " + coreCompetency + "\n\n");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Job job = (Job) obj;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}


