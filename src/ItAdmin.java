public class ItAdmin extends SchoolEmployees{
    private String itAdminName;
    private String itAdminInitials;


    public ItAdmin(String jobTitle, String name, String itAdminName, String itAdminInitials) {
        super(jobTitle, name);
        this.itAdminName = itAdminName;
        this.itAdminInitials = itAdminInitials;
    }

    public String getItAdminInfo() {
        return itAdminName + itAdminInitials;
    }
}
