class TicketBookingSystem{
    public static void main(String[] args){
        Flight flightTicket1 = new Flight();
        flightTicket1.ticketBooking("Chennai","Delhi");
        flightTicket1.calculateFare(100);
        flightTicket1.displayBookingConfirmation();     
    }
}

class Flight extends TicketBooking{
    String source, destination;
    double distance;
    void ticketBooking(String source, String destination){
        this.source = source;
        this.destination = destination;
        System.out.println(" source: "+source+" destination: "+destination);
    }
    void calculateFare(double distance){
        this.distance = distance;
        double ticketPrice = distance*10000;
        System.out.println("Flight ticket price: "+ticketPrice);
    }
    void displayBookingConfirmation(){
        System.out.println("\n Booking Confirmation\n ------- \n source: "+source+"\n destination: "+destination+"\n distance: "+distance);
    }
}

class Bus extends TicketBooking{
    String source, destination;
    double distance;
    void ticketBooking(String source, String destination){
        this.source = source;
        this.destination = destination;
        System.out.println(" source: "+source+" destination: "+destination);
    }
    void calculateFare(double distance){
        this.distance = distance;
        double ticketPrice = distance*100;
        System.out.println("Bus ticket price: "+ticketPrice);
    }
    void displayBookingConfirmation(){
        System.out.println("\n Booking Confirmation\n ------- \n source: "+source+"\n destination: "+destination+"\n distance: "+distance);
    }
}

class Car extends TicketBooking{
    String source, destination;
    double distance;
    void ticketBooking(String source, String destination){
        this.source = source;
        this.destination = destination;
        System.out.println(" source: "+source+" destination: "+destination);
    }
    void calculateFare(double distance){
        this.distance = distance;
        double ticketPrice = distance*1000;
        System.out.println("Car ticket price: "+ticketPrice);
    }
    void displayBookingConfirmation(){
        System.out.println("\n Booking Confirmation\n ------- \n source: "+source+"\n destination: "+destination+"\n distance: "+distance);
    }
}

class Train extends TicketBooking{
     String source, destination;
    double distance;
    void ticketBooking(String source, String destination){
        this.source = source;
        this.destination = destination;
        System.out.println(" source: "+source+" destination: "+destination);
    }
    void calculateFare(double distance){
        this.distance = distance;
        double ticketPrice = distance*500;
        System.out.println("Train ticket price: "+ticketPrice);
    }
    void displayBookingConfirmation(){
        System.out.println("\n Booking Confirmation\n ------- \n source: "+source+"\n destination: "+destination+"\n distance: "+distance);
    }
}

class TicketBooking{
    void ticketBooking(String source, String destination){
        System.out.println(" source: "+source+" destination: "+destination);
    }
    void calculateFare(double distance){
        double ticketPrice = distance*1;
        System.out.println(" ticket price: "+ticketPrice);
    }
}

