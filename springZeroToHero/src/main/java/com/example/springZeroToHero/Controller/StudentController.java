package com.example.springZeroToHero.Controller;

import com.example.springZeroToHero.Bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //Create REST API that returns Java Bean (JSON)
    @GetMapping("student")
    public Student getStudent(){

        Student student = new Student(
                1,
                "Prathamesh",
                "Ghorapade"
        );
        return student;

    }

    //Create REST API THat Return List (JSON Format)

    @GetMapping("students")
    public List<Student> students (){

        List<Student> student = new ArrayList<>();
        student.add(new Student(1,"rutu","awale"));
        student.add(new Student(2,"pratham","Ghorapade"));
        student.add(new Student(3,"prathamesh","Ghorapade"));

        return student;
    }


    //REST API With Path Variable
    // {id} URI template Variable

    //http://localhost:8080/student/1

    @GetMapping("student/{id}")
    public Student ApiWithPathVariable(@PathVariable int id){

        return new Student(id,"rutu","Awale");
    }


    //REST API With Request Param
    //http://localhost:8080/student/query?id=2&name=pratham&lastname=ghorapade

    @GetMapping("student/query")
    public Student ApiWithRequestParam(@RequestParam int id,
                                       @RequestParam String name,
                                       @RequestParam String lastname){
        return new Student(id,name,lastname);
    }
}



