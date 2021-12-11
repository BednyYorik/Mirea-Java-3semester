package ru.mirea.pr9_1;

public class StudentNotFoundException extends Exception{
    StudentNotFoundException(String name){
        super("Студент " + name + " не найден.");
    }
}
