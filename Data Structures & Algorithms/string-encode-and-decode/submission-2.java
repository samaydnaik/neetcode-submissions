class Solution {

    public String encode(List<String> strs) {
        StringBuffer strb = new StringBuffer();
        for(String str: strs){
            strb.append(str.length());
            strb.append("#");
            strb.append(str);
        }

        return strb.toString();
    }

    public List<String> decode(String str) {
        List<String>result = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.valueOf(str.substring(i,j));
            i = j+1+length;
            result.add(str.substring(j+1,i));
        }

        return result;

    }
}
