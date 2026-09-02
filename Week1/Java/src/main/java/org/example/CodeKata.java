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

    public String OddEven(int num)
    {
        int divide=num%2;
        String answer = (divide==0) ? "Even"
                :"Odd";

        System.out.println("정답:"+answer);
        return answer;
    }

    public double ArrAverage(int[] arr)
    {
        int sum=0;

        if(arr.length==0)
        {
            System.out.println("배열이 비어있습니다.");
            return 0;
        }
        else if(arr.length>100)
        {
            System.out.println("배열의 길이가 100을 초과했습니다.");
            return 0;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<-10000||arr[i]>10000)
            {
                System.out.println("배열의 원소는 -10000~10000까지의 수를 작성해주세요");
                return 0;
            }

            sum+=arr[i];

        }
        double answer = (double)sum/arr.length;
        System.out.println("평균값:"+answer);
        return answer;
    }
}
