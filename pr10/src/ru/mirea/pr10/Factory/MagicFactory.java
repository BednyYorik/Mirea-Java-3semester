package ru.mirea.pr10.Factory;

import ru.mirea.pr10.IChair;
import ru.mirea.pr10.MagicChair;

public class MagicFactory implements IChairFactory {
    @Override
    public IChair createChair() {
        return new MagicChair();
    }
}
