package ru.mirea.pr7;

import java.util.ArrayDeque;
import java.util.Deque;

public class Game {
    Deque<Integer> fp, sp;

    public Game(String fp, String sp) {
        this.fp = new ArrayDeque<>();
        this.sp = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            this.fp.add(Integer.parseInt(fp.substring(i, i + 1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i + 1)));
        }
    }

    public String play() {
        int count = 0;
        while (!fp.isEmpty() && !sp.isEmpty() && count < 106) {

            if (fp.peek() == 0 && sp.peek() == 9) {
                fp.add(fp.remove());
                fp.add(sp.remove());
            } else if (fp.peek() == 9 && sp.peek() == 0){
                sp.add(fp.remove());
                sp.add(sp.remove());
            }else {
                if (fp.peek() > sp.peek()){
                    fp.add(fp.remove());
                    fp.add(sp.remove());
                } else {
                    sp.add(fp.remove());
                    sp.add(sp.remove());
                }
            }
            count++;
        }
        String res = "";
        if (fp.isEmpty()) res += "second ";
        else if (sp.isEmpty()) res += "first ";
        res += count;
        if (count >= 106) res += " botva";
        return res;
    }
}