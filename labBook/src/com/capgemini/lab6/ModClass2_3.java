package com.capgemini.lab6;




enum Gender{
	M,F;
}

class BlankException extends Exception{
	BlankException() {
		
	}
	public String toString() {
		return "---Your variable is Blank----";
	}
	
}
public class ModClass2_3 {
	class Person{
		private String firstName;
		private String lastName;
		private Gender gender;
		private String pnum;
		
		
	
		public String getPnum() {
			return pnum;
		}
		public void setPnum(String pnum) {
			this.pnum = pnum;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		
		Person(){
			
		}
		
		Person(String first, String last, Gender c){
			this.firstName=first;
			this.lastName=last;
			this.gender=c;
		}
		void display(){
				System.out.println("Person Details:\n----------------");
				System.out.println("First Name: "+firstName);
				System.out.println("Last Name: "+lastName);
				System.out.println("Gender: "+gender);
				System.out.println("Phone No.: "+pnum);
		}
		
	}
	public static void main(String...s) throws BlankException {
		ModClass2_3 a = new ModClass2_3();
		Gender g =Gender.F;
		Person obj= a.new Person("Divya","",g);
		if(obj.getFirstName().isEmpty()) {
			throw new BlankException();
		}
		if(obj.getLastName().isEmpty()) {
			throw new BlankException();
		}
		
		obj.setPnum("9992459069");
		obj.display();
	}

}

