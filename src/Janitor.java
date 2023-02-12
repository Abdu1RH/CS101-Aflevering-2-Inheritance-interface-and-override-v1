public class Janitor extends SchoolEmployees {
    private String janitorName;

    private String janitorInitials;


    public Janitor(String jobTitle, String name, String janitorName, String janitorInitials) {
        super(jobTitle, name);
        this.janitorName = janitorName;
        this.janitorInitials = janitorInitials;
    }
    public String getJanitorInfo(){
        return janitorName + janitorInitials;
    }
}
