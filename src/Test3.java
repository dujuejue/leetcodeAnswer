import java.util.HashMap;

public class Test3 {
    //通过hashmap的contain来表明这种是否重复的问题
    public int lengthOfLongestSubstring(String s) {
       if (s.length()==0)return  0;
       HashMap<Character,Integer>map=new HashMap<>();
       int max=0,left=0;
       for (int i=0;i<s.length();i++){
           if (map.containsKey(s.charAt(i))){
               left=Math.max(left,map.get(s.charAt(i))+1);//移动左边界线
           }
           map.put(s.charAt(i),i);
           max=Math.max(max,i-left+1);
       }
       return max;
    }
}
