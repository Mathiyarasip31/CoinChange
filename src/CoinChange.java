import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int amount=scanner.nextInt();
        Count(arr,size,amount);
        }
        public static void Count(int arr[],int size,int amount)
        {
            int count=0,sum=0;
            int num=size-1;
            Arrays.sort(arr);
            while (sum!=amount&&num>=0)
            {
                if(sum+arr[num]<=amount)
                {
                    sum+=arr[num];
                    count++;
                }
                else
                {
                    num--;
                }
            }
            if(sum==amount)
            {
                System.out.println(count);
            }
            else
            {
                System.out.println("-1");
            }
        }
}
