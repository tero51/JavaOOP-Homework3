package org.example;

import java.util.Comparator;

public class StudyGroupCompare implements Comparator<StudyGroup> {
    @Override
    public int compare(StudyGroup o1, StudyGroup o2) {
        return Integer.compare(o1.getCountStudent(), o2.getCountStudent());
    }
}
