package ru.mirea.pr10.Chairs;

public class VictorianChair implements IChair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public void action() {
        System.out.println("Это VictorianChair. Ему " + age + " лет.");
    }

    public int getAge() {
        return age;
    }
}
