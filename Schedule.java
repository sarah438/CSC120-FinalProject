public class Schedule {
    /*
     * The only thing we do in the schedule is create a main method that calls Major.java
     */
    

    public static void main(String[] args) {

        Major newmajor= new Major();
        newmajor.setTaken();
        System.out.println(newmajor);
    }

}


