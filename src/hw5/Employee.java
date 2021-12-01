package hw5;

public class Employee {
    private String fullName;
    private String position;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String eMail, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    //@Override
   public String toString() {
       return String.format("Employee: %-18s Аge:%d position: %-11s Phone number: %-11s Salary:%-6d  Email: %s "
               ,this.fullName, this.age, this.position,this.phoneNumber,this.salary ,this.eMail );}

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
