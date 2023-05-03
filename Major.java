import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Scanner;
public class Major{
    private Hashtable<Course, Boolean> classes;
    private String name= "CSC mAJOR";

    public Major(){
        this.classes= new Hashtable< Course, Boolean>();
        ArrayList<Course> preReq = new ArrayList<>();
        

        Course c_110 = new Course("CSC 110", 4, "Shinyoung Cho", preReq);
        this.classes.put(c_110,false);
        

        Course m_111 = new Course("MTH 111", 4, "Jennifer Beichman", preReq);
        this.classes.put(m_111, false);
       

        preReq.add(c_110);
        Course c_120 = new Course("CSC 120", 4, "Jordan Crouser", preReq);
        this.classes.put(c_120, false);
        

        preReq.clear();
        Course m_153 = new Course("MTH 153", 4, "Ileanu Vasu", preReq);
        this.classes.put(m_153, false);
        

        preReq.clear();
        preReq.add(c_120);
        Course c_210 = new Course("CSC 210", 4, "Nicholas Howe", preReq);
        this.classes.put(c_210, false);
        

        preReq.clear();
        preReq.add(c_210);
        Course c_231 = new Course("CSC 231", 4, "Michael Robson", preReq);
        this.classes.put(c_231, false);
        

        preReq.clear();
        preReq.add(c_120);
        preReq.add(m_153);
        Course c_250 = new Course("CSC 250", 4, "Pablo Bolton", preReq);
        this.classes.put(c_250, false);
        

        preReq.clear();
        preReq.add(c_110);
        preReq.add(m_111);
        Course c_240 = new Course("CSC 240", 4, "Nicholas Howe", preReq);
        this.classes.put(c_240, false);
       

        preReq.clear();
        preReq.add(c_210);
        Course c_251 = new Course("CSC 251", 4, "Shinyoung Cho", preReq);
        this.classes.put(c_251, false);
        

        Course c_223 = new Course("CSC 223", 4, "Johanna Brewer", preReq);
        this.classes.put(c_223, false);
        


        preReq.clear();
        preReq.add(c_231);
        Course c_262 = new Course("CSC 262", 4, "Jamie MacBeth", preReq);
        this.classes.put(c_262, false);
        

        preReq.clear();
        preReq.add(c_110);
        preReq.add(m_111);
        preReq.add(c_120);
        preReq.add(m_153);
        preReq.add(c_210);
        preReq.add(c_231);
        preReq.add(c_250);
        Course c_327 = new Course("CSC 327", 4, "Shinyoung Cho", preReq);
        this.classes.put(c_327, false);
        




       
    }
    public String toString(){
        String des= this.name;
        for (Course c: this.classes.keySet()){
            des+= "\n" + c.toString() +" [" + this.classes.get(c)+ "]";
        }
        return des;
    }
    public void setTaken(){
        Scanner scanner= new Scanner(System.in);
        String response= " ";
        for (Course c: this.classes.keySet()){
            System.out.println("Have you taken this :"+ c.getTitle()+ " ? y or n");
            response= scanner.nextLine();
            if(response.contains("y")){
                this.classes.replace(c,true);
            }
        }

        
    }
    public static void main(String[] args) {
        // Course c_120 = new Course("CSC 120", 4, "Jordan Crouser", null);

        Major newmajor= new Major();
        newmajor.setTaken();
        System.out.println(newmajor);
    }

}
