package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        CodeKata codeKata = new CodeKata();
        codeKata.Average(new int[]{1, 3, 4, 5});
        codeKata.Average(new int[]{67, 48, 24, 872});
        codeKata.OddEven(0);
        codeKata.OddEven(697);
        codeKata.ArrAverage(new int[]{12,1002,4584,1502,7245});
        codeKata.ArrAverage(new int[]{1302,4295,2925829});
    }

    public static int solution(int num1, int num2)
    {
        //두 수의 차
        if(num1<-50000||num1>50000||num2<-50000||num2>50000)
        {
            System.out.println("-50000~50000까지의 정수를 입력해주세요");
            return 0;
        }
        else
        {
            int answer = num1-num2;
            System.out.println(answer);
            return answer;
        }
    }

    public static int solution2(int num1, int num2)
    {
        //두 수의 곱
        if(num1<0||num1>100||num2<0||num2>100)
        {
            System.out.println("0~100까지의 정수를 입력해주세요");
            return 0;
        }
        else
        {
            int answer = num1*num2;
            System.out.println(answer);
            return answer;
        }
    }

    public static int solution3(int num1, int num2)
    {
        //몫 구하기
        if(num1<=0||num1>100||num2<=0||num2>100)
        {
            System.out.println("0~100까지의 정수를 입력해주세요");
            return 0;
        }
        else
        {
            int answer = num1/num2;
            System.out.println(answer);
            return answer;
        }
    }

    public static int BirthYear(int age)
    {
        //태어난 연도 구하기(2022년 기준)
        if(age<=0||age>120)
        {
            System.out.println("1~120까지의 나이를 작성");
            return 0;
        }

        int currentYear=2022;
        int birthYear=currentYear-age+1;
        int answer = birthYear;
        return answer;

    }

    public static int CompareNum(int num1, int num2)
    {
        int answer;
        if(num1<0||num1>10000||num2<0||num2>10000)
        {
            System.out.println("0부터 10000까지의 수로 작성");
            return 0;
        }
        else if(num1==num2)
        {
            answer=1;
        }
        else
        {
            answer=-1;
        }

        System.out.println(answer);

        return answer;
    }

    public static int SumNum(int num1, int num2)
    {
        if(num1<-50000||num1>50000||num2<-50000||num2>50000)
        {
            System.out.println("-50000~50000까지의 정수를 입력해주세요");
            return 0;
        }
        int answer=num1+num2;
        System.out.println(answer);
        return answer;
    }

    public static int DivideNum(int num1, int num2)
    {
        if(num1<=0||num1>100||num2<=0||num2>100)
        {
            System.out.println("1~100까지의 정수로 작성해주세요");
            return 0;
        }
        float calculate= ((float)num1/num2)*1000;
        int answer = (int)calculate;

        System.out.println(answer);
        return answer;
    }

    public static int AngleTest(int angle)
    {
        int answer;
        if(angle<=0||angle>180)
        {
            System.out.println("1~180사이의 정수를 입력해주세요");
            return 0;
        }

        answer = (angle==90) ? 2
                :(angle<90) ? 1
                :(angle==180) ? 4
                :3;

        System.out.println(answer);
        return answer;
    }

    public static int EvenDivide(int n)
    {
        // 0~1000까지 제한
        if(n<=0||n>1000)
        {
            return 0;
        }
        int answer;
        int calculate=0; //초기화

        //n이하의 짝수의 합 = n/2 (정수) 이하의 각 수를 더한 후 *2
        int divide = n/2;

        for (int i=1; i<=divide ; i++)
        {
            calculate+=i;
        }
        answer = calculate*2;
        System.out.println(answer);
        return answer;
    }
}