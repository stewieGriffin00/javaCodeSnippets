import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class ProductOrderDetials{
    public static void main(String[] args){
        ArrayList<Product> products = new  ArrayList<Product>();
        ArrayList<Order> orders = new ArrayList<Order>();
        // ArrayList<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
        
        Product product_1 = new Product("category 1", 101, 10000, 100);
        Product product_2 = new Product("category 3", 542, 16350, 112);
        Product product_3 = new Product("category 2", 731, 10750, 176);
        products.add(product_1);
        products.add(product_2);
        products.add(product_3);

        Order order_1 = new Order(101, 829946, 250702, 12, 1_20_000);
        Order order_2 = new Order(542, 829948, 250808, 5, 1_54_000);
        Order order_3 = new Order(731, 829947, 250914, 3, 1_87_000);
        Order order_4 = new Order(101, 829945, 250702, 12, 1_20_000);
        orders.add(order_1);
        orders.add(order_2);
        orders.add(order_3);
        orders.add(order_4);

        ArrayList<Order> product_1_orders = new ArrayList<Order>();
        ArrayList<Order> product_2_orders = new ArrayList<Order>();
        ArrayList<Order> product_3_orders = new ArrayList<Order>();

        Iterator<Order> itOrder = orders.iterator(); 
        Iterator<Product> itProduct = products.iterator();

        HashMap<Integer, ArrayList<Order>> hm = new HashMap<Integer, ArrayList<Order>>(); 

        for(Product p: products){
            for(Order o: orders){
                if(p.id == o.product_id){
                    if(p.id == 101){
                        product_1_orders.add(o);
                    }
                    else if(p.id == 542){
                        product_2_orders.add(o);
                    }
                    else if(p.id == 731){ 
                        product_3_orders.add(o);
                    }
                }
            }
        }

        hm.put(101, product_1_orders);
        hm.put(542, product_2_orders);
        hm.put(731, product_3_orders);
        System.out.println(hm);
    }
}

class Product{
    String category;
    int id, price, quantity;

    Product( String category, int id, int price, int quantity){
        this.id = id;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return " id: "+id+"\n category: "+category+"\n price: "+price+"\n quantity: "+quantity;
    } 
}

class Order{
    int product_id, customer_id, date, order_quantity, total_amount;
    Order(int product_id, int customer_id, int date, int order_quantity, int total_amount){
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.date = date ;
        this.order_quantity = order_quantity;
        this.total_amount = total_amount;
    }
    @Override
    public String toString(){
        return "product id: "+product_id+"\n customer id: "+customer_id+"\n date: "+date+"\n order quantity : "+order_quantity+"\n total_amount: "+total_amount;
    } 
}

