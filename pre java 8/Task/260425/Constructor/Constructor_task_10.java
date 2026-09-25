class Library{
    String bookName, author;
    public static void main(String[] args){
        Library book1 = new Library("Wings of fire"," Abdul Kalam ");
        Library book2 = new Library(book1);
        Library book3 = new Library(book2);
        book1.printDetails();
        book2.printDetails();
        book3.printDetails();

    }
    Library(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }
    Library(Library objLib){
        this.bookName = objLib.bookName;
        this.author  = objLib.author;
    }
    void printDetails(){
        System.out.println(" book Name: "+bookName+" author: "+author);
    }
}

