package studentObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student student1=new Student();
     student1.setName ("EMÝR");
     student1.setSurname("akbasoglu");
     student1.setGender(true);
     student1.setAge(15);
     student1.setClassRoom("10ABP");
     student1.setAge(10);
     student1.setNationalIdentity("543521432");
     student1.setLength(1.87);
     student1.setSchoollNumber("123");
     System.out.println(
    		 "ÖÐRENCÝ:"
    		+student1.getName() 
    		+" " 
    		+student1.getSurname()
    );

	

	Student student2=new Student("e","","",12,4.6,12,"","",true);
    School okul=new School("ÝBMTAL","Tabakalar","03774512544");
    System.out.println(okul.getName());
 }	
	
	
	
	
	
	
	
	
	
	
	
	
}

