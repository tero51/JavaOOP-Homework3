package org.example;

import java.util.Comparator;



public class StudyGroup implements Comparable<StudyGroup> {
    protected  String name;
    protected int countStudent;
    protected String specialization;

    public StudyGroup(String name, int countStudent,String specialization ){
        super(); //ну вот привычка такая из другого языка всегда делать inherited
        this.name = name;
        this.countStudent = countStudent;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int compareTo(StudyGroup o){
        return Integer.compare(this.getCountStudent(), o.getCountStudent());
    }

    @Override
    public String toString() {
        return "Группа: "+name+"   "+"Количество студентов: "+Integer.toString(countStudent)+"   "+"Специализация: "+specialization;
    }
}
