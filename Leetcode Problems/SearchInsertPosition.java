class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(int num:nums){
            if(num==target) return i;
            else if(num>target) return i;
            else i++;
        }
        return i;
    }
}
