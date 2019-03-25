package code;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test30 {
    //利用hashmap来处理是否要检测重复选项的问题
    public List<Integer> findSubstring(String s, String[] words) {
      final Map<String,Integer>counts=new HashMap<>();//来当做是否重复的标准
      List<Integer> index=new ArrayList<>();
      for (String a:words){
          counts.put(a,counts.getOrDefault(a,0)+1);
      }
      int length=s.length(),num=words.length,len=words[0].length();
      for (int i=0;i<length-num*len+1;i++){
          Map<String,Integer>seen=new HashMap<>();//记录本次循环是否重复单词
          int j=0;
          while (j<num){
              String word=s.substring(i+j*len,i+(j+1)*len);
              if (counts.containsKey(word)){
                  seen.put(word,seen.getOrDefault(word,0)+1);
                  if (seen.get(word)>counts.get(word)){
                      break;//出现重复就退出
                  }
              }else break;//没有包含那个单词就退出
              j++;
          }
          if (j==num)index.add(i);//判断是否把所有单词都联建
      }
      return index;
    }
}
