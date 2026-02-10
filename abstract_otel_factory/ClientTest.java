package abstract_otel_factory;

import abstract_otel_factory.Client.Agency;
import abstract_otel_factory.Domain.Customer;
import abstract_otel_factory.Domain.Otel;
import abstract_otel_factory.Domain.Payment;
import abstract_otel_factory.Domain.Reservation;
import abstract_otel_factory.Domain.Room;
import abstract_otel_factory.Factory.BandirmaHotelFactory;
import abstract_otel_factory.Factory.HotelFactory;

public class ClientTest {
    public static void main(String[] args) {
        // Create factory
        HotelFactory bandirmaHotelFactory = new BandirmaHotelFactory();

        // Create agency with factory
        Agency agency = new Agency(bandirmaHotelFactory);

        // Use agency to create objects
        Otel otel = agency.createOtel("Otel Bandırma");
        Room room = agency.createRoom(101, 500, 2);
        otel.addRoom(room);
        Customer customer = agency.createCustomer("Sercan");
        Reservation reservation = agency.createReservation(room, customer);
        Payment payment = agency.createPayment(reservation);

        // Print results
        System.out.println(otel);
        System.out.println(room);
        System.out.println(customer);
        System.out.println(reservation);
        System.out.println(payment);
    }
}
