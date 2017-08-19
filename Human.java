
package schoolmanagementsystem;


import java.util.Date;


/**
 *
 * @author imad
 */
public class Human {
    protected String name;
    protected Date birthDate;
    protected String adress;
    
    
    
    //getters 
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        Date today = new Date();
        return today.compareTo(this.birthDate);
    }
    
    public String getAdress(){
        return this.adress;
    }
    //end of getters 
    
    //setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    } 
    
    public void setAdress(String adress){
        this.adress = adress; 
    }
    //end of setters 
    
    //constractor
    public Human(String name, Date birthDate, String adress) {
        this.name = name;
        this.birthDate = birthDate;
        this.adress = adress;
    }
    //end of constractor
}
