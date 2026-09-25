import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class TravelBooking {
    
    static class Flight {
        String airline;
        double price;
        Flight(String airline, double price) { this.airline = airline; this.price = price; }
        public String toString() { return airline + ": $" + price; }
    }
    
    static class Hotel {
        String name;
        double price;
        Hotel(String name, double price) { this.name = name; this.price = price; }
        public String toString() { return name + ": $" + price + "/night"; }
    }
    
    static class CarRental {
        String company;
        double price;
        CarRental(String company, double price) { this.company = company; this.price = price; }
        public String toString() { return company + ": $" + price + "/day"; }
    }
    
    public static void main(String[] args) {
        
        System.out.println("🔍 Searching for best travel deals...\n");
        
        // Search all in parallel
        CompletableFuture<Flight> flightFuture = searchFlights();
        CompletableFuture<Hotel> hotelFuture = searchHotels();
        CompletableFuture<CarRental> carFuture = searchCars();
        
        // Combine ALL results
        CompletableFuture<String> tripSummary = flightFuture
            .thenCombine(hotelFuture, (flight, hotel) -> 
                "✈️ " + flight + "\n🏨 " + hotel)
            .thenCombine(carFuture, (summary, car) -> 
                summary + "\n🚗 " + car);
        
        // Add total price calculation
        CompletableFuture<String> finalSummary = tripSummary
                .thenCombine(flightFuture.thenCombine(hotelFuture,
                        (f, h) -> f.price + h.price)
                        .thenCombine(carFuture, (subtotal, c) -> subtotal + c.price),
                        (summary, total) -> summary + "\n💰 Total: $" + total);

        // Do other work while searching
        for (int i = 0; i < 3; i++) {
            sleep(500);
            System.out.println("  Main: still searching... " + (i+1));
        }
        
        // Show results
        System.out.println("\n📋 Best Deal Found:\n" + finalSummary.join());
    }
    
    private static CompletableFuture<Flight> searchFlights() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(random(2000, 4000));
            return new Flight("Delta", random(300, 600));
        });
    }
    
    private static CompletableFuture<Hotel> searchHotels() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(random(1500, 3500));
            return new Hotel("Hilton", random(100, 250));
        });
    }
    
    private static CompletableFuture<CarRental> searchCars() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(random(1000, 3000));
            return new CarRental("Hertz", random(40, 80));
        });
    }
    
    private static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
    
    private static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) {}
    }
}