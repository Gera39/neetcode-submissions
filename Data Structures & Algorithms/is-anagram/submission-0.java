class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        String a = new String(sSort);
        String b = new String(tSort);

        return a.equals(b);
    }
}
