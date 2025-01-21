Print Anagrams Together
Difficulty: MediumAccuracy: 65.78%Submissions: 94K+Points: 4
Given an array of strings, return all groups of strings that are anagrams. The strings in each group must be arranged in the order of their appearance in the original array. Refer to the sample case for clarification.

   class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        LinkedHashMap<String,ArrayList<String>> hm=new LinkedHashMap<>();
        for(String i:arr){
            ArrayList<Character> temp=new ArrayList<>();
            for(char c:i.toCharArray())temp.add(c);
            Collections.sort(temp);
            String s="";
            for(char p:temp)s+=p;
            if(hm.containsKey(s)){
                hm.get(s).add(i);
            }
            else{
                hm.put(s,new ArrayList<>());
                hm.get(s).add(i);
            }
        }
       ArrayList<ArrayList<String>> res=new ArrayList<>();
       for(String s:hm.keySet()){
           res.add(hm.get(s));
       }
        return res;
    }
}
