import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(2,3,4);
        Cargo cargo = new Cargo(10, "Tomsk", false, "000001", true, dimensions);
        System.out.println(cargo);
        Dimensions newDimensions = dimensions.setDimensions(3, 4,5);
        cargo = cargo.setCargo(20, "Moskow", true, "000002", false, newDimensions);
        System.out.println(cargo);


//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }
    }
}