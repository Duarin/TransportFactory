package bilvania.gmail.com.transportSystemManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    4)Scooter
                    5)Exit
                    """);


            int choice = sc.nextInt();

            TransportType type= TransportType.fromId(choice);

            if(choice==5){
                System.out.println("Good bye :)");
                return;
            }

            if (type==null){
                i--;
                System.out.println("Invalid transport type!");
            }else{
                Transport transport = type.create(sc);
                if (transport!=null) {
                    transports.add(transport);
                }
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
