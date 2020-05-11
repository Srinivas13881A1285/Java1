/**
 * @author Srinivas_Chintakindhi
 */

public class GroupAnagrams {
    public List<List<String>>   groupAnagram(String[] strs){
        List<List<String>> groupedAnagrams = new ArrayList<>();
        Map<String,List<String> map = new HashMap<>();


        for (String cuur : strs) {
            char[] chars = cuur.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }

            map.get(sorted).add(curr);
        }

        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }

    public static void main(String[] args) {
        List<List<String>> listList = new GroupAnagrams().groupAnagram(new String[]{"bat", "abt", "sri", "tab", "irs", "son", "nos"});
        System.out.println("listList = " + listList);
    }
}
