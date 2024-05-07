package com.mycompany.java8;

interface start {

    public void run();
}

public class UseLambdaExpression {

    public static void main(String[] args) {
        int w = 29;
        start d1 = () -> {
            System.out.println("Output " + " " + w);
        };
        d1.run();
    }

}
