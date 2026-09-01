package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        solution(4,2);
        solution(-3,-2);
        solution(5000,-5000);
        solution(50001,6);
        solution(-57000,9);
        solution(5,50020);
        solution(10,-50001);
        solution(50102,-59102);
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
}