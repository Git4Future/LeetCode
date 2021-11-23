/**
 * @className: question6
 * @description: 【#14.最长公共前缀】
 * @author: Kinglone
 * @date: 2021/11/23
 **/
public class question6 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null){
            return "";
        }
        int length = strs[0].length();
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];

    }

    public static void main(String[] args) {
        question6 question6 = new question6();
        System.out.println(question6.longestCommonPrefix(new String[]{"leet","le","let"}));
    }
}
