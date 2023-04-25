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
        Scanner scanner= new Scanner(System.in);
        ArrayList<String> course_name = new ArrayList<>();
        ArrayList<String> course_credit = new ArrayList<>();
        ArrayList<String> professor = new ArrayList<>();
        ArrayList<String> timeoffered = new ArrayList<>();
        ArrayList<String> prior_courses = new ArrayList<>();
        int year = 2023;
        System.out.print("How many courses have you taken so far? ");
        int num_prior_courses = scanner.nextInt();
        String prev_course;
        for (int i = 0; i < num_prior_courses; i++){
            System.out.print("Enter course: ");
            prev_course = scanner.nextLine();
        }
        System.out.print("How many semesters do you have left at Smith (not including this semester)? ");
        int semesters_left = scanner.nextInt();
        String season = "Fall";
        for(int j = 0; j < semesters_left; j++){
            System.out.print("How many courses do you want to add for " + season + year + "?");
            int input= scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < input; i++){
            System.out.print("Enter the course name: ");
            String course_input= scanner.nextLine();
            course_name.add(course_input);
            System.out.print("Does this course have any prerequisite courses? (yes or no) ");
            String prereq = scanner.nextLine();
            prereq.toLowerCase();
            if (prereq.equals("yes")){
                System.out.print("How many prerequisite courses does " + course_input + " have? ");
                int num_prereq = scanner.nextInt();
                String this_prereq;
                for (int k = 0; k < num_prereq; k++){
                    System.out.print("Enter prerequisite course: ");
                    this_prereq = scanner.nextLine();
                    if (prior_courses.contains(this_prereq)){
                        continue;
                    } else{
                        System.out.print("You cannot take " + course_input + " because you have not taken " + this_prereq + ".");
                        break;
                    }
                }
            }

            System.out.print("Enter the credit numbers: ");
            String credit_input= scanner.nextLine();
            course_credit.add(credit_input);
            if (j % 2 == 0){
                season = "Spring ";
            } else{
                season = "Fall ";
            }
        }
    }
       

        
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
