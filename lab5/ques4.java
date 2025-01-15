package lab5;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    int empid;
    String ename;
    int deptid;
    String deptname;

    public void getDetails() {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + ename);
    }

    public void getDeptDetails() {
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }

    Head(int empid, String ename, int deptid, String deptname) {
        this.empid = empid;
        this.ename = ename;
        this.deptid = deptid;
        this.deptname = deptname;
    }
}



public class ques4 {

    public static void main(String[] args) {

        Head h = new Head(123, "Sidharth Ambani", 06, "Marketing");
        h.getDetails();
        h.getDeptDetails();
        
    }
    
}
