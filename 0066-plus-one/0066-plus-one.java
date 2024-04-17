class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry =1;
        for(int i= n-1; i>=0; i--){
         int num = digits[i]+carry ;
            if(num == 10){
             digits[i]=0;
             carry =1;
            }
            else{
                digits[i]++;
                carry = 0;
                break;
            }
        }
        if(carry ==1){
          digits = new int[digits.length +1];
            digits[0]=1;
        }
        return digits;
    }
}