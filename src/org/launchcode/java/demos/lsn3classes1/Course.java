package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    //at least 3 fields
    //String Course name
    //int Course ID
    //Arraylist of Teachers
    //HashMap <StudentID, ArrayList of grades>

    private String name;
    private int courseId;
    private ArrayList<Teacher> courseTeachers;
    private HashMap<Integer, ArrayList<Double>> studentGrades; //StudentId, grades as doubles

    public Course(String name, int courseId, ArrayList<Teacher> courseTeachers, ArrayList<Integer> studentIds)
    {
        this.name = name;
        this.courseId = courseId;
        this.courseTeachers = courseTeachers;

        this.studentGrades = new HashMap<>();

        for(Integer i : studentIds)
        {
            studentGrades.put(i, new ArrayList<Double>());
        }

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getCourseId() {
        return courseId;
    }

    private void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ArrayList<Teacher> getCourseTeachers() {
        return courseTeachers;
    }

    private void setCourseTeachers(ArrayList<Teacher> courseTeachers) {
        this.courseTeachers = courseTeachers;
    }

    public HashMap<Integer, ArrayList<Double>> getStudentGrades() {
        return studentGrades;
    }

    private void setStudentGrades(HashMap<Integer, ArrayList<Double>> studentGrades) {
        this.studentGrades = studentGrades;
    }
}
