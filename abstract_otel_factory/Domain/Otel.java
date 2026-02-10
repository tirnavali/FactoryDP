package abstract_otel_factory.Domain;

import java.util.ArrayList;

public class Otel {
    private String name;
    private String location;
    private int stars;
    private ArrayList<Room> rooms;

    public Otel(String name, String location, int stars) {
        this.name = name;
        this.location = location;
        this.stars = stars;
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
        room.setOtel(this);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getStars() {
        return stars;
    }

    public String toString() {
        return stars + "-star " + name + " in " + location;
    }
}
