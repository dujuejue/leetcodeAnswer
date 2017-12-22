import java.util.*;

public class Test49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs==null||strs.length==0)return  new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for (String s:strs){
            char[] temp=s.toCharArray();
            Arrays.sort(temp);
            String key=String.valueOf(temp);
            if (!map.containsKey(key))map.put(key,new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
