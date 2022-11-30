import java.util.*;

public class Main {

    Scanner in = new Scanner(System.in);
    static Main main = new Main();

    private int power;

    public static void main(String[] args) throws Exception {
        main.startProgram();
    }

    public void startProgram() {
        queryUser();
        System.out.println("Power: " + getPower());
    }

    public void queryUser() {
        System.out.print("Enter value of voltage: ");
        int voltage = in.nextInt();
        System.out.print("Enter value of current: ");
        int current = in.nextInt();

        setPower(voltage, current);
    }

    public void setPower(int voltage, int current) {
        power = voltage * current;
    }

    public int getPower() {
        return power;
    }
}