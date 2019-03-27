package code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (int i = 0; i < s.length() - 9; i++) {
            if (!set1.add(s.substring(i,i+10))){
                set2.add(s.substring(i,i+10));
            }
        }
        for (String s1 : set2) {
            result.add(s1);
        }
        return result;
    }
}
