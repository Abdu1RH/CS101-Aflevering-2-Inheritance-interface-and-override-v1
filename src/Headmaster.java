public class Headmaster extends SchoolEmployees {
    private String headmasterName;
    private String headmasterInitials;


    public Headmaster(String jobTitle, String name, String headmasterName, String headmasterInitials) {
        super(jobTitle, name);
        this.headmasterName = headmasterName;
        this.headmasterInitials= headmasterInitials;
    }

    public String getHeadmasterInfo() {
        return headmasterName + headmasterInitials;
    }
}
