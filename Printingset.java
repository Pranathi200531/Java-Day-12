import java.util.*;
public class Printingset{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("Student");
        a.add("Rajesh");
        a.add("Student");
        for(String s:a)
        {
            System.out.println(s+" ");
        }
    }
}