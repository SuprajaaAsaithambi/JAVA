import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 23, 56 , 43 , 79 , 80};
        int target = 79;
        int ans = Search(nums,target);
        System.out.println(ans);


    }
    static int Search(int[] arr , int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
