/**
 *	Input: nums1 = [1,3], nums2 = [2]
	Output: 2.00000
	Explanation: merged array = [1,2,3] and median is 2.

 *	Input: nums1 = [1,2], nums2 = [3,4]
	Output: 2.50000
	Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

*/


public class MedianOfTwoSortedArray{

	public static void main(String[] args) {
		int[] nums1 = new int[]{2,4};
		int[] nums2 = new int[]{1,3};

        System.out.println("Median of Merged Array: " + findMedianSortedArrays(nums1,nums2));

	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int n3 = n1 + n2;
        int arr[] = new int[n3];
        
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            } else{
                arr[k] = nums2[j];
                k++;
                j++; 
            }
        }
        while(i < n1){
            arr[k] = nums1[i];
            k++;
            i++;
        }
        while(j < n2){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        
    	System.out.print("Merged Array: ");
        printArray(arr, n3);

        int mid = n3 /2;
        if(n3 % 2 == 0){
            return (double)(arr[mid-1] + arr[mid])/2;
        }else{
            return arr[mid];
        }
    }

    public static void printArray(int arr[], int n){
    	for(int i = 0; i < n; i++){
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    }

    public double BinarySearchLogic(int[] nums1, int[] nums2) {
        
        // Approach : Binary Search - Logic of partitioning only for this problem; TC : O(log(m+n))
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1>n2)
            return BinarySearchLogic(nums2, nums1);
        
        //Partionning logic starts
        int low = 0, high = n1; // we always run binary search on smaller array
        while(low<=high){
            int partX = low+(high-low)/2;
            int partY = (n1+n2+1)/2 - partX;
            
            //If extreme left partition before 0th index then take -infinity or else take nums1[partX-1]
            double l1 = partX == 0 ? Integer.MIN_VALUE : nums1[partX-1];
            double R1 = partX == n1? Integer.MAX_VALUE : nums1[partX];
            
            double l2 = partY == 0 ? Integer.MIN_VALUE : nums2[partY-1];
            double R2 = partY == n2? Integer.MAX_VALUE : nums2[partY];
            
            if(l1<=R2 && l2<=R1){ // correct partition; satisfies
                if((n1+n2) % 2 == 0 ){
                    return (Math.max(l1,l2) + Math.min(R1,R2))/2;
                }else
                    return Math.max(l1,l2);
            }else if(l2>R1)
                low = partX+1;
            else
                high = partX-1;
        }
        return -1;
    }

}