// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        return mergesort(pairs);
    }

    private List<Pair> mergesort(List<Pair>pairs){
        if(pairs.size()<=1)return pairs;
        int size = pairs.size();
        int mid = size/2;
        List<Pair>leftPairList = new LinkedList<>();
        List<Pair>rightPairList = new LinkedList<>();
        for(int i = 0;i<mid;i++){
            leftPairList.add(pairs.get(i));
        }

        for(int j = mid;j<pairs.size();j++){
            rightPairList.add(pairs.get(j));
        }

       leftPairList = mergeSort(leftPairList);
       rightPairList = mergeSort(rightPairList);
       return merge(leftPairList, rightPairList, pairs);
    }

    private List<Pair> merge(List<Pair>leftPairList, List<Pair>rightPairList, List<Pair>pairs){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<leftPairList.size() && j<rightPairList.size()){
            if(leftPairList.get(i).key<=rightPairList.get(j).key){
                pairs.set(k,leftPairList.get(i));
                i++;
                k++;
            } else {
                pairs.set(k,rightPairList.get(j));
                j++;
                k++;
            }
        }

        while(i<leftPairList.size()){
            pairs.set(k,leftPairList.get(i));
            i++;
            k++;
        }
        while(j<rightPairList.size()){
            pairs.set(k, rightPairList.get(j));
            j++;
            k++;
        }

        return pairs;
    }
}
