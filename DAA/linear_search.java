package DAA;
public class linear_search{
    public static void main(String[] args){
        int[] numbers={5,8,12,20,25,30};
        int target=20;
        boolean found=false;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                System.out.println("number found");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("number not found");
        }
    }
}