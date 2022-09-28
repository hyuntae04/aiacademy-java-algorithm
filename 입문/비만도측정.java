package 입문;

import java.util.Scanner;

class 비만도측정 {
    public static void main(String[] args) {
        비만도측정 solution = new 비만도측정();
        System.out.println(solution.solution());
    }
    public String solution()
    {
        String title = "비만도측정";
        String name = "";
        float height = 0.0f;
        float kg = 0.0f;
        float bmi = 0;
        String degree = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 입력 : ");
        name = scanner.next();
        System.out.println("키 입력 : ");
        height = scanner.nextFloat();
        System.out.println("몸무게 입력 : ");
        kg = scanner.nextFloat();
        float m = 0.0f;
        m = height *100;
        bmi= kg/m;
        if(bmi > 30){degree = "비만";}
        else if(25<=bmi) {degree = "과체중";}
        else if(19<=bmi) {degree = "정상";}
        else {degree = "저체중";}
        String answer = String.format(
        "***********************************************************************************\n"
        +"*번호 이름 키 체충 BMI 비만 정도\n"
        +"************************************************************************************\n"
        +"%s %f %f %f %s 정상\n"
        +"************************************************************************************\n"
        +"비만 : 3 과체중 : 2 정상 : 3 저체중 : 2",
        name, height, kg, bmi, degree);
        return title + answer;
    }
}
