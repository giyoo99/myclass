import java.util.Random;
import java.util.Scanner;

public class OddEven {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int num, n=10, ran,count=0;
    char c;
    public void intro(){
        int n=10;
        System.out.println("오징어 게임에 오신것을 환영합니다.");
        System.out.println("이번 게임은 구슬 게임입니다.");
        System.out.println("당신과 나는 각각 10개의 구슬을 가지고 있습니다.");
        System.out.println("상대방의 구슬 10개를 다 빼앗거나 나의 구슬이 다 뺴앗기면 게임이 끝이납니다.");
        System.out.println("그럼 게임을 시작합니다.");
        System.out.println("현재 당신의 구슬은 "+n+"개 입니다.");
    }
    public void game() {
        while (true) {
            count++;
            int ran = rd.nextInt(10) + 1;
            System.out.print("구슬을 배팅 하세요 : ");
            try {
                num = sc.nextInt();
                if (n < num) {
                    System.out.println("현재 가지고 있는 구슬의 개수가 부족합니다.");
                    System.out.print("다시 배팅하세요 : ");
                    num = sc.nextInt();
                }
                System.out.print("홀짝을 맞춰주세요 : ");
                char c = sc.next().charAt(0);
                System.out.println("상대방 구슬의 개수 : " + ran);
                if (ran % 2 == 0 && c == '짝') {
                    System.out.println("정답입니다.");
                    n = n + num;
                } else if (ran % 2 == 1 && c == '홀') {
                    System.out.println("정답입니다.");
                    n = n + num;
                } else {
                    System.out.println("틀렸습니다.");
                    n = n - num;
                }
                System.out.println("현재 내가 가진 구슬의 개수 : " + n + "개");
            }catch (Exception e){
                System.out.println("숫자만 입력해 주세요.");
                sc.nextLine();
            }
            if(n<=0){
                break;
            }
            if(n>=20){
                break;
            }
        }
    }
    public void gameover(){
        if (n <= 0) {
            System.out.println("※구슬을 다 잃어 게임이 끝났습니다.※");
        } else if (n >= 20) {
            System.out.println("※상대방 구슬을 다 빼앗아 승리하였습니다.※");
        }
        System.out.println("총 시도 횟수 : "+count);
    }
}