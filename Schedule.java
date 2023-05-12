// import java.util.ArrayList;
public class Schedule{
    
    // public void recommend(){
    //     for(Course c: this.classes){
    //         if(c.containsAll(prereqs)&& c.title.equals(this.title)){
    //             System.out.println("I recommend you to take "+ c+"course.");
    //         }
    //     }

    /*
     * The only thing we do in the schedule is create a main method that calls Major.java
     */
    

    public static void main(String[] args) {

        Major newmajor= new Major();
        newmajor.setTaken();
        System.out.println(newmajor);
    }

}


