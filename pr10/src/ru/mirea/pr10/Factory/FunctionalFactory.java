package ru.mirea.pr10.Factory;

import ru.mirea.pr10.FunctionalChair;
import ru.mirea.pr10.IChair;

public class FunctionalFactory implements IChairFactory {
    @Override
    public IChair createChair() {
        return new FunctionalChair();
    }
}
