/**
 * @className: question2
 * @description: 【整数反转】
 * @author: kim
 * @date: 2021/11/16
 **/
public class question2 {
    /**
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     * <p>
     * 示例 1：
     * 输入：x = 123
     * 输出：321
     * <p>
     * 示例 2：
     * 输入：x = -123
     * 输出：-321
     * <p>
     * 示例 3：
     * 输入：x = 120
     * 输出：21
     * <p>
     * 示例 4：
     * 输入：x = 0
     * 输出：0
     */

    public int reverse(int x) {
        int temp = 0;
        while (x != 0) {
            if(temp > Integer.MAX_VALUE / 10 || temp < Integer.MIN_VALUE / 10){
                return 0;
            }
            temp = temp * 10 + (x % 10);
            x = x / 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        question2 question2 = new question2();
        System.out.println(question2.reverse(-123));
    }
}
