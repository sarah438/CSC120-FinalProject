// import java.util.Scanner;
import java.util.ArrayList;
// import.java.util.Arrays;
// import java.util.HashTable;
public class Project {
    ArrayList<String> course_name=  new ArrayList<> ();
    // private String course_name [];
    ArrayList<String> course_credit=  new ArrayList<> ();
    //private String course_credit [];
    //private String Professor [];
    ArrayList<String> professor=  new ArrayList<> ();
    public Project(ArrayList<String> courses, ArrayList<String> credits, ArrayList<String> professor){
        this.course_name= courses;
        this.course_credit= credits;
        this.professor= professor;
    }
    public void schedule_partone(){
        ArrayList<String> class_schedule=  new ArrayList<> ();
        for(int i= 0; i < 12; i++){
            class_schedule.add(this.course_name.get(i) + this.course_credit.get(i) + this.professor.get(i));

        }
        schedule_parttwo(class_schedule);
    }
    public void schedule_parttwo(ArrayList<String> class_schedule){
        for (int i= 0; i < 12; i++){
            String data= class_schedule.get(i);
            System.out.println(this.course_name.get(i) + " " + this.course_credit + " " + this.professor);
            System.out.println(data);
        }

    }
    public static void main( String[] args){
        
        ArrayList<String> course_name = new ArrayList<>();
        //course_name.addAll(Arrays.asList("CSC 110", "CSC 120", "CSC 212", "CSC 231", "CSC 250"));
        course_name.add("CSC110");
        course_name.add("CSC120");
        ArrayList<String> course_credit = new ArrayList<>();
        course_name.add("4");
        course_name.add("5");
        //{"4","4","4","4","4"};
        ArrayList<String> professor = new ArrayList<>();
        course_name.add("Shingyong");
        course_name.add("Jordan");
        //{"Shingyong", "Jordan", "unknown","unknown","unknown"};
        Project schedule = new Project(course_name, course_credit, professor);
        schedule.schedule_partone();
    }

    // private ArrayList<String> classes = new ArrayList<String>();
    // classes.add("csc 110");
    // classes.add("csc 120");
    // classes.add("csc 212");
    // classes.add("csc 231");
    // classes.add("csc 250");
    // System.out.println("What class are you");
    // Scanner input = new Scanner( System.in());
    // String userinput= input.nextLine();
    // this. userinput= userinput;
    
    // public class first_year(){
        
    // }
}