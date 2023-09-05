package org.example.collectionframework.phanbiet;

import java.util.Comparator;
import java.util.stream.Collector;

public class AgeComparator implements Comparator<Student> {
    public int Compare(Student o1, Student o2){
        if (o1.getAge() > o2.getAge()){
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return 1;
        }
    }
}
