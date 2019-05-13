package sort.may9th;

/**
 * @author Anthony on 2019/5/11
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] sum = {1,2,3,4,5,6,7,8,9,10};
        int res = search(sum,5);
        int result = sear(sum,10);
        System.out.println(res);
        System.out.println(result);
    }
    public static int search(int []sum,int data){
        int low = 0;
        int high = sum.length - 1;
        int mid;
        while (low <= high){
            mid = low + (high - low)/2;
            if (sum[mid] == data){
                return mid;
            }else if (sum[mid] < data){
                low = mid +1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int sear(int []sum,int data){
        int low = 0;
        int high = sum.length - 1;
        int res = sear(sum,data,low,high);
        return res;
    }

    private static int sear(int[] sum, int data,int low,int high) {
        int mid = low + (high-low)/2;
        if (sum[mid] == data){
            return mid;
        }else if (sum[mid] > data){
            return sear(sum,data,low,mid-1);
        }else {
            return sear(sum,data,mid+1,high);
        }
    }
}
