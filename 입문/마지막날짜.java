package 입문;

import java.util.Scanner;

class 마지막날짜{
    public static void main(String[] args) { 
        마지막날짜 soluction = new 마지막날짜();
        System.out.println(soluction.solution());

    }
    public String solution()
    {
        Scanner scanner = new Scanner(System.in);
        String title = "마지막 날짜";
        String answer = "";
        System.out.println("년");
        int year = scanner.nextInt();
        System.out.println("월");
        int month = scanner.nextInt();
        System.out.println("일");
        int day = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 && year % 400 == 0)
        {
            answer = "윤년입니다";
        }
        return title + answer;  
    }
}

