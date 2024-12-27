import java.io.*;
import java.util.*;
class A{
	void run(){
		System.out.println("this is class A");
	}
}
class B extends A{
	void display(){
		System.out.println("this is class B");
	}
}
public class C extends B{
	void runs(){
		System.out.println("this is class C");
	}
	public static void main(String args[]){
		C obj  = new C();
		obj.run();
		obj.display();
		obj.runs();
	}
}
