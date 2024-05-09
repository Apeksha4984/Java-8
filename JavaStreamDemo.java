
package com.mycompany.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

   


class A{
	int sid;
	String Name;
	String rollNo;
	String address;
	public A(int sid, String name, String rollNo, String address) {
		this.sid = sid;
	    this.Name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	
}

public class JavaStreamDemo {

	public static void main(String[] args) {
		List<A>studentList=new ArrayList<A>();
		studentList.add(new A(1,"apeksha","RWI501","Betul"));
		studentList.add(new A(2,"Anjali","RWI502","Indore"));
		studentList.add(new A(3,"Aarav","RWI503","Delhi"));
		studentList.add(new A(4,"kavita","RWI504","Bhopal"));
		studentList.add(new A(5,"arpita","RWI506","Gurugram"));
		
		List<Integer>statelist=studentList.stream()
                           .filter(p->p.sid>3)//Filtering
                           .map(m->m.sid).//fetching
                           collect(Collectors.toList());
		System.out.println(statelist);
		
		             
		
		

	}

}
    

