import java.util.Scanner;
import java.util.ArrayList;
public class Schedule {
    Major cs_major = new Major();

    public void recommend(){
        
    }

    public static void main(String[] args) {
        Course newCourse;
        Scanner input = new Scanner(System.in);
        ArrayList<Course> prevCourses = new ArrayList<>();
        System.out.println("Hi. How manny courses have you taken so far?");
        int numCourses = input.nextInt();
        String course_name;
        int num_credits;
        String prof;

        for(int i = 0; i < numCourses; i++){
            System.out.print("Enter course name: ");
            course_name = input.nextLine();
            System.out.print("Enter number of credits: ");
            num_credits = input.nextInt();
            System.out.print("Enter the professor name: ");
            prof = input.nextLine();

            
            //prevCourses.add
        }
    }
}
