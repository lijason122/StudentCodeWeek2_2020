package ca.sheridancollege.softwarefundamentals.week1;

/**
 * This class to model, part time
 *
 * @author Jason Li
 */
public class PartTimeStudent extends Student {
    private int hoursOfStudy;
    public PartTimeStudent(String givenName, String givenID) {
        super(givenName, givenID);
    }

    /**
     * @return the hoursOfStudy
     */
    public int getHoursOfStudy() {
        return hoursOfStudy;
    }

    /**
     * @param hoursOfStudy the hoursOfStudy to set
     */
    public void setHoursOfStudy(int hoursOfStudy) {
        this.hoursOfStudy = hoursOfStudy;
    }
    
}
