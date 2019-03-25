package code;import java.util.HashMap;
import java.util.Map;


public class Test76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c:s.toCharArray()){
            map.put(c,0);//把s里面所有存在的字符串放进map里面，并设置出现次数1
        }
        for (char c:t.toCharArray()){
            if (map.containsKey(c))
                map.put(c,map.get(c)+1);//在t里面存在的字符都在map里面+1
            else
                return "";//表明t里面含有s里面没有的字符
        }
        int start=0,end=0,minStart=0,minLength=Integer.MAX_VALUE,counter=t.length();
        while (end<s.length()){
            char c1=s.charAt(end);
            if (map.get(c1)>0)//表明t里面存在这个字符
                counter--;
            map.put(c1,map.get(c1)-1);//表明还在那个window里面
            end++;

            while (counter==0){
                if (end-start<minLength){
                    minLength=end-start;
                    minStart=start;
                }

                char c2=s.charAt(start);
                map.put(c2,map.get(c2)+1);

                if (map.get(c2)>0)//表明已经去掉一个在t里面的字符
                    counter++;

                start++;
            }
        }
        return minLength==Integer.MAX_VALUE?"":s.substring(minStart,minStart+minLength);
    }
}
