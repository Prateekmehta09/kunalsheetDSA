class Solution {
    public int removeDuplicates(int[] arr) {
     LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i=0 ; i<arr.length ; i++)
        {
            set.add(arr[i]);
        }

        int i=0;

        for(int ele:set){
            arr[i++] = ele;
        }
        return set.size();
    }
}