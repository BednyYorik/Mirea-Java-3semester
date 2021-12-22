package ru.mirea.lab9.ex5;

public class ThrowsDemo {
    public String getDetails(String key){
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }
        catch (NullPointerException e){
            key = "default";
        }
        return "data is " + key;
    }

    public void printMessage(String key){
        String message = getDetails(key);
        System.out.println(message);
    }
}
