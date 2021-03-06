package OOP;

public class Robot {
    final static int s = 2;

    public Direction getDirection() {
        return Direction.DOWN;
        // текущее направление взгляда
    }

    public int getX() {
        return 1;
        // текущая координата X
    }

    public int getY() {
        return 2;
        // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
