package abstract_otel_factory.Factory;

import abstract_otel_factory.Domain.Customer;
import abstract_otel_factory.Domain.Otel;
import abstract_otel_factory.Domain.Payment;
import abstract_otel_factory.Domain.Reservation;
import abstract_otel_factory.Domain.Room;

public interface HotelFactory {
    Otel createOtel(String name);

    Room createRoom(int number, double price, int capacity);

    Customer createCustomer(String name);

    Reservation createReservation(Room room, Customer customer);

    Payment createPayment(Reservation reservation);
}
