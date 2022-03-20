import java.util.Scanner;
public class info{
    public static void main(String[] args){
        Scanner UserInfo = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = UserInfo.nextLine();
        System.out.println("Enter AGE");
        int age = UserInfo.nextInt();
        System.out.println("Name:" + name);
        System.out.println("AGE:" + age);
        
    }
}