class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x % 10 == 0 && x!= 0 ))
           return false;
        int returnhalf=0;
        while(x>returnhalf){
            returnhalf=returnhalf*10+x%10;
            x/=10;
        }
        return (x==returnhalf||x==returnhalf/10);
    }
}