class Employee {
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee ID: " + id + " Name: " + name);
    }

    public String getName() {
        return name;
    }
}

