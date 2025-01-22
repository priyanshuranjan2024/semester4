import java.util.Scanner;

class HrsException extends Exception{
    public HrsException(String s){
        super(s);
    }
}

class MinException extends Exception{
    public MinException(String s){
        super(s);
    }
}

class SecException extends Exception{
    public SecException(String s){
        super(s);
    }
}

//define the Time class
class Time{
    private int hours;
    private int minutes;
    private int seconds;

    //setter for time and seconds
    public void setTime(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Invalid hours: " + hours + ". Hours must be between 0 and 24.");
        }
        if (minutes < 0 || minutes >= 60) {
            throw new MinException("Invalid minutes: " + minutes + ". Minutes must be between 0 and 59.");
        }
        if (seconds < 0 || seconds >= 60) {
            throw new SecException("Invalid seconds: " + seconds + ". Seconds must be between 0 and 59.");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //getter for time
    public void displayTime(){
        System.out.println("Time: "+hours+":"+minutes+":"+seconds);
    }

}

//main entry class and main entry point
public class ques4{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time();

        try {
            // Taking input for hours, minutes, and seconds
            System.out.print("Enter hours: ");
            int hours = scanner.nextInt();

            System.out.print("Enter minutes: ");
            int minutes = scanner.nextInt();

            System.out.print("Enter seconds: ");
            int seconds = scanner.nextInt();

            // Setting time
            time.setTime(hours, minutes, seconds);

            // Displaying the time if no exception occurs
            time.displayTime();
        } catch (HrsException | MinException | SecException e) {
            // Handling custom exceptions
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handling unexpected exceptions
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}