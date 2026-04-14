package com.likelion.mission.package1;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력해주세요.");
        String name = sc.nextLine();
        System.out.println("전공을 입력해주세요.");
        String major = sc.nextLine();
        System.out.println("기수를 입력해주세요.");
        long order = Integer.parseInt(sc.nextLine());

//        Step1
//        if (name.isEmpty() || major.isEmpty() || order < 1){
//            throw new IllegalArgumentException("오류 ㅠ");
//        }
//        else {
//            Lion lion = new Lion(name, major, order);
//        }
        if (Lion.isValid(name, major, order)) {
            Lion lion = new Lion(name, major, order);
            System.out.println("이름: " + lion.name + "\n전공: " + lion.major + "\n기수: " + order);
        }
        else System.out.println("올바르지 않은 입력입니다.");
    }
}
