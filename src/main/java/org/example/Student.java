package org.example;

public class Student implements Comparable<Student>{
    private Integer studentId;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (o.getStudentId() > studentId)
            return  -1;
        else if (o.getStudentId() < studentId) {
            return 1;
        }
        else
            return 0;
//        return studentId.compareTo(o.getStudentId());
    }
}
