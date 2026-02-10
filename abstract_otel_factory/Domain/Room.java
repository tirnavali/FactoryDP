package abstract_otel_factory.Domain;

public class Room {
    private int number;
    private double price;
    private int capacity;
    private Otel otel;

    private Room() {
    }

    public static Room with(int number, double price, int capacity) {
        Room room = new Room();
        room.number = number;
        room.price = price;
        room.capacity = capacity;
        return room;
    }

    public static Room defaultRoom() {
        Room room = new Room();
        room.number = 1;
        room.price = 100;
        room.capacity = 2;
        return room;
    }

    public void setOtel(Otel otel) {
        this.otel = otel;
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        String otelName = (otel != null) ? otel.getName() : "Not assigned";
        return "Otel: " + otelName + " Room: " + number + " Price: " + price + " Capacity: " + capacity;
    }
}
