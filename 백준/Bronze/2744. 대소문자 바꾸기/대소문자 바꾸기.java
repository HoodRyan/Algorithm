import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] arr;
        arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if(65 <= arr[i] && arr[i] <= 90) {// 아스키코드 -> A =65 Z=90
                arr[i] = (char) (arr[i] + 32);
                continue;
            }
            if(97 <= arr[i] && arr[i] <= 122) {// 아스키코드 -> a =97 z=122
                arr[i] = (char) (arr[i] - 32);
                continue;
            }
        }
        System.out.println(arr);
    }
}
