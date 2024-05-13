class Employee {
    double basicSalary;

    Employee(double basic) {
        basicSalary = basic;
    }

    double calculateRegularSalary() {
        double da = 0.75 * basicSalary;
        double hra = 0.15 * basicSalary;
        double ma = 1000.00;
        return (basicSalary + da + hra + ma);
    }
}

class Scientist extends Employee{
    double bonus;

    Scientist(double ba, double bo){
        super(ba);
        bonus = bo;
    }

    double netSalary(){
        return (bonus + super.calculateRegularSalary());
    }
}
class Developer extends Employee{
    double bonus;

    Developer(double ba, double bo){
        super(ba);
        bonus = bo;
    }

    double netSalary(){
        return (bonus + super.calculateRegularSalary());
    }
}
class ProjectLeader extends Employee{
    double bonus;

    ProjectLeader(double ba, double bo){
        super(ba);
        bonus = bo;
    }

    double netSalary(){
        return (bonus + super.calculateRegularSalary());
    }
}

class EmployeeSalary {
    public static void main(String[] args) {
        Scientist sc = new Scientist(1000, 1000);
        Developer dv = new Developer(2000, 3000);
        ProjectLeader pl = new ProjectLeader(3000, 5000);
        System.out.println("Net Salary of Scientist is: " +sc.netSalary());
        System.out.println("Net Salary of Developer is : "+dv.netSalary());
        System.out.println("Net Salary of Project Leader is : "+pl.netSalary());
    }
}
