package testpack.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

/*
    试玩猜数字游戏，游戏剩余次数通过Properties集合和字符IO流维护
    game.txt中的初始信息：
        count=3
 */
public class PropertiesTestDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("游戏开始");
        while (true) {
            Properties prop = new Properties(); //Properties的构造方法与常用Map类不同
            FileReader fr = new FileReader("idea_test\\game.txt");
            prop.load(fr); //从输入字符流读取键值对
            String count = prop.getProperty("count"); //通过键找值
            int number = Integer.parseInt(count); //将字符串解析为int
            if (number == 0) {
                System.out.println("游戏试玩已结束");
                break;
            }
            System.out.println("你的剩余游戏次数为" + number--);
            guessNumber();
            prop.setProperty("count", String.valueOf(number)); //底层是put方法
            FileWriter fw = new FileWriter("idea_test\\game.txt");
            prop.store(fw, null); //第二个参数为字符串描述信息，通常为null即可
            fr.close();
        }
        System.out.println("游戏结束");
    }
    //猜数字游戏
    public static void guessNumber() {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guessNum;
        while (true) {
            System.out.println("请输入要猜的数字：");
            guessNum = sc.nextInt();
            if (guessNum > num) {
                System.out.println("你猜的数字大了");
            } else if (guessNum < num) {
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("恭喜你猜中了！");
                break;
            }
        }
    }
}
