package ru.mirea.pr9_1;

public class Student implements Comparable<Student>{

    private String name;
    private int point, group, age;

    public static final AgeComparator AgeComp = new AgeComparator();
    public static final PointComparator PointComp = new PointComparator();
    public static final GroupComparator GroupComp = new GroupComparator();

    public Student(String name, int point, int group, int age) {
        this.name = name;
        this.point = point;
        this.group = group;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) throw new EmptyStringException();
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", point=" + point +
                ", group=" + group +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
