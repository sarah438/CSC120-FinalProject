import java.util.ArrayList;
public class Course {
    private String title;
    private int credit;
    private String professor;
    private ArrayList<Course> prereqs = new ArrayList<>();

    /*
     * This is the constractor class and in it we check if the givenpreqs does not equal zero
     * Then if it does not we loop over Course c in givenprereqs to add the our c into our prereqs ArrayList.
     * @param String title
     * @param int n_credits
     * @param String professor
     * @param ArrayList<Course> givenpreqs
     */

    public Course(String title, int n_credits, String professor, ArrayList<Course> givenpreqs){
        this.title= title;
        this.credit= n_credits;
        this.professor= professor;
        if (givenpreqs!= null){
            for (Course c: givenpreqs) {
                this.prereqs.add(c);
            }
        }
        

    }
    
    /*
     * This function is returning the this.title as our variable title is private
     * returns this.title
     */
    public String getTitle(){
        return this.title;
    }
    
    /*
     * This function return the prereqs ArrayList
     * @return this.prereqs
     */
    public ArrayList<Course> getPrereqs(){
        return this.prereqs;
    }
    
    /*
     * In this function we are returns if the value of the classes is true or false depending on if it has a prereqs.
     * then if the value is true then this canTake functions allows the person to take a course when it's called in Major.java
     * returns a boolean of if classes.containsAll(this.prereqs)
     * @param ArrayList<Course> called classes
     * @return classes.containsAll(this.prereqs)
     */
    public boolean canTake(ArrayList<Course>classes){
            return classes.containsAll(this.prereqs);
    }
    
    /*
     * This function also returns if a course has a prereqs that needs to be taken before taking the class
     * @param Course c
     * returns if the course c has a prereqs by saying this.prereqs.contains(c)
     * @return this.prereqs.contains(c)
     */
    public boolean isprereqs(Course c){
        return this.prereqs.contains(c);
    }
    
}

    /*
     * In this function we are changing the value of our original hashtable by seeing if our parameter equals to our Course c
     * If the object o is the same as our c then we true else we return false if the two are differnt
     * @Param Object o
     * returns a boolean true or false depending if our Object o is the same as our Course c
     */

    public boolean equals(Object o){
        if(o instanceof Course){
            Course c= (Course)o;
            return c.title.equals(this.title);
        }else{
            return false;
        }
    }



    /*
     * We first intialized a String called dec and set equal to the concatenate of this.title, this.credit, and this.professor
     * But first we have to check that the size of the Prereqs ArrayList is not zero as we then increment our dec into "\npreq:"
     * Then it loops over Course c in the ArrayList of the this.prereqs and then would increment our original dec
     * Finally this function returns the String dec
     * 
     */
    public String toString(){
        String dec= this.title.substring(3) + " ("+ this.credit + " credits, " + this.professor + ")";
        if(this.prereqs.size()!= 0){
            dec += "\npreq:";
    
            for(Course c : this.prereqs){
                dec+= c.getTitle().substring(3) +" ";   
            }
        }

        return dec;
    }
    
}
    

    



