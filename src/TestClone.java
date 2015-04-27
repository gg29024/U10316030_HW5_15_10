//U10316030
//���l�|
//15.10

import java.util.ArrayList;


public class TestClone implements Cloneable{
	//Main method
	public static void main(String[] args) throws CloneNotSupportedException{
		//new an object
		MyStack oobject = new MyStack();
		MyStack ooobject = (MyStack)oobject.clone();
		//�ݦ�m�O�_�@�� ���@�˴N�Ofalse �N��������
		System.out.println(oobject == ooobject);  //�L�h
		System.out.println(oobject.list == ooobject.list);  //�`�h
		

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
		//Shallow Copy
		MyStack object2 = (MyStack)super.clone();
		//Deep Copy
		object2.list = (ArrayList<Object>)list.clone();
		return object2;
	}
	
}