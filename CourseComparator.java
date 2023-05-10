import java.util.Comparator;
public class CourseComparator implements Comparator<Course>{
    @Override
    /*
     * This function compares our two parameters.getTitle 
     * Hence the main thing that this method is doing is to compare the two parameters and then sort them out later when it's called in the major class.
     * @Param Course c1
     * @Param Course cs
     * returns the int in a sorted out way.
     */
    public int compare(Course c1, Course c2) {
        return c1.getTitle().compareTo(c2.getTitle());
    }
}

