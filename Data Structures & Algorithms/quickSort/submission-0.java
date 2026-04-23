// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        return quicksort(pairs,0,pairs.size());
    }

    private List<Pair> quicksort(List<Pair> pairs, int start, int end){
        if(start < end){
            int pIndex = getPIndex(pairs, start, end);
            quicksort(pairs, start, pIndex);
            quicksort(pairs, pIndex+1, end);
        }

        return pairs;
    }

    private int getPIndex(List<Pair> pairs, int start, int end){
        int pivot = pairs.get(end-1).key;
        int pIndex = start;
        for(int i = start;i<end;i++){
            if(pairs.get(i).key < pivot){
                Pair temp = pairs.get(i);
                pairs.set(i, pairs.get(pIndex));
                pairs.set(pIndex,temp);
                pIndex++;
            }
        }

        Pair temp = pairs.get(end-1);
                pairs.set(end-1, pairs.get(pIndex));
                pairs.set(pIndex,temp);

        return pIndex;

    }
}
