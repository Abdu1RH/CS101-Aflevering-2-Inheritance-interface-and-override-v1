public class SchoolEmployees {
    private String jobTitle;
    private String name;

    public SchoolEmployees (String jobTitle, String name){
        this.jobTitle = jobTitle;
        this.name = name;

    }

    public String getJobTitle(){
        return jobTitle + name;
    }

}


