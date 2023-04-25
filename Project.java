import java.util.Scanner;
import java.util.ArrayList;
// import.java.util.Arrays;
// import java.util.HashTable;
public class Project {
    ArrayList<String> course_name=  new ArrayList<> ();
    ArrayList<String> course_credit=  new ArrayList<> ();
    ArrayList<String> professor=  new ArrayList<> ();
    ArrayList<String> offered=  new ArrayList<> ();
    public Project(ArrayList<String> courses, ArrayList<String> credits, ArrayList<String> professor, ArrayList<String> offered){
        this.course_name= courses;
        this.course_credit= credits;
        this.professor= professor;
        this.offered= offered;

    }
    public void schedule_partone(){
        ArrayList<String> class_schedule=  new ArrayList<> ();
        for(int i= 0; i < this.course_name.size(); i++){
            class_schedule.add(this.course_name.get(i) + this.course_credit.get(i) + this.professor.get(i) + this.offered.get(i));
            // if(this.offered.get(i).equals("Fall")){

            // }
        }
        schedule_parttwo(class_schedule);
    }
    public void schedule_parttwo(ArrayList<String> class_schedule){
        System.out.println("******** Schedule ********");
        for (int i= 0; i < this.course_name.size(); i++){
            System.out.println(this.course_name.get(i) + " " + this.course_credit.get(i) + " " + this.professor.get(i)+ " " +this.offered.get(i));
            
        }

    }
    public static void main( String[] args){
        ArrayList<String> course_name = new ArrayList<>();
        ArrayList<String> course_credit = new ArrayList<>();
        ArrayList<String> professor = new ArrayList<>();
        ArrayList<String> timeoffered = new ArrayList<>();
        System.out.println("How many courses do u want to add");
        Scanner scanner= new Scanner(System.in);
        int input= scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i< input; i++){
            System.out.println("Enter the course name:");
            String course_input= scanner.nextLine();
            course_name.add(course_input);
            System.out.println("Enter the credit numbers");
            String credit_input= scanner.nextLine();
            course_credit.add(credit_input);
            System.out.println("Enter the professor name:");
            String professor_input= scanner.nextLine();
            professor.add(professor_input);
            System.out.println("When is it offered Spring or Fall?");
            String semester= scanner.nextLine();
            // if (scanner.get(i)equals("Fall"));
            timeoffered.add(semester);
        }
        // if(timeoffered.get(i).equals("Fall")){
        //     ArrayList<String> fallsemester= new ArrayList<>();
        //     fallsemester.add(timeoffered.get(i));
        //     timeoffered.remove(i);
        // }

        
        // ArrayList<String> course_name = new ArrayList<>();
        // //course_name.addAll(Arrays.asList("CSC 110", "CSC 120", "CSC 212", "CSC 231", "CSC 250"));
        // course_name.add("CSC110");
        // course_name.add("CSC120");
        // ArrayList<String> course_credit = new ArrayList<>();
        // course_credit.add("4");
        // course_credit.add("5");
        // //{"4","4","4","4","4"};
        // ArrayList<String> professor = new ArrayList<>();
        // professor.add("Shingyong");
        // professor.add("Jordan");
        // //{"Shingyong", "Jordan", "unknown","unknown","unknown"};
        Project schedule = new Project(course_name, course_credit, professor, timeoffered);
        schedule.schedule_partone();
        scanner.close();
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
