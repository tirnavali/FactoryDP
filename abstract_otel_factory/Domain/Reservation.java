package abstract_otel_factory.Domain;

public class Reservation {
    private Room room;
    private Customer customer;

    private Reservation() {
    }

    public static Reservation with(Room room, Customer customer) {
        Reservation reservation = new Reservation();
        reservation.room = room;
        reservation.customer = customer;
        return reservation;
    }

    public Room getRoom() {
        return room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String toString() {
        return "Reservation for room: " + room.getNumber() + " by customer: " + customer.getName();
    }
}
