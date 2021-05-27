package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(){
        this.id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(!(obj instanceof JobField))
            return false;

        JobField that = (JobField) obj;
        return id == that.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    public int getId(){
        return id;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }
}
