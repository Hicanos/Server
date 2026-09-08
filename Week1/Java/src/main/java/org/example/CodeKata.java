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

    public int SumPosition(int n)
    {
        int sum = 0;
        //num의 각 자릿수를 더함
        // 반복문으로 num/10 = 0이 될 때까지 반복
        while(n>0)
        {
            sum += n%10; //10으로 나눈 나머지 = 10 미만의 정수
            n /= 10;
        }

        int answer = sum;
        System.out.println("정답:"+answer);
        return answer;
    }

    public int SumFactor(int n)
    {
        if(n<0||n>3000)
        {
            return 0;
        }
        int answer = 0;
        int div;

        for(int i=1;i<=n;i++)
        {
            div = n % i;
            if(div==0)
            {
                //나머지가 0 = 약수
                answer+=i;
            }
            //아니라면 다음 반복 진행
        }
        return answer;
    }

    public int RemainOne(int n)
    {
        if(n<3||n>1000000)
        {
            return 0;
        }
        // 1은 나머지가 안나옴
        int answer = 1;
        int remain = 0;
        while(remain!=1)
        {
            answer++; //2부터 계산 시작
            remain=n%answer;
        }

        return answer;
    }

    public long[] XCountN(int x, int n) {
        long[] answer = new long[n] ;

        // 횟수 i == n 가 되면 n회 추가한 것
        //x x*2 x*3... x*n을 전부 answer에 추가

        for(int i=1; i<=n; i++)
        {
            answer[i-1] = (long)x*i; //배열 0번부터 삽입
        }

        System.out.println("정답:"+java.util.Arrays.toString(answer));
        return answer;
    }

    public int[] ReverseArray(long n)
    {
        // 배열은 n의 자릿수만큼 존재 => log10(1000) = 3,
        int[] answer = new int[(int)Math.log10(n)+1];
        int div=0;
        // n의 각 자리 숫자를 순서대로 배열에 넣음(n%10)을 반복, 0부터 가장 최상위 자릿수까지

        for(int i=0; n>0; i++)
        {
            div = (int)(n%10);
            answer[i] = div;
            n /= 10;
        }
        //모든 자릿수를 집어 넣으면 종료

        System.out.println("정답:"+java.util.Arrays.toString(answer));
        return answer;
    }

    public int StringToint(String s)
    {
        //s는 숫자가 아닌 수이며, +나 -는 허용, 그 외의 문자는 허용하지 않음
        if(!s.matches("^[+-]?\\d+$"))
        {
            System.out.println("수, 혹은 +나 -가 아닙니다.");
            return 0;
        }
        int answer = Integer.parseInt(s);

        System.out.println("정답:"+answer);
        return answer;
    }
}
