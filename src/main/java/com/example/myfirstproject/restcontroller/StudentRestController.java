package com.example.myfirstproject.restcontroller;


import com.example.myfirstproject.entity.Student;
import com.example.myfirstproject.exception.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/school")
public class StudentRestController {
    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student(0, "hiba", "mohammad","female", 25, true, 95.7f));
        students.add(new Student(1, "basel", "dery","male", 30, true, 98.2f));
        students.add(new Student(2, "najim", "dery","male", 27, false, 99.1f));
        students.add(new Student(3, "abd alhasib", "alabrash","male", 27, false, 81.3f));
        students.add(new Student(4, "mahmoud", "abouhashem","male", 26, false, 90.8f));
        students.add(new Student(5, "nour", "nawara","female", 22, true, 99.9f));
    }

    @GetMapping("")
    public String welcomeSchool(){
        return "Welcome to School!";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }


    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if (studentId > students.size()) {
            throw new StudentNotFoundException("Student " + studentId + " is not found! The maximal Student Numbers are " + students.size());
        } else if (studentId <= 0) {
            throw new StudentNotFoundException("Student " + studentId + " is not found! Please insert the id between 1 and " + students.size());
        } else {
            return students.get(studentId - 1);
        }
    }
    
    @GetMapping("/list")
    public String listEmployee(Model theModel){
        theModel.addAttribute("students-list", students);
        return "/school/test";
    }

}
