import java.util.EnumMap;
import java.util.Scanner;

class HotelMenu{
    public static void main(String[] args){

        Dish dishMonday = new Dish("Monday DIsh", "Monday Dessert", "Monday Drink");
        Dish dishTuesday = new Dish("Tuesday DIsh ","Tuesday Dessert","Tuesday Drink");
        Dish dishWednesday = new Dish("Wednesday DIsh", "Wednesday Dessert", "Wednesday Drink");
        Dish dishThursday = new Dish("Thursday DIsh", "Thursday Dessert" ,"Thursday Drink");
        Dish dishFriday = new Dish("Friday DIsh" ,"Friday Dessert", "Friday Drink");
        Dish dishSaturday = new Dish(" Saturday DIsh","Saturday Dessert","Saturday Drink");
        Dish dishSunday = new Dish("Sunday DIsh","Sunday Dessert", "Sunday Drink");


        EnumMap<Menu, Dish> hotel_menu_1 = new EnumMap<Menu, Dish>(Menu.class );
        hotel_menu_1.put(Menu.Monday, dishMonday);
        hotel_menu_1.put(Menu.Tuesday, dishTuesday);
        hotel_menu_1.put(Menu.Wednesday, dishWednesday);
        hotel_menu_1.put(Menu.Thursday, dishThursday);
        hotel_menu_1.put(Menu.Friday, dishFriday);
        hotel_menu_1.put(Menu.Saturday,dishSaturday );
        hotel_menu_1.put(Menu.Sunday, dishSunday);
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("1.  "+days[0]+"\n"+"2.  "+days[1]+"\n"+"3.  "+days[2]+"\n"+"4.  "+days[3]+"\n"+"5.  "+days[4]+"\n"+"6.  "+days[5]+"\n"+"7.  "+days[6]+"\n");

        Scanner sc = new Scanner(System.in);
        Integer day = 0;
        System.out.println(" enter the day to get menu ");
        try{
            day = sc.nextInt();
            switch(Menu.valueOf(days[day-1])){
                case Monday:
                    System.out.println(hotel_menu_1.get(Menu.Monday));
                    break;
                case Tuesday:
                    System.out.println(hotel_menu_1.get(Menu.Tuesday));
                    break;
                case Wednesday:
                    System.out.println(hotel_menu_1.get(Menu.Wednesday));
                    break;
                case Thursday:
                    System.out.println(hotel_menu_1.get(Menu.Thursday));
                    break;
                case Friday:
                    System.out.println(hotel_menu_1.get(Menu.Friday));
                    break;
                case Saturday:
                    System.out.println(hotel_menu_1.get(Menu.Saturday));
                    break;
                case Sunday:
                    System.out.println(hotel_menu_1.get(Menu.Sunday));
                    break;
                default:
                    System.out.println(" enter only numbers between 1 to 7 ");
            }
        }
        catch(Exception iem){
            System.out.println("enter only numbers between 1 to 7 ");
        }
    }
}

enum Menu{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

class Dish{
    String drink, dish, dessert;
    Dish(String drink, String dish, String dessert){
        this.dessert = dessert;
        this.dish = dish;
        this.drink = drink;
    }
    @Override
    public String toString(){
        return " dish: "+dish+"\n dessert: "+dessert+"\n drink: "+drink;
    }
}