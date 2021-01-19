class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // StringBuffer sb1 = new StringBuffer();
        // StringBuffer sb2 = new StringBuffer();

        // for (String s : word1) {
        //     sb1.append(s);
        // }

        // for (String s : word2) {
        //     sb2.append(s);
        // }

        // // System.out.printf(sb1.toString() + sb2.toString());
        // return sb1.toString().equals(sb2.toString());
        return String.join("", word1).equals(String.join("", word2));
    }
}
