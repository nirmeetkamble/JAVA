enum Level{
    LOW,
    MEDIUM,
    HIGH
}
public class Bolt{
    public static void main(String[] args){
        Level MyVar =  Level.MEDIUM;
        switch(MyVar){
            case LOW:
            System.out.println("LOW level");
            break;
            case MEDIUM:
            System.out.println("MEDIUM level");
            break;
            case HIGH:
            System.out.println("HIGH level");
            break;
        }

    }
}