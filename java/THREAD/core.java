public class core extends Thread{
    public static void main(String[] args){
        core thread = new core();
        thread.start();
        System.out.println("thisa code is running outside thread");
    }
    public void run(){
        System.out.println("thisa code is running in thread");
    }
}