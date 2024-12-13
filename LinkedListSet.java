import java.util.*;
public class LinkedListSet{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Rajesh");
        System.out.println(a);
        a.remove("Rajesh");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}