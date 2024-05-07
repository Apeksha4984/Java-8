
package com.mycompany.java8;

interface Drawable{
    public void draw();
}
public class WithoutUseLambda {
    public static void main(String[]args){
        int width=10;
        Drawable d= new Drawable(){
            

            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}
