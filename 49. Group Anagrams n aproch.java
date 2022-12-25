class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {
        
         //first create map of map and list, why? you will know
        HashMap<HashMap<Character,Integer>, List<String>> map = new HashMap<>();
         
         
         //iterate through array
         for(String s:strs){
             
             //this map may will add to parent map as key
             //all the character added to the map 
             //and compare with previous maps and add
             HashMap<Character,Integer> chars=new HashMap<>();
             for(int i=0;i<s.length();i++){
                 chars.put(s.charAt(i),chars.getOrDefault(s.charAt(i),0)+1);
             }
             
             //if there is no element with that type then add
             //else add with same anagram
             if(!map.containsKey(chars))
                 map.put(chars,new ArrayList<>());
             
             //add the element which is s
             map.get(chars).add(s);
         }
         //return list of list of map values
         return new ArrayList<>(map.values());
     }
}