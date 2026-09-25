// P p
class FlightMain{
    public static void main(String[] args){
        
    }
}

class FlightTicket{
    String source, destination;
    void ticketBooking(String s, String d){
        System.out.println(" ticket booked from: "+s+" to "+d);
    }
    void fare(int distance){
        System.out.println(" ticket price: "+distance);
    }
}
class Domestic extends FlightTicket{
    String source, destination;
    void ticketBooking(String s, String d){
        System.out.println(" ticket booked from: "+s+" to "+d);
    }
    void fare(int distance){
        System.out.println(" ticket price: "+distance*10000);
    }
}
class International extends FlightTicket{
    String source, destination;
    void ticketBooking(String s, String d){
        System.out.println(" ticket booked from: "+s+" to "+d);
    }
    void fare(int distance){
        System.out.println(" ticket price: "+distance*30000);
    }
}


