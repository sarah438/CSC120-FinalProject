import java.util.ArrayList;
public class Course {
    private String title;
    private int credit;
    private String professor;
    private ArrayList<Course> prereqs = new ArrayList<>();



//Add javadoc explaining what certain parts of the code does.

   // ArrayList<Course> prereqs;
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

    public ArrayList<Course> getPrereqs(){
        return this.prereqs;
    }
    
    public boolean canTake(ArrayList<Course>classes){
            return classes.containsAll(this.prereqs);
       

    }
    public boolean isprereqs(Course c){
        return this.prereqs.contains(c);
    }

    public String toString(){
        String dec= this.title.substring(3) + " ("+ this.credit + " credits, " + this.professor + ")";
        if(this.prereqs.size()!= 0){
            dec += "\npreq:";
    
            for(Course c : this.prereqs){
                dec+= c.getTitle().substring(3) +" ";   
            }
        }

        return dec;

        // modify this method 
        // if the user hasn't taken CSC 120
        // print out 'You have taken MTH 110. \n You have taken MTH 153 \n You have taken CSC 110. \n I recommend you take CSC 120. '

    }

    

    public boolean equals(Object o){
        if(o instanceof Course){
            Course c= (Course)o;
            return c.title.equals(this.title);
        }else{
            return false;
        }
    }
    public String getTitle(){
        return this.title;
    }

    

    // public static void main(String[] args) {
    //     Course course1=  new Course( "csc 120", 4, "razie", null);
    //     System.out.println(course1);
    //     ArrayList< Course> preq= new ArrayList<>();
    //     preq.add(course1);
    //     Course course2= new Course("csc 210", 4, "nick",preq );
    //     System.out.println(course2);
    //     preq.clear();
    //     preq.add(course2);
    //     Course course3= new Course("csc 231", 4, "Jamie",preq );
    //     System.out.println(course3);
    //     // Course course2=  new Course( "csc 120", 4, "razie", null);
    //     // System.out.println(course1.equals(course2));
    // }

    }

    


