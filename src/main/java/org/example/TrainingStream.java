package org.example;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TrainingStream implements Iterable<StudyGroup>, Iterator<StudyGroup>{
    private List<StudyGroup> lStudyGroup = new LinkedList<StudyGroup>();
    private int index = 0;

    public void Clear(){
        lStudyGroup.clear();;
    }

    public void Sort1(){
        Collections.sort(lStudyGroup);
    }

    public void Sort2(){
        Collections.sort(lStudyGroup, new StudyGroupCompare());
    }

    public int addStudyGroup(StudyGroup value){
        lStudyGroup.add(value);
        return lStudyGroup.size();
    }

    //реализуем метод интерфейса Iterable
    public Iterator<StudyGroup> iterator(){
        Iterator<StudyGroup> itGroup = new Iterator<StudyGroup>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index++<lStudyGroup.size();
            }

            @Override
            public StudyGroup next() {
                return lStudyGroup.get(index-1);
            }
        };

        return itGroup;
    }


    //реализуем метод интерфейса Iterator
    public boolean hasNext() {
        return index++<=lStudyGroup.size();
    }


    public StudyGroup next() {
        return lStudyGroup.get(index-1);
    }
}
