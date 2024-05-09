
package com.mycompany.java8;

import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI {
    public  static void main(String[]args){
        //List<String>list=new ArrayList<>();
        List<String> list1=List.of("apeksha","akansha","aman","aarav");
      //this list is immutable means doesn't change this list and not add the more element
      List<String> names=list1.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
        System.out.println(names);
    }
    
}
