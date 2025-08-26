// import java.util.ArrayList;
// import java.util.Iterator;
// public class iteratorinterface {
//     public static void main(String args[]){
//         ArrayList<String>a1=new ArrayList<>();
//         Iterator<String>it=a1.iterator();
//         while(it.hasNext()){
//             String n=it.next();
//             System.out.println(n);
//         }
//     }
// }


// import java.util.*;
// public class iteratorinterface {
//     public static void main(String args[]){
//         List<String>l1=new ArrayList<>();
//         l1.add("Java");
//         l1.add("C++");
//         l1.add("python");
//         l1.add("C");

//             System.out.println("Element of list:");
//             for(String s:l1){
//                 System.out.println(s);
//             }
//             System.out.println("Element at index 2 is:"+l1.get(1));
//             l1.set(2,".net");
//             System.out.println("updated list:"+l1);

//         }
// }


// import java.util.*;

// public class iteratorinterface {
//     public static void main(String args[]) {
//         SortedSet<String> Ss = new TreeSet<String>();
//         Ss.add("sonu");
//         Ss.add("shivang");
//         Ss.add("sunil");
//         Ss.add("sonu");
        
//         System.out.println(Ss);
        
//         Ss.remove("sonu");
//         System.out.println(Ss);
        
//         System.out.println(((TreeSet<String>) Ss).descendingSet());
        
//         Iterator<String> i = Ss.iterator();
//         System.out.print("Forward iteration: ");
//         while (i.hasNext()) {
//             System.out.print(i.next() + " ");
//         }
//         System.out.println();
        
//         Iterator<String> rev = ((TreeSet<String>) Ss).descendingIterator();
//         System.out.print("Reverse iteration: ");
//         while (rev.hasNext()) {
//             System.out.print(rev.next() + " ");
//         }
//         System.out.println();
//     }
// }


import java.util.HashMap;
import java.util.Map;

public class iteratorinterface {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "sonu");
        m.put(2, "monu");
        m.put(3, "ronu");

        for (Integer key : m.keySet()) {
            System.out.println("Key: " + key + ", Value: " + m.get(key));
        }
    }
}

