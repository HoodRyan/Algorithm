class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String s = Integer.toString(x);
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = s.charAt(i)- '0';
            sum = sum + arr[i];
        }
        if(x%sum == 0){
            return true;
        }else{
            return false;
        }
    }
}