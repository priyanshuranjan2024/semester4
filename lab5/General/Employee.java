package lab5.General;

// In General
// package define a class ‘employee’ with data members as empid(protected), ename(private)
// and a public method as earnings() which calculate total earnings as
// earnings basic + DA (80% of basic) + HRA (15% of basic)



public class Employee {
    protected int empid;
    private String ename;
    int basic;

    public Employee(int empid, String ename, int basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }

    public double earnings() {
        return (basic + 0.8 * basic + 0.15 * basic);
    }

    public void getName() {
        System.out.println("Employee name - " + ename);
    }
  
}
