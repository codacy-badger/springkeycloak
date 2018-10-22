package xyz.stacktrace.javaspringkeycloak.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class StudentRepository {

    private final List<Student> students = Arrays.asList(
            new Student(270120, new Date(), "Petar Petrovic"),
            new Student(270119, new Date(), "Ana Petrovic"),
            new Student(120200, new Date(), "Ivan Ivanovic")
    );

    public List<Student> getStudents() {
        return students;
    }

    public Student getSingle(long index) {
        return students.stream()
                    .filter(s -> s.getIndex() == index)
                    .findFirst()
                    .orElse(null);
    }
}
