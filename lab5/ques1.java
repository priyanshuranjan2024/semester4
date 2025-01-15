    package lab5;


    abstract class student {
        int rollno;
        int regno;

        abstract void course();

        void getinput(int rollno, int regno) {
            this.rollno = rollno;
            this.regno = regno;
        }
    }

    class kiitian extends student {
        void course() {
            System.out.println("Course - B.Tech. (Computer Science & Engg)");
        }
    }

    public class ques1 {

        public static void main(String[] args) {

            kiitian k = new kiitian();
            k.getinput(2205180, 1234567890);
            System.out.println("Rollno - " + k.rollno);
            System.out.println("Registration no - " + k.regno);
            k.course();
            
        }
        
    }
