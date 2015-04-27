

import java.util.ArrayList;


public class TestCloneimplements Cloneable{
	//Main method
	public static void main(String[] args){
			

	}
}


class MyStack implements Cloneable{
	
	public ArrayList<Object> list = new ArrayList<Object>();
	
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int getSize(){
		return list.size();
	}
	
	public Object peek(){
		return list.get(getSize() - 1);
	}
	
	public Object pop(){
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	public void push(Object o){
		list.add(o);
	}
	
	@Override
	public String toString(){
		return "stack: " + list.toString();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		MyStack object2 = (MyStack)super.clone();
		object2.list = (ArrayList<Object>)list.clone();
		return object2;
	}
	
}