package com.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class StudentCourse {

    @Id
    private String id;
    private String name;
    private ArrayList<String> studentslist;
    private ArrayList<String> instructorslist;

    public StudentCourse(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentCourse() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getStudentslist() {
        return studentslist;
    }

    public void setStudentslist(ArrayList<String> studentslist) {
        this.studentslist = studentslist;
    }

    public ArrayList<String> getInstructorslist() {
        return instructorslist;
    }

    public void setInstructorslist(ArrayList<String> instructorslist) {
        this.instructorslist = instructorslist;
    }
}












