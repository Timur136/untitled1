package OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int toX = in.nextInt();
        int toY = in.nextInt();
        Robot robot = new Robot();
        if (toX >= 0 && toY >= 0) {
            for (int i = 0; i < toY; i++) {
                robot.stepForward();
            }
            robot.turnRight();
            for (int i = 0; i < toX; i++) {
                robot.stepForward();
            }
        }
        if (toX <= 0 && toY >= 0) {
            for (int i = 0; i < toY; i++) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int i = 0; i < Math.abs(toX); i++) {
                robot.stepForward();
            }
        }
        if (toX <= 0 && toY <= 0) {
            robot.turnLeft();
            for (int i = 0; i < Math.abs(toX); i++) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int i = 0; i < Math.abs(toY); i++) {
                robot.stepForward();
            }
        }
        if (toX > 0 && toY <= 0){
            robot.turnRight();
            for (int i = 0; i < toX; i++) {
                robot.stepForward();
            }
            robot.turnRight();
            for (int i = 0; i <Math.abs(toY) ; i++) {
                robot.stepForward();
            }
        }
    }
}
