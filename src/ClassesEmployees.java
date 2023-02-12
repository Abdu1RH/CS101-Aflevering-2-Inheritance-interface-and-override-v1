public class ClassesEmployees extends SchoolEmployees{

    private String studentNames;
    private String classNames;


    public ClassesEmployees(String jobTitle, String name, String studentNames, String classNames) {
        super(jobTitle, name);
        this.studentNames = studentNames;
        this.classNames = classNames;
    }

    public String getClassesEmployeesInfo() {
        return studentNames + classNames;
    }
}
