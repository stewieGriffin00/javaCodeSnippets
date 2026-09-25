// System.out.println();
class Strings{
    public static void main(String[] args){
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("A"));

        System.out.println("Z".compareTo("Y"));
        System.out.println("Y".compareTo("A"));

        System.out.println("AA".compareTo("AA"));
        System.out.println("ZZ".compareTo("AA"));

        System.out.println("ZA".compareTo("AA"));
        System.out.println("ZZ".compareTo("ZA"));
    }
}
 
/*   Compare to method compares the position of the two letters in alphabetical order.
     if the first letter occurs first in the alphabets and the second letter later we get a 
     negative value.
        like A and Z we get -25 
      We will get a positive value if the first letter occurs later as compared 
     to the second letter. 
        like Z and A we get 25


     IF we have two lettters in the string we will compare the first letters first and give the 
     difference. Only if the first letter is same we will move to second letter and then do 
     the comarision.
     like ZZ and ZA we will get 25 
     if we have ZA and ZZ we will get -25
     because the first letter is same.
  */