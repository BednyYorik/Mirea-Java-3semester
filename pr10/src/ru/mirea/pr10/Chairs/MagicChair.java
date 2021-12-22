package ru.mirea.pr10.Chairs;

public class MagicChair implements IChair {
    @Override
    public void action() {
        doMagic();
    }

    public void doMagic() {
        System.out.println("Это MagicChair. Он может делать много чего магического!)");
    }
}
