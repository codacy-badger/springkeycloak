package xyz.stacktrace.javaspringkeycloak.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {
    private long index;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date enrollmentDate;
    private String name;

    public Student(long index, Date enrollmentDate, String name) {
        this.index = index;
        this.enrollmentDate = enrollmentDate;
        this.name = name;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}