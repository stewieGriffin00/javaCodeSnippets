class MultiThreading{
    public static void main(String[] args) throws InterruptedException{
        Thread.sleep(5000);
        System.out.println("ONe");
    }
}

/*  when we give Thread.sleep(milliseconds); we should handle it, or we 
    should declare it as throws InterruptedException. But when the sleep is interrupted it happens
    during the run time only. But we will not call it as Run time exception, because only when 
    we handle the exception while we write the code it would be handled during the run time and 
    the programme will run without any stop. that is why we classify it as comppile time excetpion
    rather than run time exception.  
 */