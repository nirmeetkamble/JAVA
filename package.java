import java.util.Scanner;
class MyClass{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you Name");
        String username;
        username = scan.nextLine();
        System.out.println("your user name is" + "  "+ username);
    }
}