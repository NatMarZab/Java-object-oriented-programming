public class Main {
    public static void main(String[] args) {
        Employee collaborativeEmployee = new Employee("Alexa", "Martin", 33, 1500, "Madrid");
        Employee lessCollaborativeEmployee = new Employee( "Berta", "Blanco", 33, 1500, "Madrid");

        collaborativeEmployee.raiseSalary();
        System.out.println(collaborativeEmployee.firstName + " has got a salary rise to " + collaborativeEmployee.salary);
        System.out.println(lessCollaborativeEmployee.firstName + " maintains a salary of " + lessCollaborativeEmployee.salary);
    }
}
