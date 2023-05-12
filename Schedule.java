// import java.util.ArrayList;
public class Schedule{
    // private ArrayList<Course> recommendedClass= new ArrayList<>();
    // public void recommend(){
    //     this.recommendedClass= recommendedClass;
    //         for( Course c: this.classes.keySet()){
    //             if (this.classes.get(c)){
    //                     taken.add(c);
    //             }
    //         }
    //         return taken;
    // }
    // public void recommend(){
    //     for(Course c: this.classes){
    //         if(c.containsAll(prereqs)&& c.title.equals(this.title)){
    //             System.out.println("I recommend you to take "+ c+"course.");
    //         }
    //     }





    // ArrayList<Course> taken= new ArrayList<>();
    //         for( Course c: this.classes.keySet()){
    //             if (this.classes.get(c)){
    //                 taken.add(c);
    //             }
    //         }
    //         return taken;
    // }
    /*
     * The only thing we do in the schedule is create a main method that calls Major.java
     */
    

    public static void main(String[] args) {

        Major newmajor= new Major();
        newmajor.setTaken();
        System.out.println(newmajor);
    }

}


