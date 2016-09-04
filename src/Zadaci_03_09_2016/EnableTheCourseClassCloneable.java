package Zadaci_03_09_2016;

/*
 *  (Enable the Course class cloneable) 
 *  Rewrite the Course class in Listing 10.6 to add a clone method to 
 *  perform a deep copy on the students field. 
 */
public class EnableTheCourseClassCloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Course course1 = new Course("Math");
		//dodavanje studenata
		course1.addStudent("Dino");
		course1.addStudent("Amra");
		course1.addStudent("Dzenana");
		
		Course course2  = (Course)course1.clone();//kopiranje kursa 1 
		System.out.println("Course 1 has "+course1.getNumberOfStudents() + " students" );
		System.out.println("Course 2 has "+course2.getNumberOfStudents()+ " students");
		
		course2.addStudent("Mia");	//dodavnje novog u kurs2
		System.out.println("\nCourse 1 has "+course1.getNumberOfStudents() + " students" );
		System.out.println("Course 2 has "+course2.getNumberOfStudents()+ " students");
		
	}
}
class Course implements Cloneable{
	//data fileds
	private String courseName; 
	private String[] students = new String[100]; 
	private int numberOfStudents; 
	
	
	public Course(String courseName) { 
		this.courseName = courseName; 
		} 
	
	public void addStudent(String student) { 
		students[numberOfStudents] = student; 
		numberOfStudents++; 
		} 
	
	public String[] getStudents() { 
		return students; 
		} 
	
	public int getNumberOfStudents() { 
		return numberOfStudents; 
		} 
	
	public String getCourseName() { 
		return courseName; 
		} 
	
	public void dropStudent(String student) { 
		 
		}
	
	 @Override
	  protected Object clone() throws CloneNotSupportedException  {
	       
		 	Course course2 = null;						//Kreiranje varijable tipa Course
		 	
	        course2 = (Course) super.clone();			//super.clone() pozivamo kao prvi izraz prilikom kopiranja
	        
	        course2.students= students.clone();			//kopiranje studenata
	        
	        return course2;
	    }
	}


