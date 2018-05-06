package com.shayzeq;

import java.io.Serializable;
import java.util.Random;

public class Worm implements Serializable {

    private static Random random = new Random(47);
    private Data[] data = {
            new Data(random.nextInt(10)),
            new Data(random.nextInt(10)),
            new Data(random.nextInt(10))
    };
    private Worm next;
    private char c;

    public Worm(int i, char x){

        System.out.println("Worm constructor: " + i);
        c = x;
        if(--i > 0)
            next = new Worm(i, (char) (x + 1));
    }

    public Worm() {

        System.out.println("Default constructor");
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder(":");
        result.append(c);
        result.append("(");
        for(Data d: data)
            result.append(d);
        result.append(")");
        if(next != null)
            result.append(next);
        return result.toString();
    }
}
