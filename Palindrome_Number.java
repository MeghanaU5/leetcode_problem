class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int temp=x;
        while(temp>0){
            int rev=temp%10;
            sum=sum*10+rev;
            temp=temp/10;
        }
        if(sum==x){
            return true;
        }
        else
        return false;
    } 
}
