class MethodOverloading{
    public void addMethod(int num1, int num2){
        int result = num1+ num2;
        System.out.println(" Integer "+num1 +" + "+ num2+ " = "+result);
    }

    public void addMethod(String num1, String num2){
        int result = Integer.parseInt(num1) + Integer.parseInt(num2); 
        System.out.println(" String "+num1 +" + "+ num2+ " = "+result);
    }

    public void addMethod(double num1, double num2){
        double result = num1 + num2;
        System.out.println(" double "+num1 +" + "+ num2+ " = "+result);
    }
}

class MethodOverloadingMain{
    public static void main(String[] args){
        MethodOverloading ob1 = new MethodOverloading();
        ob1.addMethod(10,45);
        ob1.addMethod("20","21");
        ob1.addMethod(3.14,9.81);
    } 
}