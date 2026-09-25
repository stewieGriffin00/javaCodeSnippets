class HomeMain{
    public static void main(String[] args){
        Home home1 = new Home();
        home1.setMonthly_rent(1000);
        home1.setOnwner_name("House onwner");
        home1.setAddress("Kodambakkam");
        home1.increaseRent(200);
        home1.decreaseRent(300);
        home1.printAllDetails();
    }
}

class Home{
    private int monthly_rent;
    private String owner_name, address;
    void setAddress(String address){
        this.address = address;
    }
    void setMonthly_rent(int rent){
        this.monthly_rent = rent;
    }
    void setOnwner_name(String name){
        owner_name = name;
    }
    String getOwner_name(){
        return owner_name;
    }
    String getAddress(){
        return address;
    }
    int getMonthly_rent(){
        return monthly_rent;
    }
    void increaseRent(int rentIncrease){
        monthly_rent += rentIncrease;
        System.out.println(" old rent: "+(monthly_rent-rentIncrease)+" new rent: "+monthly_rent);
    }
    void decreaseRent(int rentDecrease){
        monthly_rent -= rentDecrease;
        System.out.println(" old rent: "+(monthly_rent+rentDecrease)+" new rent: "+monthly_rent);

    }
    void printAllDetails(){
        System.out.println(" Owner Name: "+owner_name+"\nMonthly rent: "+monthly_rent+"\naddress: "+address);
    }
}