/*
package bilvania.gmail.com.transportSystemManager;

import java.util.Scanner;

public class TransportFactory {
    public static Transport createTransport(TransportType type, Scanner scanner) {
        String model;
        int year;
        Transport transport = null;


        switch (type) {
            case CAR:
                scanner.nextLine();
                System.out.println("Please enter model of car");
                model = scanner.nextLine();
                System.out.println("Please enter year: ");
                year = scanner.nextInt();
                System.out.println("Please enter engine volume: ");
                double engineVolume = scanner.nextDouble();
                transport = new Car(model, year, engineVolume);


                break;
            case BUS:
                scanner.nextLine();
                System.out.println("Please enter model of bus");
                model = scanner.nextLine();
                System.out.println("Please enter year: ");
                year = scanner.nextInt();
                System.out.println("Please enter weight: ");
                double weight = scanner.nextDouble();
                transport = new Bus(model, year, weight);
                break;

            case BIKE:
                scanner.nextLine();
                System.out.println("Please enter model of bike: ");
                model = scanner.nextLine();
                System.out.println("Please enter year: ");
                year = scanner.nextInt();
                System.out.println("Is there a passenger seat?: ");
                boolean passengerSeat = scanner.nextBoolean();
                transport = new Bike(model, year, passengerSeat);
                break;

            case SCOOTER:
                scanner.nextLine();
                System.out.println("Please enter model of skooter: ");
                model = scanner.nextLine();
                System.out.println("Please enter year: ");
                year = scanner.nextInt();
                System.out.println("Please enter amount of exhaust : ");
                double exhaustAmount = scanner.nextDouble();
                transport = new Scooter(model, year, exhaustAmount);
                break;

            default:
                System.out.println("Invalid choice");


        }
        return transport;
    }
}

*/
