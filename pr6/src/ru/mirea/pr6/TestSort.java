package ru.mirea.pr6;

public class TestSort {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student(123);
        students[1] = new Student(2);
        students[2] = new Student(234);
        students[3] = new Student(936);
        students[4] = new Student(11);
        Sort.sort_ins(students);

        for (Student student : students) {
            System.out.print(student.getId() + " ");
        }
        System.out.println("\n____________________________\n");

        Student[] students2 = new Student[5];
        students2[0] = new Student(123, 5);
        students2[1] = new Student(2,2);
        students2[2] = new Student(234,4);
        students2[3] = new Student(936,3);
        students2[4] = new Student(11,1);
        Sort.QSort(students2, 0, students2.length - 1);

        for (Student student : students2) {
            System.out.print(student.getGPA() + " ");
        }
        System.out.println("\n____________________________\n");

    }
}
