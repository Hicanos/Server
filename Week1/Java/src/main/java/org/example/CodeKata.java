package org.example;

public class CodeKata
{
    public double Average(int[] numbers)
    {
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            int num=numbers[i];
            if(num<1||num>1000)
            {
                System.out.println("1~1000까지의 수를 작성해주세요");
                return 0;
            }
            sum += num;
        }

        double answer = (double)sum/numbers.length;
        System.out.println("평균값:"+answer);
        return answer;
    }
}
