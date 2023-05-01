import java.util.Hashtable;
import java.util.ArrayList;
public class Major{
    private Hashtable<Course, Boolean> classes;

    public Major(){
        this.classes= new Hashtable< Course, Boolean>();
        ArrayList<Course> preReq = new ArrayList<>();
        ArrayList<Course> majorCourses = new ArrayList<>();

        Course c_110 = new Course("CSC 110", 4, "Shinyoung Cho", preReq);
        this.classes.put(c_110,false);
        majorCourses.add(c_110);

        Course m_111 = new Course("MTH 111", 4, "Jennifer Beichman", preReq);
        this.classes.put(m_111, false);
        majorCourses.add(m_111);

        preReq.add(c_110);
        Course c_120 = new Course("CSC 120", 4, "Jordan Crouser", preReq);
        this.classes.put(c_120, false);
        majorCourses.add(c_120);

        preReq.clear();
        Course m_153 = new Course("MTH 153", 4, "Ileanu Vasu", preReq);
        this.classes.put(m_153, false);
        majorCourses.add(m_153);

        preReq.clear();
        preReq.add(c_120);
        Course c_210 = new Course("CSC 210", 4, "Nicholas Howe", preReq);
        this.classes.put(c_210, false);
        majorCourses.add(c_210);

        preReq.clear();
        preReq.add(c_210);
        Course c_231 = new Course("CSC 231", 4, "Michael Robson", preReq);
        this.classes.put(c_231, false);
        majorCourses.add(c_231);

        preReq.clear();
        preReq.add(c_120);
        preReq.add(m_153);
        Course c_250 = new Course("CSC 250", 4, "Pablo Bolton", preReq);
        this.classes.put(c_250, false);
        majorCourses.add(c_250);

        preReq.clear();
        preReq.add(c_110);
        preReq.add(m_111);
        Course c_240 = new Course("CSC 240", 4, "Nicholas Howe", preReq);
        this.classes.put(c_240, false);
        majorCourses.add(c_240);

        preReq.clear();
        preReq.add(c_210);
        Course c_251 = new Course("CSC 251", 4, "Shinyoung Cho", preReq);
        this.classes.put(c_251, false);
        majorCourses.add(c_251);

        Course c_223 = new Course("CSC 223", 4, "Johanna Brewer", preReq);
        this.classes.put(c_223, false);
        majorCourses.add(c_223);


        preReq.clear();
        preReq.add(c_231);
        Course c_262 = new Course("CSC 262", 4, "Jamie MacBeth", preReq);
        this.classes.put(c_262, false);
        majorCourses.add(c_262);

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
        majorCourses.add(c_327);




       
    }
    

}