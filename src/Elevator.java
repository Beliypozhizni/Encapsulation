public class Elevator {
    private final int minFloor;
    private final int maxFloor;
    private int currentFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor--;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void move(int floor) {
        if (floor == currentFloor) {
            return;
        }
        if (floor >= minFloor && floor <= maxFloor) {
            while (floor < currentFloor || floor > currentFloor) {
                if (floor < currentFloor) {
                    moveDown();
                } else {
                    moveUp();
                }
                System.out.println("Текущий этаж: " + currentFloor);
            }
        } else {
            System.out.println("Указан несуществующий этаж");
        }
    }
}
