class RideClassMain{
    public static void main(String[] args){
        RideClass olaCar1 = new OlaCar();
        System.out.println(" ola car fare: distance 10km Rs. "+olaCar1.calculateFare(10));
        OlaCar olaCar2 = (OlaCar) olaCar1;
        System.out.println(" ola car fare distance 15km: Rs. "+olaCar2.calculateFare(15));        
    }
}

class OlaCar extends RideClass{
    @Override
    double calculateFare(double distance){
        rate = 25*distance;
        return rate;
    }
}

class RapidoBike extends RideClass{
    @Override
    double calculateFare(double distance){
        rate = 15*distance;
        return rate;
    }
}

class UBerAuto extends RideClass{
    @Override
    double calculateFare(double distance){
        rate = 20*distance;
        return rate;
    }
}

class RideClass{
    double distance, rate;
    double calculateFare(double distance){
        rate = distance;
        return rate; 
    }
}