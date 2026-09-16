class SecondMostFreqElement {
  public int secondMostFrequentElement(int[] nums) {
    int[] vis = new int[10001];
    int maxFreq = 0, secMaxFreq = 0;
    int ele1 = -1, ele2 = -1;

    for (int i = 0; i < nums.length; i++) {

      int count = 0;
      if (vis[nums[i]] == 0) {
        vis[nums[i]] = 1;

        for (int j = 0; j < nums.length; j++) {

          if (nums[j] == nums[i]) {
            count++;
          }
        }
      }

      if (count > maxFreq) {
        secMaxFreq = maxFreq;
        maxFreq = count;

        ele2 = ele1;
        ele1 = nums[i];
      } else if (count > secMaxFreq && count < maxFreq) {
        secMaxFreq = count;
        ele2 = nums[i];
      } else if (count == maxFreq && nums[i] < ele1) {
        ele1 = nums[i];
      } else if (count == secMaxFreq && nums[i] < ele2) {
        ele2 = nums[i];
      }
    }

    return ele2;
  }
}
