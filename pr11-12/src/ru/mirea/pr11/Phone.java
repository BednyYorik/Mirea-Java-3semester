package ru.mirea.pr11;

public class Phone {
    public static String format_number(String number) {
        char first_sym = number.charAt(0);
        int number_len = number.length();
        int length = number.substring(number_len - 10, number_len).length();
        if (length < 10)
            return ("wrong format");
        return ("+" + (first_sym != '+' ? (first_sym == '8' ? "7" + number.substring(1, number_len - 10) : number.substring(0, number_len - 10)) : number.substring(1, number_len - 10)) +
                " " + number.substring(number_len - 10, number_len - 7) + "-" + number.substring(number_len - 7, number_len - 4) +
                "-" + number.substring(number_len - 4, number_len));
    }

    public static void main(String[] args) {
        System.out.println(format_number("89267914681"));
    }
}
