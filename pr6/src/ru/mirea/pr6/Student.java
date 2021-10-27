package ru.mirea.pr6;

public class Student implements Comparable <Student> {

    private int id;
    private int GPA;

    Student (int id){
        this.id = id;
    }

    Student (int id, int GPA){
        this.id = id;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Student student) {
        if (student.GPA < GPA)
            return -1;
        else if (student.GPA > GPA)
            return 1;
        return 0;
    }
}
