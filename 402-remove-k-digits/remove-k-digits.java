
class Solution {
    public String removeKdigits(String num, int k) {

        StringBuilder st = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);

            while (k > 0 && st.length() > 0 &&
                   st.charAt(st.length() - 1) > ch) {

                st.deleteCharAt(st.length() - 1);
                k--;
            }

            st.append(ch);
        }

        while (k > 0) {
            st.deleteCharAt(st.length() - 1);
            k--;
        }

        String ans = st.toString();

        // Remove leading zeros
        int i = 0;

        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        ans = ans.substring(i);

        if (ans.length() == 0) {
            return "0";
        }

        return ans;
    }
}
