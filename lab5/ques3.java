package lab5;


interface Employee {
    void earnings();
    void deductions();
    void bonus();
}

class Manager implements Employee {
    int basic;

    Manager(int basic) {
        this.basic = basic;
    }

    public void earnings() {
        System.out.println("Earnings - " + (basic + 0.8 * basic + 0.15 * basic));
    }

    public void deductions() {
        System.out.println("Deductions - " + 0.12 * basic);
    }

    public void bonus(){}

}

class Substaff extends Manager {
    Substaff(int basic) {
        super(basic);
    }

    public void bonus() {
        System.out.println("Bonus - " + 0.5 * basic);
    }
}


public class ques3 {

    public static void main(String[] args) {

        Substaff s = new Substaff(50000);
        s.earnings();
        s.deductions();
        s.bonus();
        
    }
    
}
