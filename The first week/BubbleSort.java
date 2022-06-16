import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        System.out.println("请输入：");
        Scanner string = new Scanner(System.in); //利用Scanner实现从键盘读入字符串
        String str = string.next();
        char[] c = str.toCharArray(); //转换成字符数组
        for(int i = 0;i < c.length-1;i++){
            for(int j = 0;j < c.length-1-i;j++){
                if((int)c[j]<(int)c[j+1]){
                    char temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        System.out.print("有序字符串：");
        System.out.println(c);
        System.out.print("ASCII码：[");
        for(int k = 0;k < c.length;k++) {
            System.out.print(k<c.length-1?(int)c[k]+", ":(int)c[k]+"]");
        }
    }
}
