package com.mycompany.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A {

    int pid;
    String Name;
    String price;
    String brand;

    public A(int pid, String name, String price, String brand) {
        this.pid = pid;
        this.Name = name;
        this.price = price;
        this.brand = brand;
    }

}

public class ProductStreamDemo {

    public static void main(String[] args) {
        List<A> productList = new ArrayList<A>();
      
        productList.add(new A(1, "Women Printed Regular Fit Top", "₹450", "abc"));
        productList.add(new A(2, "floral print Top", "₹550", "abc"));
        productList.add(new A(3, "Round neck Top", "₹350", "abc"));
        productList.add(new A(4, "Women Embriodered Regular Fit Top", "₹459", "abc"));
        productList.add(new A(5, "Checked v neck  Top", "₹499", "abc"));
        
        List<Integer>statelist=productList.stream()
                .filter(p->p.pid>3).map(m->m.pid)
                .collect(Collectors.toList());

		System.out.println(statelist);

    }
}
