package bilvania.gmail.com.transportSystemManager;

import java.util.Scanner;

public enum TransportType {

    CAR(1) {
        @Override
        public Transport create(Scanner sc) {
            sc.nextLine();
            System.out.println("Please enter model of car");
            String model = sc.nextLine();
            System.out.println("Please enter year: ");
            int year = sc.nextInt();
            System.out.println("Enter engine volume:");
            double engineVolume = sc.nextDouble();
            return new Car(model, year, engineVolume);
        }
    },
    BUS(2) {
        @Override
        public Transport create(Scanner sc) {
            sc.nextLine();
            System.out.println("Please enter model of bus");
            String model = sc.nextLine();
            System.out.println("Please enter year: ");
            int year = sc.nextInt();
            System.out.println("Enter bus weight:");
            double weight = sc.nextDouble();
            return new Bus(model, year, weight);
        }
    },
    BIKE(3) {
        @Override
        public Transport create(Scanner sc) {
            sc.nextLine();
            System.out.println("Please enter model of bike");
            String model = sc.nextLine();
            System.out.println("Please enter year: ");
            int year = sc.nextInt();
            System.out.println("Is there a passenger seat?: ");
            boolean passengerSeat = sc.nextBoolean();
            return new Bike(model, year, passengerSeat);
        }
    },
    SCOOTER(4) {
        @Override
        public Transport create(Scanner sc) {
            sc.nextLine();
            System.out.println("Please enter model of scooter");
            String model = sc.nextLine();
            System.out.println("Please enter year: ");
            int year = sc.nextInt();
            System.out.println("Please enter amount of exhaust : ");
            double exhaustAmount = sc.nextDouble();
            return new Scooter(model, year, exhaustAmount);
        }
    },
    ;

    private final int id;
    final Scanner sc = new Scanner(System.in);

 
    TransportType(int id) {
        this.id = id;

    }

    public static TransportType fromId(int id) {
        for (TransportType type : TransportType.values()) {
            if (type.id == id) {
                return type;
            }
        }
        return null;
    }

    public abstract Transport create(Scanner sc);
}
