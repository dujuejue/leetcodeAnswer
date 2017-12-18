import java.util.*;

public class Main {

    public static void main(String[] args) {
        Test126 test = new Test126();
        Set<String>a=new HashSet<>();
        a.add("hot");
        a.add("dot");
        a.add("dog");
        a.add("lot");
        a.add("log");
        a.add("cog");
        List<List<String>> b=test.findLadders("hit","cog",a);
        for (List<String> c:b){
            for (String d:c){
                System.out.print(d+"  ");
            }
            System.out.println();
        }

    }
}
