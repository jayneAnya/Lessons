public class Manager extends Employee {
    private String department;

    public Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
   @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Department : " + department);
   }

}
