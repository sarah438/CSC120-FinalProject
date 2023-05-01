import java.util.ArrayList;
public class Course {
    private String title;
    private int credit;
    private String professor;
    private ArrayList<Course> prereqs;

   // ArrayList<Course> prereqs;
    public Course(String title, int n_credits, String professor, ArrayList<Course> givenpreqs){
        this.title= title;
        this.credit= n_credits;
        this.professor= professor;
        this.prereqs= givenpreqs;

    }
    public boolean isprereqs(Course c){
        return this.prereqs.contains(c);
    }


    

}

