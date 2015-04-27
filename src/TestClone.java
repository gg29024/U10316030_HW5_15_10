

import java.util.ArrayList;
import java.util.Scanner;

public class TestClone{
	//Main method
	public static void main(String[] args){
			

	}
}


class MyStack{
	
	public ArrayList<Object> list = new ArrayList<Object>();
	
	
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	public int getSize(){
		return super.size();
	}
	
	public Object peek(){
		return super.get(getSize() - 1);
	}
	
	public Object pop(){
		Object o = super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return o;
	}
	
	public void push(Object o){
		super.add(o);
	}
	
	@Override
	public String toString(){
		return "stack: " + super.toString();
	}
}