package xyz.stacktrace.javaspringkeycloak.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.stacktrace.javaspringkeycloak.model.StudentRepository;

import java.security.Principal;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public String getStudents(Principal principal, Model model) {
        model.addAttribute("username", principal.getName());
        model.addAttribute("students", studentRepository.getStudents());
        return "students";
    }

    @GetMapping("/{index}")
    public String getStudent(@PathVariable("index") long index, Model  model) {
        model.addAttribute("student", studentRepository.getSingle(index));
        return "student";
    }
}