
public class Person {

	 
		
		
		String pName;
        String pGender;
		int pAge;
	
		
		
		public Person() {
			
		}
		
		public Person(String pName, int pAge, String pGender) {
			this.pName = pName;
			this.pGender = pGender;
            this.pAge = pAge;
		}
		
		
		void display() {
			System.out.println("Name: " + this.pName);
			System.out.println("Gender: " + this.pGender);
            System.out.println("Age: " + this.pAge);
		}
		
		
		
		
 

}