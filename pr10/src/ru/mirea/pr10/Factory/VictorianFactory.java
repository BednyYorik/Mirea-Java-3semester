package ru.mirea.pr10.Factory;

import ru.mirea.pr10.IChair;
import ru.mirea.pr10.VictorianChair;

public class VictorianFactory implements IChairFactory {

    private int age;

    public VictorianFactory(int age) {
        this.age = age;
    }

    @Override
    public IChair createChair() {
        return new VictorianChair(age);
    }
}
