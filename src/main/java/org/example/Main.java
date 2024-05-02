package org.example;

import java.sql.SQLOutput;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TrainingStream trainingStream = new TrainingStream();
        trainingStream.addStudyGroup(new StudyGroup("A-1", 28, "Math"));
        trainingStream.addStudyGroup(new StudyGroup("A-2", 23, "Physics"));
        trainingStream.addStudyGroup(new StudyGroup("A-3", 18, "History"));
        trainingStream.addStudyGroup(new StudyGroup("A-4", 26, "chemistry"));
        trainingStream.addStudyGroup(new StudyGroup("A-5", 22, "Geometry"));

        //выведем как есть
        System.out.println("Before sorting------------------------\n");

        for (StudyGroup item : trainingStream){
            System.out.println(item.toString());
        }

        //отсортируем 1 методом
        trainingStream.Sort1();


        Iterator<StudyGroup> iterator = trainingStream.iterator();
        System.out.println("\nAfter sorting------------------------\n");
        while (iterator.hasNext()){
            StudyGroup sg = iterator.next();
            System.out.println(sg.toString());
        }

        trainingStream.Clear();
        trainingStream.addStudyGroup(new StudyGroup("B-8", 13, "Geography"));
        trainingStream.addStudyGroup(new StudyGroup("B-9", 12, "engineering graphics"));
        trainingStream.addStudyGroup(new StudyGroup("B-10", 34, "Biology"));
        trainingStream.addStudyGroup(new StudyGroup("B-11", 16, "Anatomy"));
        trainingStream.addStudyGroup(new StudyGroup("B-12", 18, "Computer graphics"));
        System.out.println("\n-----------------------------------------------------------------------------------------\n");
        System.out.println("\nBefore sorting------------------------\n");
        for (StudyGroup item : trainingStream){
            System.out.println(item.toString());
        }

        //отсортируем 2 методом
        trainingStream.Sort2();


        iterator = trainingStream.iterator();
        System.out.println("\nAfter sorting------------------------\n");
        while (iterator.hasNext()){
            StudyGroup sg = iterator.next();
            System.out.println(sg.toString());
        }

    }
}
