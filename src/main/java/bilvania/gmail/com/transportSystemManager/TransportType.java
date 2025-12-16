package bilvania.gmail.com.transportSystemManager;

public enum TransportType {
    CAR(1),
    BUS(2),
    BIKE(3),
    SCOOTER(4),
    ;

    private final int id;


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
}
