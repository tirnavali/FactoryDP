# Abstract Factory Pattern - Hotel Booking System

This project demonstrates the **Abstract Factory Pattern** from the Gang of Four (GoF) design patterns book, implemented in Java as a hotel booking system.

## 📁 Project Structure

```
FactoryDP/
└── abstract_otel_factory/     # Abstract Factory Pattern
```

## 📦 Package Structure

```
abstract_otel_factory/
├── Domain/                    # Domain entities
│   ├── Otel.java
│   ├── Room.java
│   ├── Customer.java
│   ├── Reservation.java
│   └── Payment.java
│
├── Factory/                   # Abstract Factory pattern
│   ├── HotelFactory.java              # Abstract factory interface
│   ├── BandirmaHotelFactory.java      # Concrete factory (3-star)
│   └── CaliforniaHotelFactory.java    # Concrete factory (5-star)
│
├── Client/                    # Client code
│   └── Agency.java
│
└── ClientTest.java            # Demo application
```

### How to Compile & Run
```bash
cd ...\FactoryDP

# Compile all packages
javac abstract_otel_factory\Domain\*.java abstract_otel_factory\Factory\*.java abstract_otel_factory\Client\*.java abstract_otel_factory\ClientTest.java

# Run the test
java abstract_otel_factory.ClientTest
```

### Key Concept
The **Abstract Factory Pattern** creates families of related objects. Each factory (`BandirmaHotelFactory`, `CaliforniaHotelFactory`) creates its own variant of:
- Hotel (3-star vs 5-star)
- Rooms
- Customers
- Reservations
- Payments

### Design Highlights

#### Domain-Driven Design
- **Aggregate Root**: `Otel` manages its `Room` collection
- **Static Factory Methods**: `Room.with()`, `Customer.with()`, `Reservation.with()`
- **Encapsulation**: Private constructors prevent direct instantiation

#### Pattern Benefits
- ✅ **Flexibility**: Easy to add new hotel types (e.g., `LuxuryHotelFactory`)
- ✅ **Consistency**: Each factory creates a consistent family of objects
- ✅ **Decoupling**: Client (`Agency`) depends on abstractions, not concrete classes

---

## 🚀 Quick Start

### Compile
```bash
javac abstract_otel_factory\Domain\*.java abstract_otel_factory\Factory\*.java abstract_otel_factory\Client\*.java abstract_otel_factory\ClientTest.java
```

### Run
```bash
java abstract_otel_factory.ClientTest
```

### Expected Output
```
3-star Otel Bandırma in Bandırma
Otel: Otel Bandırma Room: 101 Price: 500.0 Capacity: 2
Customer: Sercan ID: [UUID]
Reservation for room: 101 by customer: Sercan
Payment for reservation: Reservation for room: 101 by customer: Sercan
```

---

## 📚 Learning Resources

- **Gang of Four Book**: "Design Patterns: Elements of Reusable Object-Oriented Software"
- **Abstract Factory Pattern**: Creates families of related objects without specifying their concrete classes
- **Key Principle**: Provide an interface for creating families of related or dependent objects

---

## 👨‍💻 Author

Educational project demonstrating the Abstract Factory Pattern in Java.

