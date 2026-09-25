class BookClass{
    public static void main(String[] args){
        System.out.println(" Book Class ");
        Book book1 = new Book(500," Mein Kampf ","Hitler");
        Book book2  = new Book(600,"Wings of fire"," abdul kalam ");
        Book book3 = new Book(700,"PRogramming in Java ", " balagurusamy");
        book1.displayFields();
        book2.displayFields();
        book3.displayFields();
    }
}

class Book{
    int price;
    String name, title, author;
    Book(int price, String title, String author){
        this.price = price;
        this.title = title;
        this.author = author;
    }
    void displayFields(){
        System.out.println(" price: "+price+" title: "+title+" author: "+author);
    }
}