public class bank extends Thread {
    public static int ammount = 0;
    public static void main(String[] args){
        bank thread = new bank();
        thread.start();
        while(thread.isAlive()){
            System.out.print("Waiting....");
        }
        System.out.println("BANK :" + ammount);
        ammount++;
        System.out.println("BANK :" + ammount);
    }
    public void run(){
        ammount++;
    }
    
}
