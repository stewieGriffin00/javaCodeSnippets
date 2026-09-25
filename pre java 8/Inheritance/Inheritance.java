// System.out.println();

class Inheritance{
    public static void main(String[] args){
        vehicle ob1 = new vehicle();
        ob1.ride();
        bike ob2 = new bike();
        ob2.ride();
    }
}

class vehicle{
    public void ride(){
        System.out.println(" ride class from vehicle ");
    }
}

class bike extends vehicle{
    
}