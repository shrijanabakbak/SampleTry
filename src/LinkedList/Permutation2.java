package LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.ByteBuffer;

public class Permutation2 {
 
 public static void main(String[] args) {
 Permutation2 pa=new Permutation2();
 
 int[] arr= {1, 0, 1};
 int sum = 0;
 
 List<List<Integer>> permute = pa.permute(arr);
 
 System.out.println("Permuations of array : [1, 0, 1] are:");
 System.out.println("=========================================");
 
 for(List<Integer> perm:permute)
 {


    int j=0;
    for(int i=perm.size();i>0;i--){
        sum+=perm.get(j)*Math.pow(2*perm.get(j),i-1);
        j++;
    }
    System.out.println(perm);
    System.out.println(sum);

  sum=0;
    
 }
 }
 public List<List<Integer>> permute(int[] arr) {
 List<List<Integer>> list = new ArrayList<>();
 Arrays.sort(arr);
 permuteHelper(list, new ArrayList<>(), arr,new boolean[arr.length]);
 return list;
 }
 
 private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] arr, boolean [] used){
 
 // Base case
 if(resultList.size() == arr.length){
         list.add(new ArrayList<>(resultList));
     } else{
         for(int i = 0; i < arr.length; i++){
             if(used[i] || i > 0 && arr[i] == arr[i-1] && !used[i - 1]) 
             {   
                 // If element is already used
              continue;
             }
             // choose element
             used[i] = true; 
             resultList.add(arr[i]);
             
             // Explore
             permuteHelper(list, resultList, arr, used);
             
             // Unchoose element
             used[i] = false; 
             resultList.remove(resultList.size() - 1);
         }
     }
 }

 

}


 

