public class Two_sum{
    public static int[] twosum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6,8};
        int target=66;
        int[] result=twosum(nums,target);
        if(result.length==2){
            System.out.println("Numbers: " + result[0] + " and " + result[1]);
        }
        else{
            System.out.println("no valid pairs");
        }
    }
}
