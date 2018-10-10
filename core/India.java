package com.capgemini.core;


//Multi Level Inheritance

class Universe{
	
	public Universe(){
		System.out.println("Big bang!!!...Expanison of universe started!!");
	}
}

class MilkyWay extends Universe{
	
	public MilkyWay(){
		System.out.println("You are in Milky way!!!Find your galaxy here!!");
	}
	public void shape(){
		System.out.println("I am in a spiral galaxy!!");
	}
	
}
class Earth extends MilkyWay{
	
	public Earth(){
		System.out.println("You are in earth now!!!");
	}
	public void planetType(){
		System.out.println("Habitable... because 71% of earth's surface is covered with water!!!");
	}
}

public class India extends Earth {
	public India(){
		System.out.println("Namastey!! You are in India");
	}

	public static void main(String[] args) {
		India man= new India();
		man.shape();
		man.planetType();
	}

}
