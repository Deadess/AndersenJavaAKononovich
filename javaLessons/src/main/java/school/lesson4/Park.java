package school.lesson4;
import java.util.ArrayList;

public class Park {
    private ArrayList<Attraction> attractions = new ArrayList<>();

    public void addAttraction(String name, String hours, double price) {
        attractions.add(new Attraction(name, hours, price));
    }

    public void showAttractions() {
        for(Attraction attraction : attractions) {
            System.out.println(attraction.name + " - Working hours: " + attraction.hours + ", Price: " + attraction.price);
        }
    }

    public class Attraction {
        String name;
        String hours;
        double price;

        public Attraction(String name, String hours, double price) {
            this.name = name;
            this.hours = hours;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("Roller Coaster", "10:00-18:00", 15.0);
        park.addAttraction("Ferris Wheel", "10:00-20:00", 10.0);
        park.showAttractions();
    }
}
