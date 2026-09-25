import java.io.*;

class Test{
    public static void main(String[] args) {

        A a= new A(1, "superman");

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("student.ser"))) {
            out.writeObject(a);
            System.out.println("Serialized: " + a);
        } catch (IOException e) {
            e.printStackTrace();
        }

         try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) {
            A restored = (A) in.readObject();
            System.out.println("Deserialized: " + restored);
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class A implements Serializable{
    int rollNo;
    String name;
    private static final long serialVersionUID = 1L;
    
    public A(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString(){
        return " roll NO: "+ rollNo+ "\n"+ " name: "+ name;
    }
}
