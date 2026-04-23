public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        if(pairs.isEmpty())return new ArrayList<>();
        List<List<Pair>> result = new ArrayList<>();
        result.add(new ArrayList<>(pairs));
        for (int i = 1; i < pairs.size(); i++) {
            Pair pairTemp = pairs.get(i);
            int j = i;
            while (j > 0 && pairs.get(j - 1).key > pairTemp.key) {
                pairs.set(j, pairs.get(j - 1)); // shift
                j--;
            }
            pairs.set(j, pairTemp); // insert
            result.add(new ArrayList<>(pairs)); // snapshot
        }
        return result;
    }
}
