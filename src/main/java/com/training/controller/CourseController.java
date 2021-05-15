package com.training.controller;
import com.training.model.Course;
import com.training.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

   @Autowired
    private CourseService courseService;


   @Value("${message}")
   private String message;

   @GetMapping(value="/info")
   public String getInfo()
   {
       return message;
   }



   //get all courses
    @GetMapping(value="/all")
    public List<Course> getAll()
    {
     return this.courseService.getAllCourses();
    }

    //add a new course

    @PostMapping(value="/add")
    public String addCourse(@RequestBody Course course)
    {
      return this.courseService.addNewCourse(course);
    }

    //updating course
    @PutMapping(value="/update/{id}")
    public String updateCourse(@PathVariable String id,@RequestBody Course course)
    {
         this.courseService.updateCourse(id,course);
        return "updated course successfully";
    }
   //deleting course
     @DeleteMapping(value="/delete/{id}")
    public String deleteCourse(@PathVariable String id)
    {
        this.courseService.deleteCourse(id);
        return "deleted successfully";
    }



}
