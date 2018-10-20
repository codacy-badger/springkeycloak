package xyz.stacktrace.javaspringkeycloak.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.stacktrace.javaspringkeycloak.model.StudentRepository;

import java.security.Principal;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public String getStudents(Principal principal, Model model) {
        model.addAttribute("username", principal.getName());
        model.addAttribute("students", studentRepository.getStudents());
        return "students";
    }
}