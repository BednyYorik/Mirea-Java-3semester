package ru.mirea.pr10.Chairs;

public class FunctionalChair implements IChair {
    @Override
    public void action() {
        System.out.println("Это FunctionalChair. Он может посчитать сумму двух чисел, например 2 + 2 = " + sum(2, 2));
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
