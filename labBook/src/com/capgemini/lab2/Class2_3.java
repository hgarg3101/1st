package com.capgemini.lab2;

/*enum Gender{
	M,F;
}
*/
public class Class2_3 {
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

}
