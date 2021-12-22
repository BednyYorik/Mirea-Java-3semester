package ru.mirea.pr10;
import ru.mirea.pr10.FunctionalFactory;
import ru.mirea.pr10.MagicFactory;
import ru.mirea.pr10.VictorianFactory;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(new FunctionalFactory());
        client1.launcher();

        Client client2 = new Client(new MagicFactory());
        client2.launcher();

        Client client3 = new Client(new VictorianFactory(10));
        client3.launcher();
    }
}
