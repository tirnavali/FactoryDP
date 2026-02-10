package abstract_otel_factory.Domain;

public class Payment {
    private Reservation reservation;

    private Payment() {
    }

    public static Payment with(Reservation reservation) {
        Payment payment = new Payment();
        payment.reservation = reservation;
        return payment;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public String toString() {
        return "Payment for reservation: " + reservation;
    }
}
