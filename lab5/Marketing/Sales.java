package lab5.Marketing;

import lab5.General.Employee;


public class Sales extends Employee{

    public Sales(int empid, String ename, int basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return (0.05 * earnings());
    }
    

    public static void main(String[] args) {
        Sales s = new Sales(123, "Amit", 1000);
        System.out.println("The emp id of the employee is " + s.empid);
        System.out.println(s.tallowance());
        
    }
    
}

