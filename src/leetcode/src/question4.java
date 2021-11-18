import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: question4
 * @description: 【#13 罗马数字转整型】
 * @author: Kinglone
 * @date: 2021/11/18
 **/
public class question4 {
    public int romanToInt(String s) {
        Map<Character,Integer> dic = new HashMap<>(7);
        dic.put('I',1);
        dic.put('V',5);
        dic.put('X',10);
        dic.put('L',50);
        dic.put('C',100);
        dic.put('D',500);
        dic.put('M',1000);

        int temp = 0;
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            int value = dic.get(chars[i]);
            if(i < length -1 && value < dic.get(chars[i+1])){
                temp -= value;
            }else {
                temp += value;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        question4 question4 = new question4();
        System.out.println(question4.romanToInt("IV"));
    }
}
