// class display{
//     int add(int a,int b){
//         int sum=a+b;
//         return sum;
//     }
//     int add(int a,int b,int c){
//         int sum=a+b+c;
//         return sum;
//     }
// }
// class main{
//     public static void main(String args[]){
//         display obj=new display();
//         System.out.println(obj.add(10,20));
//         System.out.println(obj.add(10,20,30));
//     }
// }



// class display{
//     int add(int a,int b){
//         int sum=a+b;
//         return sum;
//     }
//     public float add(float a,float b){
//         float sum=a+b;
//         return sum;
//     }
// }
// class main{
//     public static void main(String args[]){
//         display obj=new display();
//         System.out.println(obj.add(10,20));
//         System.out.println(obj.add(10.5f,20.10f));
//     }
// }



class display{
    float add(int a,float b){
        float sum=a+b;
        return sum;
    }
    public float add(float a,int b){
        float sum=a+b;
        return sum;
    }
}
class main{
    public static void main(String args[]){
        display obj=new display();
        System.out.println(obj.add(10,20f));
        System.out.println(obj.add(10.5f,20));
    }
}



