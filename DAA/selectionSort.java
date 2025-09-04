package DAA;
public class selectionSort{
    public static void main(String[] args){
        int[] arr={12,87,56,64,90};
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}
