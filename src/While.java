import java.util.Scanner;

// while문 : 가장 기본적인 반복문
// while문 실행시 while문 밖에 초기화 변수를 선언하고, while 안에서 초기화 변수의 카운트가 필요함
public class While {
    public static void main(String[] args){
        System.out.println("\n----- while 문 ------\n");

        int hit = 0;

        while (hit < 10){
            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다." );

            if (hit == 10){
                System.out.println("나무가 넘어갑니다.");
            }
        }

        System.out.println("\n----- 반복문 없이 실행 ------\n");
        System.out.println("나무를 1번 찍었습니다.");
        System.out.println("나무를 2번 찍었습니다.");
        System.out.println("나무를 3번 찍었습니다.");
        System.out.println("나무를 4번 찍었습니다.");
        System.out.println("나무를 5번 찍었습니다.");
        System.out.println("나무를 6번 찍었습니다.");
        System.out.println("나무를 7번 찍었습니다.");
        System.out.println("나무를 8번 찍었습니다.");
        System.out.println("나무를 9번 찍었습니다.");
        System.out.println("나무를 10번 찍었습니다.");
        System.out.println("나무가 넘어갑니다.");

//        while 사용시 주의점
//        1. 초기화 변수의 카운트 부분의 위치에따라 결과가 달라짐
//        1.1 프로그래밍이 익숙하지 않을 경우 변수의 카운트 부분을 고정해서 사용하는 것이 좋음(끝에 고정적으로 놓는게 좋음)
//        2. while문을 탈출할 수 있는 조건을 반드시 명시해야 함 (무한 루프에 빠질 수 있음)
//        2.1 break문을 사용하여 탈출

        System.out.println("\n----- while문 사용시 주의점  ------\n");
        hit = 0;

        while (hit < 5){
//            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다." );

            hit++;
            if (hit == 5){
                System.out.println("나무가 넘어갑니다.");
            }
//            hit++;
        }

        System.out.println("\n----- 문제 2  ------\n");
//       문제 2) while문을 사용하여 1 ~ 10까지 화면에 출력하는 프로그램을 작성하세요.
        int i = 1;

        while (i <= 10){
            System.out.println("i의 값 : " + i);
            i++;
        }
        System.out.println("\n----- 문제 3  ------\n");
//       문제 3) while문을 사용하여 1 ~ 10까지의 총합을 구하는 프로그랩을 작성하세요.
        i = 1;
        int sum = 0;
        while (i <= 10){
            sum = sum+i;
            if (i == 10){
                System.out.println("i의 합 : " + sum);
            }
            i++;
        }

        Scanner sc = new Scanner(System.in);

        i = 0;
        int n = 0;
        double total = 0.0;


        System.out.println("\n----- 책 예제  ------\n");
        
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요");

//        while문의 조건식에 탈출 조건까지 함께 지정
//        키보드 입력을 통한 데이터가 0이 아닐경우 아래의 while문 실행, 0이면 while문 종료
        while ((n = sc.nextInt()) !=0){
            total = total + n;
            i++;
        }
        System.out.print("수의 개수는 " + i + "개이며, ");
//        총합이 저장된 변수 sum은 double형
//        입력된 데이터의 수가 저장된 변수 count는 int형
//        double형과 int형의 연산이 수행되면 자동형변환이 발생하여 double형으로 데이터가 만들어짐
        System.out.println("평균은 " + total / i + "입니다.");

        System.out.println("\n----- 구구단  ------\n");
        
//        문제 4) while문을 사용하여 지정한 단수의 구구단을 출력하세요.
//        출력형태 : 5 * 1 = 5, ~ 5 * 9 = 45
        System.out.println("구구단입니다. 숫자를 입력하세요");
        int gugu = sc.nextInt();
        i = 1;
        while (i <= 9){
            System.out.print(gugu + "*" + i + "=" + (gugu * i)+"\t");
            i++;
        }
//        다중while문 : 하나의 while문 안에 또 다른 while문이 있는 형태의 while문을 뜻함
        System.out.println("\n----- 다중 while문  ------\n");

        i = 0;
        int j = 0;
        while (i < 5){
            while (j < 5){
                System.out.println("i : " + i + "\tj : " + j);
                j++;
            }
            i++;
            j=0;
        }

        System.out.println("\n----- 다중 while문  ------\n");

        i = 0;
        while (i < 5){
            j = 0;
            while (j < 5){
                System.out.println("i : " + i + "\tj : " + j);
                j++;
            }
            i++;
        }

//        문제 5) while문을 사용하여 2 ~ 9단까지의 구구단을 모두 출력하는 프로그램을 작성하세요.
//        다중 while문 사용
//        출력형태 : 5 * 1 = 5 ~ 5 * 9 = 45

        gugu = 2;

        while (gugu <= 9){
            System.out.println();
            System.out.println("------------- " + gugu+ "단 ------------------");
            i = 1;
            while (i <= 9){
                System.out.print(gugu + " * " + i + " = " + (gugu * i)+"\t");
                i++;
            }
            System.out.println();
            gugu++;
        }

//        do ~ while : 기본적으로 while문과 동일한 반복문, 무조건 1번은 실행이 되는 while문, 반복 조건을 나중에 확인

        System.out.println("\n -------- 일반 while 문 -------------\n");

        int c1 = 10;

        while (c1 < 5){
            System.out.println(c1);
            c1++;
        }
//        do ~ while문은 일단 실행하고 조건을 나중에 확인함.

        System.out.println("\n -------- do ~ while 문 -------------\n");
        int c2 = 10;
        do{
            System.out.println(c2);
            c2++;
        } while (c2 < 5);
    }
}
