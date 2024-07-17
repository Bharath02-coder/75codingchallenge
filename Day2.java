//https://leetcode.com/problems/shuffle-the-array/
  public int[] shuffle(int[] nums, int n) {
        int k=0;
        int[] nums1=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            nums1[k++]=nums[i];
            nums1[k++]=nums[i+n];
            
        }
        return nums1;
    }
