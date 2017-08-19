
package schoolmanagementsystem;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author imad
 */
public class Student extends Human {
    private HashMap<String, Float> marks ;
    //private float avr ;
    private String classN;
    
    
    //getters 
    public HashMap<String, Float> getMarks(){
        return this.marks;
    }
    
    public float getAvr(){
        float sum = 0;
        int count = 0;
        Set set = this.marks.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
          Map.Entry<String, Float> mentry = (Map.Entry<String, Float>)itr.next();

          sum += mentry.getValue();
          count++;
        }
        float avrTemp = sum / count;

        return avrTemp;
      
    }
    
    
    public float getSum(){
        float sum = 0;
        Set set = this.marks.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
          Map.Entry<String, Float> mentry = (Map.Entry<String, Float>)itr.next();

          sum += mentry.getValue();
        }
        return sum;
    }
    
    public String getClassN(){
        return this.classN;
    }
    //end of getters 
    
    //setters 
    public void setMarks(HashMap<String, Float> marks){
        this.marks = marks;
    }
    
    public void setClassN(String classN){
        this.classN = classN;
    }
    
    //end of setters 
    
    
    
    //constracor
    public Student(String name, Date birthDate, String adress,HashMap<String, Float> marks) {
        super(name, birthDate, adress);
        this.marks = marks;
        
    }
    
    
    
}
