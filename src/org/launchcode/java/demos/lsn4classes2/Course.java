package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString(){
        return String.format("%s\nTaught by %s %s \nStudents enrolled in class:\n%s", this.topic, this.instructor.getFirstName(), this.instructor.getLastName(), this.enrolledToString());
}

    private String enrolledToString(){
        String result = "";
        for (Student i: enrolledStudents) {
            result += i.getName() + " : ID #" + i.getStudentId() + "\n";
        }
        return result;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object toCompare)
    {
        if(toCompare.getClass() != this.getClass())
        {
            return false;
        } else {
            Course comparedCourse = (Course)toCompare;
            return (comparedCourse.getTopic() == this.getTopic()) && (comparedCourse.getInstructor() == this.getInstructor());
        }
    }

    public String getTopic() {
        return topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }
}
