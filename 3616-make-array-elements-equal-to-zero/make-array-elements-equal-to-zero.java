class Solution {
    public int countValidSelections(int[] arr) {
        int result = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                list.add(i);
        }

        for (int i : list) {
            boolean increment = true;
            int nums[] = new int[arr.length];
            System.arraycopy(arr, 0, nums, 0, arr.length);

            while (i >= 0 && i < nums.length) {
                if (nums[i] > 0) {
                    nums[i] -= 1;
                    increment = !increment;
                }
                if (increment) {
                    i++;
                } else {
                    i--;
                }
            }

            boolean isvalid = true;
            for (int num : nums) {
                if (num != 0) {
                    isvalid = false;
                    break;
                }
            }

            if (isvalid)
                result++;
        }

        for (int i : list) {
            boolean increment = false;
            int nums[] = new int[arr.length];
            System.arraycopy(arr, 0, nums, 0, arr.length);

            while (i >= 0 && i < nums.length) {
                if (nums[i] > 0) {
                    nums[i] -= 1;
                    increment = !increment;
                }
                if (increment) {
                    i++;
                } else {
                    i--;
                }
            }

            boolean isvalid = true;
            for (int num : nums) {
                if (num != 0) {
                    isvalid = false;
                    break;
                }
            }

            if (isvalid)
                result++;
        }

        return result;
    }
}