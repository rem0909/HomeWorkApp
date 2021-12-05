package hw5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Daniel DD", "Ingeneer", "mail1", "8914444", 1000, 30),
                new Employee("Mark Cukerbeb", "CEO", "mail2", "8914444", 200, 55),
                new Employee("Alen Lilon", "Marketing", "mail3", "8914444", 3000, 40),
                new Employee("Shvarcnold Arneger", "MR.Olympia", "mail4", "8914444", 8000, 88)
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40)
            {
                System.out.println(employee);
            }

        }

    }
}
