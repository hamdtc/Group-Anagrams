class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //start a map  to store the values
        HashMap<String, List<String>> map = new HashMap<>();

        
        //iterate through the array
        for (int i = 0; i < strs.length; i++) {
            String s1 = strs[i];
            
            //string to char array to sort the elements
            //so the tc is klogk for this
            char[] arr = s1.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);

            
            //if there is no element with that type then add
            //else add with same anagram
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s1);
        }
        
        //return list of list of map values
        return new ArrayList<>(map.values());
    }
}