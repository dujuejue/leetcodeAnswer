package code;import java.util.*;

public class Test126BFS {

    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<List<String>> results=new ArrayList<>();
        Map<String,Integer> ladder=new HashMap<>();//用来记录该节点是在哪一层
        Map<String,List<String>> map=new HashMap<>();//用来记录每一个节点的上一个节点
        if (dict==null||dict.size()==0)return results;
        int min=Integer.MAX_VALUE;//设置只读取到目标值的层数
        Queue<String> queue=new ArrayDeque<>();//广度优先算法的关键就是队列，用来记录已经读取的节点，并通过读取节点来安排是否又填入节点
        queue.add(start);//这是起始节点
        for (String a:dict){
            ladder.put(a,min);
        }
        ladder.put(start,0);
        //当队列为空时表明已经读取完整个广度优先树了
        while (!queue.isEmpty()){
            String word=queue.poll();//读取当前节点
            int step=ladder.get(word)+1;//设置下一节点的层数
            if (step>min)break;//超过了目标值层数就可以退出了
            for (int i=0;i<word.length();i++){//这里是每个字符变一下看是否在list里面有下一节点
                StringBuilder builder=new StringBuilder(word);
                for (char ch='a';ch<='z';ch++){
                    builder.setCharAt(i,ch);
                    String new_word=builder.toString();
                    if (ladder.containsKey(new_word)){
                        if (step>ladder.get(new_word))continue;//这里判断是否已经在更高层使用了
                        else if (step<ladder.get(new_word)){//没有使用后就把节点添加进队列，并设置层数
                            queue.add(new_word);
                            ladder.put(new_word,step);
                        }else ;//这里等于不添加进去是因为节点只能添加进队列一次，不continue是因为他可能有几个pre节点通向他，要执行后面的代码

                        if (map.containsKey(new_word)){
                            map.get(new_word).add(word);
                        }else {
                            List<String> list=new LinkedList<>();
                            list.add(word);
                            map.put(new_word,list);
                        }
                        if (new_word.equals(end))min=step;
                    }
                }
            }
        }
        backTrace(end,start,new ArrayList<>(),map,results);//这里用递归的方法来连点成路径
        return results;
    }

    private void backTrace(String word,String start,List<String> temp,Map<String,List<String>> map, List<List<String>> results){
        if (word.equals(start)){//这是递归点
            temp.add(0,word);
            results.add(new ArrayList<>(temp));
            temp.remove(0);
            return;
        }
        temp.add(0,word);
        if (map.get(word)!=null){
            for (String s:map.get(word))backTrace(s,start,temp,map,results);
            temp.remove(0);
        }
    }

}
