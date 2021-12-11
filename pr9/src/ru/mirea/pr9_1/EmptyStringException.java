package ru.mirea.pr9_1;

public class EmptyStringException extends IllegalArgumentException{
    EmptyStringException(){
        super("Строка пуста.");
    }
}
