import java.util.Stack;

class Main{
    public static void main(String[] args){
        // all notes for how to operate the stack is provided in txt file
        Stack<Integer> stack  = new Stack<>();
        stack.push(10);
        stack.push(90);
        stack.push(230);
        System.out.println(stack);
        for(int i=0; i<3; i++){
            System.out.println(stack.pop());
        }
        for(int i=0; i<3; i++){
            System.out.println(stack.serch(i));
        }
        for(int i=0; i<3; i++){
            System.out.println(stack.peek());
            stack.pop();
        }        
    }
}

