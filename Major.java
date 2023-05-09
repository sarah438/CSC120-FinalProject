import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Major{
    private Hashtable<Course, Boolean> classes;
    private String name= "CSC MAJOR";
    ArrayList<Course> courseTitles;

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
        // get rid of everything w/ majorCourses

        this.courseTitles = new ArrayList<>(this.classes.keySet());
        Collections.sort(courseTitles, new CourseComparator());
       
    }


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

    public String MissingPreReqs(Course c){
        String missingClasses = "";
        for(Course p: c.getPrereqs()){
            if (classes.get(p) == false){
                missingClasses += (p.getTitle().substring(3) + " ");
            }
        }
        return missingClasses;
    }

    
    
    public void setTaken(){
        Scanner scanner = new Scanner(System.in);
        String response= " ";
        for (Course c: this.courseTitles){
        // need to run for loop using information from hashtable
        // need c to be a course, not a string
            // Course course = classes.
            //if (c.canTake(classes)){
            System.out.println("Have you taken "+ c+ " ? y or n");
            response= scanner.nextLine();
            if(response.contains("y")){
                //if(this.classes.contains(c)){
                this.classes.get(c);
                this.classes.replace(c, false, true);
                    // for (int i=0; i< this.classes.size(); i++){
                        
                    // }
                }
                //this.classes.replace(c,true);
            
            else if(response.contains("n")){
                continue;
            }
            else{
                throw new RuntimeException("You must input a value of either 'y' or 'n'.");
            }
            }
            
        }

        public ArrayList<Course> getCompletedcourse(){
            ArrayList<Course> taken= new ArrayList<>();
            for( Course c: this.classes.keySet()){
                if (this.classes.get(c)){
                    taken.add(c);
                }
            }
            return taken;
        }
}