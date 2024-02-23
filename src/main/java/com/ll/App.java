package com.ll;

import java.util.Scanner;

class App {
    static void run() {
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.println("명령) ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            }
            else if (cmd.equals("등록")) {
                System.out.printf("등록할 명언을 작성하세요 : ");
                String 명언 = scanner.nextLine();
                System.out.printf("등록한 명언의 작가를 작성하세요 : ");
                String 작가 = scanner.nextLine();
                System.out.println("명언 : " + 명언);
                System.out.println("작가 : " + 작가);
                break;
            }

            System.out.printf("입력하신 명령 : %s\n", cmd);
        }
    }
}