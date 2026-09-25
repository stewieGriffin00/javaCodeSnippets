import java.util.PriorityQueue;

class PQ{
    public static void main(String[] args) {

        // priority queue returns the element that has highest priority 
        // if the queue stores Integer then the element with lowest value element 
        // if it is a non-primitive element then we have to specify based on what the priority is set. 

        PriorityQueue<Integer> p= new PriorityQueue<>();

        p.add(24);
        p.add(16);
        p.add(5);
        p.add(29);
        p.add(10);
        p.add(99);

        System.out.println(p); // prints all the items inside the priority queue

        // // peek() checks the first element inside the queue and not removes it while returning unlike poll 
        System.out.println(p.peek());

        // // isEmpty() method checks if the queue is empty and returns a boolean 
        while(!p.isEmpty()){
            // poll method returns and removes the high ppriority element inside the queue. 
            System.out.println(p.poll());   
        }

        // Collections.reverseOrder() passing this inside the constructor of a object of a priority Queue 
        // will return the items in a reverse order. 
        // Eg: if it is number it will return numbers in descending order 
        // if it is Strings it will return it in reverse alphabeticall order

        PriorityQueue<String> pString= new PriorityQueue<>();
        // PriorityQueue<String> pString= new PriorityQueue<>(Collections.reverseOrder());

        pString.add("apple");
        pString.add("mango");
        pString.add("carrot");
        pString.add("banana");
        pString.add("pomengranate");
        pString.add("kiwi");

        while (!pString.isEmpty()) { 
            System.out.println(pString.poll());
        }

        PriorityQueue<Student> pStudent= new PriorityQueue<>(
            (a, b)-> {
                return a.rollNO - b.rollNO;
            }
        );

        pStudent.add(new Student(10, "apple"));
        pStudent.add(new Student(100, "apple2"));
        pStudent.add(new Student(1, "apple3"));

        System.out.println(pStudent);

    }
}

class Student{
    int rollNO;
    String name;

    Student(int rollNO, String name){
        this.name= name;
        this.rollNO= rollNO;
    }

    public String toString(){
        return "name: "+name+" rollNo: "+rollNO;
    }
}