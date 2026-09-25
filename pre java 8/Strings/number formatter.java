// 
import java.text.DecimalFormat;
class Strings{
    public static void main(String[] args){
        DecimalFormat ob1 = new DecimalFormat("#,###");
        long num = 9876543;
        String num1 = ob1.format(num);
        System.out.println(num1);
    }
}