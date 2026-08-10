import java.util.*;

class Practice {
    public static void main(String[] args) {
      int [] arr={10, 20, 30, 20, 40, 10, 50};
      HashSet<Integer> seen=new HashSet<>();
      HashSet<Integer> duplicate=new HashSet<>();
      for(int i=0;i<arr.length;i++){
          if(seen.contains(arr[i])){
              duplicate.add(arr[i]);
          }
          else{
              seen.add(arr[i]);
          }

      }
        for (int dup : duplicate) {
            System.out.println(dup);
        }
    }
}
