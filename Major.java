import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Major{
    private Hashtable<Course, Boolean> classes;
    private String name= "CSC MAJOR";
    ArrayList<Course> courseTitles;
    
    /** 
    *Intializes a new hashtable called classes which takes in a course and boolean. 
    *Intializes a new arraylist called preReq which takes in course.
    *After intializing these two then courses are added to the hashtable and false is assign to them as their first value because we set the course as not taken yet until the user says they took a certain course.
    *In the ArrayList PreReq we store the prerequests of the courses.
    *It also intializes courseTitle as a new ArrayList which takes in (this.classes.keySet())
    *Then it calls Collections.sort(courseTitles, new CourseComparator()) to sort out courseTitles.
    *This function does not take in any parameters.
    *This method does not return anything.
    */
    public Major(){
        this.classes= new Hashtable< Course, Boolean>();
        ArrayList<Course> preReq = new ArrayList<>();

        Course m_111 = new Course("A. MTH 111", 4, "Jennifer Beichman", preReq);
        this.classes.put(m_111, false);

        Course m_153 = new Course("A. MTH 153", 4, "Ileanu Vasu", preReq);
        this.classes.put(m_153, false);
        
        Course c_110 = new Course("B. CSC 110", 4, "Shinyoung Cho", preReq);
        this.classes.put(c_110,false);

        preReq.add(c_110);
        Course c_120 = new Course("B. CSC 120", 4, "Jordan Crouser", preReq);
        this.classes.put(c_120, false);

        preReq.clear();
        preReq.add(c_120);
        Course c_210 = new Course("B. CSC 210", 4, "Nicholas Howe", preReq);
        this.classes.put(c_210, false);
        
        preReq.clear();
        Course c_223 = new Course("C. CSC 223", 4, "Johanna Brewer", preReq);
        this.classes.put(c_223, false);

        preReq.clear();
        preReq.add(c_210);
        Course c_231 = new Course("B. CSC 231", 4, "Michael Robson", preReq);
        this.classes.put(c_231, false);

        preReq.clear();
        preReq.add(c_110);
        preReq.add(m_111);
        Course c_240 = new Course("C. CSC 240", 4, "Nicholas Howe", preReq);
        this.classes.put(c_240, false);

        preReq.clear();
        preReq.add(c_120);
        preReq.add(m_153);
        Course c_250 = new Course("B. CSC 250", 4, "Pablo Bolton", preReq);
        this.classes.put(c_250, false);      

        preReq.clear();
        preReq.add(c_210);
        Course c_251 = new Course("C. CSC 251", 4, "Shinyoung Cho", preReq);
        this.classes.put(c_251, false);


        preReq.clear();
        preReq.add(c_231);
        Course c_262 = new Course("C. CSC 262", 4, "Jamie MacBeth", preReq);
        this.classes.put(c_262, false);
        
        preReq.clear();
        preReq.add(c_110);
        preReq.add(m_111);
        preReq.add(c_120);
        preReq.add(m_153);
        preReq.add(c_210);
        preReq.add(c_231);
        preReq.add(c_250);
        Course c_327 = new Course("C. CSC 327", 4, "Shinyoung Cho", preReq);
        this.classes.put(c_327, false);

        this.courseTitles = new ArrayList<>(this.classes.keySet());
        Collections.sort(courseTitles, new CourseComparator());
       
    }
    

    /*
     * This method first intializes a String called missingClasses and sets this variable to an empty string. 
     * After that it loops over Course p in c.getPrereqs() then goes into an if statement checking if the value of cllasses.get(p) is false.
     * it does that to check if the person have not taken that especific prerequests.
     * then we add our p.getTitle() into our String missingClasses this way we would share with the user the title of the requirment they are missing.
     * @param Course c
     * @return missingClasses
     */
    public String MissingPreReqs(Course c){
        String missingClasses = "";
        for(Course p: c.getPrereqs()){
            if (classes.get(p) == false){
                missingClasses += (p.getTitle().substring(3) + " ");
            }
        }
        return missingClasses;
    }

    
    /*
     * In this method we take the user's input from our questions as we ask them if they have taken any of the courses.
     * We intialized a String called response and set it equal to an empty string that way we can keep on adding on the empty string.
     * Then we loop over for Course c in the the this.courseTitle to keep asking if the user have taken the courses.
     * Depending on the user's input our code goes into different if and else statements.
     * This method is void meaning it does not return anything and does not take any parameters.
     * Instead in this method we print out questions to the user and store their response.
     */
    public void setTaken(){
        Scanner scanner = new Scanner(System.in);
        String response= " ";
        for (Course c: this.courseTitles){
            System.out.println("Have you taken "+ c+ " ? y or n");
            response= scanner.nextLine();
            if(response.contains("y")){
                //if(this.classes.contains(c)){
                this.classes.get(c);
                this.classes.replace(c, false, true);
                }
                
            else if(response.contains("n")){
                continue;
            }
            else{
                throw new RuntimeException("You must input a value of either 'y' or 'n'.");
            }
            }
            
        }
        /*
         * Takes in an ArrayList of Course called taken 
         * Loops over Course c in this.classes.keySet() and then within the for loop we run an if statement to check if the value of c is true meaning the user has taken this course.
         * Then we add those classes into our ArrayLisst taken.
         * There are no parameters for this method.
         * returns the ArrayList we have stored in all of our taken classes and this ArrayList is called taken.
         * @return taken
         */
     public ArrayList<Course> getCompletedcourse(){
         ArrayList<Course> taken= new ArrayList<>();
         for( Course c: this.classes.keySet()){
            if (this.classes.get(c)){
               taken.add(c);
            }
         }
         return taken;
      }
     /**
     * We first intialized a String called des and set it as "CSC MAJOR"
     * Then it loops over Course c in the ArrayList of the courseTitle and then would increment our original des
     * After incrementing our value des we enter if statement of when this.classes.get(c) is true then we increment the des to starting a new line and printing completed.
     * Else if the user has completed the prerequests for that course then we increment des and print out to the console great u satisfied the prereqs on a new line.
     * else if the user has not taken the prequests yet then we increment des and print out to the user missing + this.missingprereqs(c) on a new line.
     * @return des
     */

    public String toString(){
        String des= this.name;
        
        for (Course c: this.courseTitles){
            des+= "\n" + c.toString();
            if (this.classes.get(c)){
                des+="\n COMPLETED!"+ "\n";
            }else{
                if(c.canTake(this.getCompletedcourse())){
                    des+= "\n GREAT U SATIFIED THE PREREQS "+ "\n";
                }else{
                    des+="\n MISSING: " + this.MissingPreReqs(c) + "\n";
                }
            }
        }
        return des;
    }
    
}
