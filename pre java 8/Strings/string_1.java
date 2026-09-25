class Strings{
    public static void main(String[] args){
        String s1 = new String("He");
        s1 = s1.concat("llo");
        System.out.println(s1); 
        s1 += " world";
        // this new concatenated String is created separately and stored in memory.
        // the old string "He" is not modified that is why in java strings are immutable
        System.out.println(s1);
       /*  System.out.println(s1.charAt(0));
        // prints the chara
        System.out.println(s1.length()); // gives the length of the string 
        System.out.println(s1.substring(2));  */// gives the remaining characters in the string after the index 
        System.out.println(s1.substring(1,3)); // gives the numbers of characters in the second argument after the index given in the first argument 
        // System.out.println(s1.indexOf('o')); // gives the index of chracter given in the argument 
    }
}



