public class Main{
    public void fullthrottle(){
        System.out.println("Car is going as fast as possible");
    }
    public void speed(int fullspeed) {
        System.out.println("Max car speed"+fullspeed);
    }
    public static void main(String[] args) {
        Main MyCar = new Main();
        MyCar.fullthrottle();
        MyCar.speed(200);

    }
}