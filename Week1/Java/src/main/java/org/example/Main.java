package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        solution(5000,1024);
        solution2(153,54);
    }

    public static int solution(int num1, int num2)
    {
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
        if(num1<-50000||num1>50000||num2<-50000||num2>50000)
        {
            System.out.println("-50000~50000까지의 정수를 입력해주세요");
            return 0;
        }
        else
        {
            int answer = num1*num2;
            System.out.println(answer);
            return answer;
        }
    }
}