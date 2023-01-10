import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(2,3,4);
        Cargo cargo = new Cargo(10, "Tomsk", false, "000001", true, 2, 3, 4);


        System.out.println(cargo.getVolume());



//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }
    }



}