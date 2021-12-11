package ru.mirea.pr9_1;

import java.util.Comparator;

public class PointComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getPoint() - o2.getPoint();
    }
}
