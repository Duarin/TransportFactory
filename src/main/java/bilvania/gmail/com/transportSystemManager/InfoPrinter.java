package bilvania.gmail.com.transportSystemManager;

public class InfoPrinter {

    public static void printInfo(Transport moveable){
        System.out.println("Type of transport: "+ moveable.getClass().getSimpleName());
        System.out.println("Max speed: "+ moveable.getMaxSpeed() );
        System.out.println("Model: "+ moveable.getModel());
        System.out.println("Year: "+ moveable.getYear());
        System.out.println("Fuel Consumption: "+ moveable.getFuelConsumption() );

    }

}
