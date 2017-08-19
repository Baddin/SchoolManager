
package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author imad
 */
public class SchoolManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Test
        
        Date date = new Date();
        HashMap<String, Float> marksH = new HashMap<String, Float>();
        marksH.put("test", (float)17.5);
        marksH.put("test2", (float)15.9);
        marksH.put("test36", (float)18.6);
        Student std1 = new Student("test1", date, "some place", marksH);
        
        HashMap<String, Float> marksH2 = new HashMap<String, Float>();
        marksH2.put("test", (float)10.5);
        marksH2.put("test2", (float)11.9);
        marksH2.put("test36", (float)12.6);
        Student std2 = new Student("test2", date, "some place2", marksH2);
        
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(std1);
        students.add(std2);
        
        ClassOps class1 = new ClassOps("3am3", students);
        
        System.out.println("Number of students : " 
                + class1.getNumberOfStudents());
        
        System.out.println("Number of succed students : " 
                + class1.getNumberOfSuccedStudents());
        
        System.out.println("Class average : " + class1.getClassAvr());
        System.out.println("Students list : " + class1.listStudents());
    }
    
}
