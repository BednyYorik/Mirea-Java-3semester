package ru.mirea.pr10;

import ru.mirea.pr10.IChair;
import ru.mirea.pr10.IChairFactory;

public class Client {
    private IChair chair;

    public Client(IChairFactory factory) {
        this.chair = factory.createChair();
    }

    public void launcher() {
        chair.action();
    }

}
