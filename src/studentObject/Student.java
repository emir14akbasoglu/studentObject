package studentObject;

public class Student {
   private String name;
   private String surname;
   private String schoollNumber;
   private int   classNumber;
   private double length;
   private int age;
   private String classRoom;
     private String nationalIdentity; 
private boolean gender;
public Student() {
	super();
}
public Student(String name, String surname, String schoollNumber, int classNumber, double length, int age,
		String classRoom, String nationalIdentity, boolean gender) {
	super();
	this.name = name;
	this.surname = surname;
	this.schoollNumber = schoollNumber;
	this.classNumber = classNumber;
	this.length = length;
	this.age = age;
	this.classRoom = classRoom;
	this.nationalIdentity = nationalIdentity;
	this.gender = gender;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getSchoollNumber() {
	return schoollNumber;
}
public void setSchoollNumber(String schoollNumber) {
	this.schoollNumber = schoollNumber;
}
public int getClassNumber() {
	return classNumber;
}
public void setClassNumber(int classNumber) {
	this.classNumber = classNumber;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getClassRoom() {
	return classRoom;
}
public void setClassRoom(String classRoom) {
	this.classRoom = classRoom;
}
public String getNationalIdentity() {
	return nationalIdentity;
}
public void setNationalIdentity(String nationalIdentity) {
	this.nationalIdentity = nationalIdentity;
}
public boolean isGender() {
	return gender;
}
public void setGender(boolean gender) {
	this.gender = gender;
}


   
}
