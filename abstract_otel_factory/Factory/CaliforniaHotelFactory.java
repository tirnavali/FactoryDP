package abstract_otel_factory.Factory;

import abstract_otel_factory.Domain.Customer;
import abstract_otel_factory.Domain.Otel;
import abstract_otel_factory.Domain.Payment;
import abstract_otel_factory.Domain.Reservation;
import abstract_otel_factory.Domain.Room;

public class CaliforniaHotelFactory implements HotelFactory {
    @Override
    public Otel createOtel(String name) {
        return new Otel(name, "California", 5);
    }

    @Override
    public Room createRoom(int number, double price, int capacity) {
        return Room.with(number, price, capacity);
    }

    @Override
    public Customer createCustomer(String name) {
        return Customer.with(name);
    }

    @Override
    public Reservation createReservation(Room room, Customer customer) {
        return Reservation.with(room, customer);
    }

    @Override
    public Payment createPayment(Reservation reservation) {
        return Payment.with(reservation);
    }
}
