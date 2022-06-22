import java.util.Scanner;
public class NmuberGame {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("=============欢迎来到猜数字游戏=============");
        int count = 1;
        int npc = (int)(Math.random()*100)+1;
        System.out.println("请输入你要猜的数字(1--100):");
        while (true){
            int player = input.nextInt();
            if(player<1||player>100){
                continue;
            }
            boolean result = BiDaXiao(npc,player,count);
            count++;
            if(result==true){
                System.out.print("程序结束!");
                break;
            }else if(count>10){
                System.out.println("不能答了，你已经试了10次");break;
            }else{
                System.out.println("剩余" + (11-count) + "次");
            }
        }
    }
    public static boolean BiDaXiao(int npc,int player,int number){
        if(npc>player && number<10){
            System.out.print("小了,再大一点,");
            return false;
        }else if(npc<player && number<10){
            System.out.print("大了,再小一点,");
            return false;
        }else if(npc==player){
            System.out.print("对了,");
            return true;
        }else{
            return false;
        }
    }
}