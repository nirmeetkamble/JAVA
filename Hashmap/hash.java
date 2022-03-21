import java.util.HashMap;
class hash{
    public static void main(String[] args){
    HashMap<String, String> Hash = new HashMap<String, String>();
    Hash.put("England","London");
    Hash.put("India", "Delhi");
    Hash.put("New Zealand", "Wellington");
    System.out.println(Hash);
    System.out.println(Hash.get("India"));
}
}