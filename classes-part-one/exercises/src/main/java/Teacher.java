public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yrsTeaching;


    private String getFirstName() {
        return firstName;
    }
    private String getLastName() {
        return lastName;
    }
    private String getSubject() {
        return subject;
    }
    private int getYrsTeaching() {
        return yrsTeaching;
    }


    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }
    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }
    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }
    public void setYrsTeaching(int aYrsTeaching) {
        this.yrsTeaching = aYrsTeaching;
    }
}