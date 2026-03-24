class Solution {
    public String[] findWords(String[] words) {
        String row1 = "QWERTYUIOPqwertyuiop";
        String row2 = "ASDFGHJKLasdfghjkl";
        String row3 = "ZXCVBNMzxcvbnm";
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            boolean flag = true;
            if (row1.indexOf(word.charAt(0)) != -1) {
                int len = word.length();
                for (int i = 1; i < len; i++) {
                    if (row1.indexOf(word.charAt(i)) == -1) {  
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    list.add(word);
                }
            } else if (row2.indexOf(word.charAt(0)) != -1) {
                int len = word.length();
                for (int i = 1; i < len; i++) {
                    if (row2.indexOf(word.charAt(i)) == -1) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    list.add(word);
                }
            } else {
                int len = word.length();
                for (int i = 1; i < len; i++) {
                    if (row3.indexOf(word.charAt(i)) == -1) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    list.add(word);
                }
            }
        }
        String[] arr = list.toArray(new String[0]);
        return arr;
    }
}