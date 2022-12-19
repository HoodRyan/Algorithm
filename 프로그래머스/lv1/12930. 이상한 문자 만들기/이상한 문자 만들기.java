class Solution {
    public String solution(String s) {
         String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(" ".equals(arr[i])){
                idx = 0;
                sb.append(arr[i]);
                continue;
            }

            if(idx % 2 == 0){
                sb.append(arr[i].toUpperCase());
                idx++;
            }else{
                sb.append(arr[i].toLowerCase());
                idx++;
            }
        }

        return sb.toString();
    }
}