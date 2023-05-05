import java.util.Scanner;
import java.util.ArrayList;
public class Schedule {
    Major cs_major = new Major();

// add javadic for all methods    

    public void recommend(){
        int x = 0;
        while (!cs_major.cantake()){
            System.out.print("hi");
        }
        
    }

    public static void main(String[] args) {
        System.out.print("hi");
        Course newCourse;
        Scanner input = new Scanner(System.in);
        ArrayList<Course> prevCourses = new ArrayList<>();
        System.out.println("Hi. How many courses have you taken so far?");
        int numCourses = input.nextInt();
        String course_name;
        int num_credits;
        String prof;
        ArrayList<Course> prevCoursesPreReqs = new ArrayList<>();

        // figure out a way to print the major in a numbered list and have the user choose which classes they've by say 1, 2, etc.@interface
        // for(int i = 0; i < numCourses; i++){
        //     System.out.print("Enter course name: ");
        //     course_name = input.nextLine();
        //     System.out.print("Enter number of credits: ");
        //     num_credits = input.nextInt();
        //     System.out.print("Enter the professor name: ");
        //     prof = input.nextLine();
        //     System.out.print("How many prerequisite courses does this class have? ");
        //     int num = input.nextInt();
        //     ArrayList<Course> empty = new ArrayList<>();
        //     for (int j = 0; j < num; j++){
        //         System.out.print("Enter prerequisite course: ");
        //         String preCourse = input.nextLine();
        //         System.out.print("Enter the number of credits: ");
        //         int numC = input.nextInt();
        //         System.out.print("Enter the professor name: ");
        //         String profName = input.nextLine();
        //     Course course = new Course(course_name, num_credits, prof, prevCoursesPreReqs);
            }
}
    
