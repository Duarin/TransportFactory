package bilvania.gmail.com.transportSystemManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Transport> transports = new ArrayList<>();

        System.out.println("How many transport you want to add?");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Which transport you want to add?");
            System.out.println("""
                    1)Car
                    2)Bus
                    3)Bike
                    4)Skooter
                    5)Exit
                    """);


            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Transport car = TransportFactory.createTransport(TransportType.CAR, sc);
                    if (car != null) {
                        transports.add(car);
                    } else {
                        System.out.println("Invalid transport type");
                        i--;
                    }
                    break;
                case 2:
                    Transport bus = TransportFactory.createTransport(TransportType.BUS, sc);
                    if (bus != null) {
                        transports.add(bus);
                    } else {
                        System.out.println("Invalid transport type");
                        i--;
                    }
                    break;
                case 3:
                    Transport bike = TransportFactory.createTransport(TransportType.BIKE, sc);
                    if (bike != null) {
                        transports.add(bike);
                    } else {
                        System.out.println("Invalid transport type");
                        i--;
                    }
                    break;
                case 4:
                    Transport scooter = TransportFactory.createTransport(TransportType.SCOOTER, sc);
                    if (scooter != null) {
                        transports.add(scooter);
                    } else {
                        System.out.println("Invalid transport type");
                        i--;
                    }
                    break;
                case 5:
                    System.out.println("Good Bye!");
                    return;
                default:
                    System.out.println("Invalid choice");
                    i--;
            }
        }
        System.out.println("--------TOTAL INFORMATION-------");
        for (Transport transport : transports) {
            InfoPrinter.printInfo(transport);
            transport.start();
            transport.stop();
            System.out.println("--------------------------------");
        }
    }
}
