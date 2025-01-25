class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        // Array Leader Bruteforce solution
       ArrayList<Integer> ans= new ArrayList<>();
       int n = arr.length;
       for (int i = 0; i < n; i++) {
           boolean leader = true; 
           //Checking whether arr[i] is greater than all 
           //the elements in its right side
           for (int j = i + 1; j < n; j++){
               if (arr[j] > arr[i]) { 
                   // If any element found is greater than current leader
                   // curr element is not the leader.
                   leader = false;
                   break;
           }      
      }
      // Push all the leaders in ans array.
      if (leader) {
          ans.add(arr[i]);
          }
           
       }
       return ans;
    }
}
