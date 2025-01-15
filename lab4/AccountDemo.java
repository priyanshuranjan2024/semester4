import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.println("Enter account number and balance:");
        acc_no = sc.nextInt();
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No: " + acc_no + ", Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    void input(Scanner sc) {
        super.input(sc);
        sc.nextLine(); // Consume newline
        System.out.println("Enter name and Aadhar number:");
        name = sc.nextLine();
        aadhar_no = sc.nextLine();
    }

    @Override
    void disp() {
        super.disp();
        System.out.println("Name: " + name + ", Aadhar No: " + aadhar_no);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(sc);
        }

        System.out.println("\nDetails of Persons:");
        for (Person p : persons) {
            p.disp();
            System.out.println();
        }

        sc.close();
    }
}
