
package schoolmanagementsystem;

import java.util.ArrayList;


/**
 *
 * @author imad
 */
public class ClassOps {
    String classN;
    
    ArrayList<Student> students;
    
   
    //getters 
    public String getClassN(){
        return this.classN;
    }
    
    public int getNumberOfStudents(){
        int count = 0;
        for (int i = 0; i < students.size(); i++){
            count++;
        }
        return count;
    }
    
    public int getNumberOfSuccedStudents(){
        int count = 0 ;
       for (Student std : this.students){
           if (std.getAvr() > 10) {
               count++;
           }
       }
       return count;
    }
    
    public float getClassAvr(){
        float sum = 0;
        for (Student std: this.students){
            sum += std.getAvr();
        }
        return sum/this.students.size();
    }
    
    public String listStudents(){
        String list = "";
        for (Student std: this.students){
            list = list + "\n" + std.getName() + " " 
                    + Float.toString(std.getAvr());
        }
        return list;
    } 
    //end of getters getters
    
    
    
    //setters
    public void setClassN(String classN){
        this.classN = classN;
    }
    
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }
    //end of setters
    
   
    
   //constructor
   public ClassOps(String classN, ArrayList<Student> students){
       super();
       this.classN = classN;
       this.students = students;
   }
   //end of constructor
   
   
    
    
}
