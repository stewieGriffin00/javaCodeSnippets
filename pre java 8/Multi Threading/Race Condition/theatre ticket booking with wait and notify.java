class MultiThreading{
    public static void main(String[] args){
        Theatre theatre1 = new Theatre();
        Customer1 customer1 = new Customer1(theatre1, 5, "user-1");
        Customer2 customer2 = new Customer2(theatre1, 3, "user-2");
        customer2.setPriority(Thread.MAX_PRIORITY);
        customer1.start();
        customer2.start();
    }
}

class Theatre{
    static int available_seat = 5;
    synchronized void bookSeat(int count){
        if(available_seat>=count){
            available_seat -= count;
            System.out.println(Thread.currentThread().getName()+" seats booked "+count+" available now:"+available_seat);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" no available seats  available now:"+available_seat+" please wait until someone cancels their seat");
            try{
                wait();
            }
            catch(InterruptedException iE){
                System.out.println(" InterupptedException ");
            }
            bookSeat(count);
        }
    }

    synchronized void cancelSeat(int count){
        available_seat += count;
        System.out.println(Thread.currentThread().getName()+" cancelled seats nos:"+ count);
        notify();    
    }
}

class Customer1 extends Thread{
    Theatre theatre;
    int noOfSeats;
    Customer1(Theatre t, int seats, String name){
       super(name);
       this.theatre = t;
       noOfSeats = seats;
    }
    @Override
    public void run(){
        theatre.bookSeat(this.noOfSeats);
        theatre.cancelSeat(4);
    }
}

class Customer2 extends Thread{
    Theatre theatre;
    int noOfSeats;
    Customer2(Theatre t, int seats, String name){
       super(name);
       this.theatre = t;
       noOfSeats = seats;
    }
    @Override
    public void run(){
        theatre.bookSeat(this.noOfSeats);
        theatre.cancelSeat(3);
    }
}
/*    Race condition: it is a state 
 */