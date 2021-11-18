/**
 * @className: question3
 * @description: 【#9 回文数】
 * @author: kim
 * @date: 2021/11/17
 **/
public class question3 {
    /**
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
     *
     * 示例 1：
     * 输入：x = 121
     * 输出：true
     *
     * 示例 2：
     * 输入：x = -121
     * 输出：false
     * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     *
     * 示例 3：
     * 输入：x = 10
     * 输出：false
     * 解释：从右向左读, 为 01 。因此它不是一个回文数。
     *
     * 示例 4：
     * 输入：x = -101
     * 输出：false
     */
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int res = 0;
        //需要判断反转后的数是不是比原来的数大
        while (x > res){
            res = res * 10 + x % 10;
            x /= 10;
        }
        return x == res || x == res / 10;
    }

    public static void main(String[] args) {
        question3 question3 = new question3();
        System.out.println(question3.isPalindrome(1221));
    }
}
