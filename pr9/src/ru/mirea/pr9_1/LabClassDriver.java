package ru.mirea.pr9_1;

import java.util.ArrayList;

public class LabClassDriver {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("ФИО", 67, 12, 18));
        students.add(new Student("ФИО2", 57, 12, 18));
        students.add(new Student("ФИО3", 93, 12, 19));
        students.add(new Student("ФИО4", 24, 2, 18));
        students.add(new Student("ФИО5", 66, 12, 18));

        new LabClassUI(students);
    }
}
