import java.util.Arrays;

public class test1{

	
public static void main(String[] args) {
   

    int[] a1 = {}, a2 = {1, 3, 5};	
    int l1 = a1.length;
    int l2 = a2.length;
    int [] resalt = new int[l1 + l2];
    int x1 = 0;
    int x2 = 0;
        
    while (x1 < l1 || x2 < l2){
        if (x2 >= l2 || a1[x1] <= a2[x2]){
        resalt[x1 + x2] = a1[x1];
        x1++;
        }    
        else {
        resalt[x1 + x2] = a2[x2];
        x2++; 
        }
    }
    System.out.println(Arrays.toString(resalt));
    
    

}
}
