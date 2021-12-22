package ru.mirea.pr13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student implements Comparable<Student> {

    private int id;
    private int GPA;
    private Calendar date;

    Student(int id) {
        this.id = id;
    }

    Student(int id, int GPA, Calendar date) {
        this.id = id;
        this.GPA = GPA;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getGPA() {
        return GPA;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public int compareTo(Student student) {
        if (student.GPA < GPA)
            return -1;
        else if (student.GPA > GPA)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", GPA=" + GPA +
                ", date=" + date.getTime() +
                " " + date.get(Calendar.DAY_OF_MONTH) + "." + date.get(Calendar.MONTH) + "." + date.get(Calendar.YEAR) +
                '}';
    }

    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student(123, 21, new GregorianCalendar(2002, 11, 21));
        students[1] = new Student(123, 21, new GregorianCalendar(2003, 11, 21));
        students[2] = new Student(123, 21, new GregorianCalendar(2002, 11, 24));
        students[3] = new Student(123, 21, new GregorianCalendar(2002, 8, 21));
        students[4] = new Student(123, 21, new GregorianCalendar(2004, 11, 21));

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("\n____________________________\n");

    }
}