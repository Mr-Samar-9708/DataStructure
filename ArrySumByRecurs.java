class ArrySumByRecurs {

    int i = 0;

    public int arraySum(int[] nums) {
        
        if(i == nums.length){
            return 0;
        }

        return nums[i++] + arraySum(nums);
    }
}
