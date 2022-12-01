package ch06_class.sec09.game;

import java.util.Random;
import java.util.Scanner;

public class GaBaBo {

	 private final static String[] data = {"가위", "바위", "보"};
	    private int computer;

	    public void play() {

	        Scanner sc = new Scanner(System.in);

	        //입력
	        System.out.println("\t\t가위바위보 게임");
	        System.out.println("가위 바위 보 게임 : 1. 가위, 2. 바위, 3. 보");
	        do {
	            computer = new Random().nextInt(3) + 1;
	            System.out.println("--------------------------------------");
	            System.out.print("번호 입력 : ");
	            int num = sc.nextInt();

	            // computer가 이기는 모든 경우
	            if(computer == 1 && num == 3 ||
	            	computer == 2 && num == 1 ||
	            	computer == 3 && num == 2)
	            	System.out.println("컴퓨터가 이겼습니다");
	            else if(computer == num)
	            	 System.out.println("비겼습니다!");
	            else
	            	 System.out.println("당신이 이겼습니다");           
	           
	            System.out.println("컴퓨터는 " + data[computer - 1] + "입니다.");
	            System.out.print("계속하시겠습니까? (y/n) : ");
	        } while (sc.next().charAt(0) != 'n');

	        //출력
	        System.out.println("게임을 종료합니다.");
	        sc.close();
	    } 
	    
	}

	/*
	  if (num == 1) {
	                if (computer == 1) {
	                    System.out.println("비겼습니다!");
	                } else if (computer == 2) {
	                    System.out.println("컴퓨터가 이겼습니다");
	                } else {
	                    System.out.println("당신이 이겼습니다");
	                }
	            } else if (num == 2) {
	                if (computer == 1) {
	                    System.out.println("당신이 이겼습니다");
	                } else if (computer == 2) {
	                    System.out.println("비겼습니다!");
	                } else {
	                    System.out.println("컴퓨터가 이겼습니다");
	                }
	            } else if (num == 3) {
	                if (computer == 1) {
	                    System.out.println("컴퓨터가 이겼습니다");
	                } else if (computer == 2) {
	                    System.out.println("당신이 이겼습니다");
	                } else {
	                    System.out.println("비겼습니다!");
	                }
	            }
	 */

