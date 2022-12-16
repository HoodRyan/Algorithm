class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i] = Integer.parseInt(arr[i]);
        }
        int max = arr1[0];
        int min = arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(max<arr1[i]){
                max = arr1[i];
            }
            if(min>arr1[i]){
                min = arr1[i];
            }
        }
        answer = Integer.toString(min) + " " + Integer.toString(max);
     
        return answer;
    }
}