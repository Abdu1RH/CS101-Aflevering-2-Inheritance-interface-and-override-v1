public class Teacher extends SchoolEmployees {
    private String teacherName;
    private String teacherInitials;


    public Teacher(String jobTitle, String name, String teacherName, String teacherInitials) {
        super(jobTitle, name);
        this.teacherName = teacherName;
        this.teacherInitials = teacherInitials;
    }

    public String getTeacherInfo(){
        return teacherName + teacherInitials;
    }
}
