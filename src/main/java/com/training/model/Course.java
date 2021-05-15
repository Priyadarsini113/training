package com.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
  @Entity   //for jpa
public class Course {

   @Id   //for jpa
   private String courseid;
   private String coursename;
   private String coursedescription;




    public Course(String courseid,String coursename,String coursedescription)
    {
        this.courseid=courseid;
        this.coursename=coursename;
        this.coursedescription=coursedescription;
    }
    public Course()
    {

    }



    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursedescription() {
        return coursedescription;
    }

    public void setCoursedescription(String coursedescription) {
        this.coursedescription = coursedescription;
    }




}
