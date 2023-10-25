import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = sc.nextInt();
        HashSet<Integer> s=new HashSet<Integer>();
        for(int i =0;i<arr.length;i++){
            int temp=sum-arr[i];
            if(s.contains(temp)){
                System.out.print("Yes");
                return;
            }
            s.add(arr[i]);
        }
        System.out.println("No");
}
}
//  boolean found = false; 

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == sum) {
//                     found = true; 
//                     break;
//                 }
//             }
//             if (found) {
//                 break; 
//             }
//         }
        
//         if (found) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     }