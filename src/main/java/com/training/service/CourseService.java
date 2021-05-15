package com.training.service;

import com.training.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.model.Course;

//import java.util.Arrays;
import java.util.*;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

   /* List<Course> courses = new ArrayList<>(Arrays.asList(


            new Course("01", "java", "course java fundamentals"),
            new Course("02", "react", "course react ui development"),
            new Course("03", "node", "course node api development")
    ));*/
    //Fetch all courses

  /*  public List<Course> getAllCourses()

    {
        return this.courses;
    }*/

    public List<Course> getAllCourses()
    {
        return courseRepository.findAll();
    }

    //add new course

    /*  public String addNewCourse(Course course) {
          this.courses.add(course);
          return "added course successfully";
      }*/
    public String addNewCourse(Course course) {
        courseRepository.save(course);
        return "added course successfully with id: " + course.getCourseid();
    }


    //update existing course

    /* public void updateCourse(String id, Course course) {
         for (int i = 0; i < this.courses.size(); i++) {
             Course course1=this.courses.get(i);
             if(course1.getCourseid().equals(id))
             {
                 this.courses.set(i,course);
                 return;
             }
         }
     }*/
    public void updateCourse(String id, Course course) {
        Optional<Course> c = courseRepository.findById(id);
        if (!c.isEmpty()) {
            course.setCourseid(id);
            courseRepository.save(course);
        }
    }


    //delete a course

    /* public String deleteCourse(String id)
     {
         this.courses.removeIf(course->course.getCourseid().equals(id));
         return "remove data successfully";
     }*/
    public String deleteCourse(String id) {
        this.courseRepository.deleteById(id);
        return "id deleted :" + id;
    }


}










