package class3;

public class NestedIfElse {
    public static void main(String[] args) {
        boolean mainDoor = true;
        boolean room1 = true;
        boolean room2 = false;
        if (mainDoor) {
            if (room1) {
                System.out.println("room 1 is open");
            } else {
                System.out.println("room 1 is closed");
            }if (room2){
                System.out.println("room 2 is open");
            }else{
                System.out.println("room 2 is closed");
            }

        } else {
            System.out.println("main door is closed");
        }
    }
}
