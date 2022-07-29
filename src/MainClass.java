import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello Class");
        NewClass nc = new NewClass(); //클래스 선언해서 객체 생성
        nc.m1();
        nc.m2();
        OddEven oe =new OddEven();
        oe.intro();
        oe.game();
        oe.gameover();
    }
}