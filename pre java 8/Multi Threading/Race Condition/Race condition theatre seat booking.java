class MultiThreading{
    public static void main(String[] args){
        Theatre theatre1 = new Theatre();
        Customer user1 = new Customer(theatre1, 5, "user-1");
        Customer user2 = new Customer(theatre1, 3, "user-2");
        Customer user3 = new Customer(theatre1, 5, "user-3");

        user1.start();
        user2.start();
        user3.start();
    }
}

class Theatre{
    static int available_seat = 10;
    void seatNumber(int number){
        System.out.println(" seats available: "+available_seat+" thread "+Thread.currentThread().getName());
    }
    synchronized void bookSeat(int count){
        if(available_seat>=count){
            available_seat -= count;
            System.out.println(Thread.currentThread().getName()+" seats booked "+count+" available now:"+available_seat);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" no available seats  available now:"+available_seat);
                    }
    }
}

class Customer extends Thread{
    Theatre theatre;
    int noOfSeats;
    Customer(Theatre t, int seats, String name){
       super(name);
       this.theatre = t;
       noOfSeats = seats;
    }
    @Override
    public void run(){
        theatre.bookSeat(this.noOfSeats);
    }
}

/*  Race condition: is a state when the two threads run at the same time and give same values 
    which is called data inconsistency.
    that is why we should use synchronized key word.
    which will allow only one method to access the method at a time.
 */