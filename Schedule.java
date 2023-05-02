import java.util.ArrayList;
public class Course {
    private String title;
    private int credit;
    private String professor;
    private ArrayList<Course> prereqs;


//Add javadoc explaining what certain parts of the code does.

   // ArrayList<Course> prereqs;
    public Course(String title, int n_credits, String professor, ArrayList<Course> givenpreqs){
        this.title= title;
        this.credit= n_credits;
        this.professor= professor;
        //this.prereqs= givenpreqs;
        for (Course c: givenpreqs) {
            this.prereqs.add(c);
        }

    }
    public boolean cantake(ArrayList<Course> alreadytaken){
        return alreadytaken.containsAll(this.prereqs);

    }
    public boolean isprereqs(Course c){
        return this.prereqs.contains(c);
    }


    

}

