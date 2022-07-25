import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String str = sc.nextLine();
        String[] arr = str.split("");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals("A") || arr[i].equals("B") || arr[i].equals("C"))
            {
                sum = sum + 3;
            }
            else if(arr[i].equals("D") || arr[i].equals("E") || arr[i].equals("F"))
            {
                sum = sum + 4;
            }
            else if(arr[i].equals("G") || arr[i].equals("H") || arr[i].equals("I"))
            {
                sum = sum + 5;
            }
            else if(arr[i].equals("J") || arr[i].equals("K") || arr[i].equals("L"))
            {
                sum = sum + 6;
            }
            else if(arr[i].equals("M") || arr[i].equals("N") || arr[i].equals("O"))
            {
                sum = sum + 7;
            }
            else if(arr[i].equals("P") || arr[i].equals("Q") || arr[i].equals("R") || arr[i].equals("S"))
            {
                sum = sum + 8;
            }
            else if(arr[i].equals("T") || arr[i].equals("U") || arr[i].equals("V"))
            {
                sum = sum + 9;
            }
            else if(arr[i].equals("W") || arr[i].equals("X") || arr[i].equals("Y") || arr[i].equals("Z"))
            {
                sum = sum + 10;
            }
        }
        System.out.println(sum);

    }

}