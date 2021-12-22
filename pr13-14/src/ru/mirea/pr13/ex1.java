package ru.mirea.pr13;
import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.Thread;

public class ex1 {
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {
        String task_pulled = new SimpleDateFormat(" d.MM.yy HH:mm:ss").format(new Date(System.currentTimeMillis()));

        System.out.println("\n" + "Дата и время получения задания:  " + task_pulled + "\nФамилия разработчика: Стасишин");
        wait(3500);
        for (int i = 0; i < 10; i++) {
            wait(1000);
            System.out.print("\n" + "Выполнение" + '(' + (i + 1)*10+"%)");
        }

        System.out.println("\n\n\nДата и время сдачи задания: " + new SimpleDateFormat(" d.MM.yy HH:mm:ss").format(new Date(System.currentTimeMillis())));
    }
}
