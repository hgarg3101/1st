package com.capgemini.core;

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Abc obj= new Abc(6,9);
		
		

		//shallow copy Abc obj1=obj;
		//deep copy Abc obj1 =new Abc();
		//cloning 
		Abc obj1= obj.clone();
		System.out.println(obj);
		System.out.println(obj1);
		
		// TODO Auto-generated method stub

	}

}
class Abc implements Cloneable{
	int i;
	int j;

	//constructor
	Abc(int i1, int j1){
	this.i=i1;
	this.j=j1;
	}
	//tostring override
	public String toString(){
		return "Object of Abc, i="+i+" j="+j;
	}
	public Abc clone() throws CloneNotSupportedException{
		return (Abc)super.clone();
	}
}
