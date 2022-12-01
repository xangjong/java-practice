package ch06_class.sec09.game;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	Scanner sc = new Scanner(System.in);
	int myNum;
	
	public void play() {
		
		Random r = new Random();		
		int rNum = r.nextInt(10) + 1;
		
		System.out.println("어떤 숫자일까요? 알아 맞혀 보세요^^(1~10)");
		System.out.println("------------------------------------------");
		System.out.print("숫자 입력 : ");
		myNum = sc.nextInt();
		
		//System.out.println(rNum);
		//System.out.println(myNum);

		while (rNum != myNum) {
			System.out.println("-------------------------------------------");
			System.out.print("아닙니다. 다시 맞혀보세요^^ 다시입력 : ");
			myNum = sc.nextInt();
		}
		
		System.out.println("맞혔습니다. 제 숫자는 "+ rNum+ "입니다.");
		//sc.close();
	}
}


/*
 import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

 public class Guess {
    //변수
    private int num;

    public Guess(){
        num = new Random().nextInt(10) + 1;
    }

    public void play(){

        Scanner sc = new Scanner(System.in);

        //입력
        out.println("--------------------------------------");
        out.println("어떤 숫자일까요? 알아 맞혀보세요^^ (1 ~ 10)");
        out.println("--------------------------------------");
        out.print("숫자 입력 : ");
        while (sc.nextInt() != num){
            out.println("--------------------------------------");
            out.print("아닙니다. 다시 맞혀보세요^^ 다시 입력 : ");
        }

        //출력
        out.println("--------------------------------------");
        out.println("드디어 맞혔습니다~ 나의 숫자는 "+num+"입니다");
        out.println("**************************************");

    }

}
 */
