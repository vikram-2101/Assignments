import java.util.*;

public class h {
    public static void main(String[] args) {
        // System.out.println(sub(345));
        // factor(6);
        // System.out.println(Arrays.toString(factor(5)));
        // System.out.println(factor(78));
        // System.out.println(list);
     
        // Scanner scanner = new Scanner(System.in);
        
        // int sum = 0;
        // int number;
        
        // System.out.println("Enter an integer (enter 0 to stop):");
        // while (true) {
        //     number = scanner.nextInt();
        //     if (number == 0) {
        //        break;
        //     }
        //     sum += number;
        // }
        
        // System.out.println("Sum of all numbers entered: " + sum);
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(Armstrong(n));
       
    //    if(Armstrong(n)) {
    //     System.out.println("yes");
    //    }
    //    else {System.out.println("no");
    // }
      
    }

    

    static int sub(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;
        }
        return product - sum;
    }

    // ArrayList<Integer> ans = new ArrayList<Integer>();
    static ArrayList<Integer> factor(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        // return i;
        return list;
    }
    static  int boom(int n) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     while(n<0) {
        if(n==0) return sum+=n;
     }
     return sum;
    }
    
    static boolean Armstrong(int n) {
        int number = n;
         int sum =0;
       while (n!=0) {
       
         int rem= n%10;
       //sum += rem*rem*rem;
       sum += Math.pow(rem,3);
         n/=10;
         
         }
       return sum==number;
          } 
    
    }

