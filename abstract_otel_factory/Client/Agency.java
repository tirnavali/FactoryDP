package abstract_otel_factory.Client;

import abstract_otel_factory.Factory.HotelFactory;
import abstract_otel_factory.Domain.Customer;
import abstract_otel_factory.Domain.Otel;
import abstract_otel_factory.Domain.Payment;
import abstract_otel_factory.Domain.Reservation;
import abstract_otel_factory.Domain.Room;

public class Agency {
    private HotelFactory hotelFactory;

    public Agency(HotelFactory hotelFactory) {
        this.hotelFactory = hotelFactory;
    }

    public Otel createOtel(String name) {
        return hotelFactory.createOtel(name);
    }

    public Room createRoom(int number, double price, int capacity) {
        return hotelFactory.createRoom(number, price, capacity);
    }

    public Customer createCustomer(String name) {
        return hotelFactory.createCustomer(name);
    }

    public Reservation createReservation(Room room, Customer customer) {
        return hotelFactory.createReservation(room, customer);
    }

    public Payment createPayment(Reservation reservation) {
        return hotelFactory.createPayment(reservation);
    }
}
