package searching.zAlgorithm;

public class ZAlgorithm {
    public static void search(String text, String pattern) {
        String concat = pattern + "$" + text;
        int len = concat.length();
        int[] z = new int[len];
        getZarr(concat, z);
        for (int i = 0; i < len; ++i) {
            if (z[i] == pattern.length()) {
                System.out.println("Pattern found at index "
                        + (i-pattern.length()-1));
            }
        }
    }

    private static void getZarr(String str, int[] z) {
        int n = str.length();
        int l = 0, r = 0;
        for (int i = 1; i < n; i++) {
            if (i > r) {
                l = r = i;
                while (r < n && str.charAt(r - l) == str.charAt(r)) {
                    r++;
                }
                z[i] = r - l;
                r--;
            } else {
                int k = i - l;
                if (z[k] < r - i + 1) {
                    z[i] = z[k];
                } else {
                    l = i;
                    while (r < n && str.charAt(r - l) == str.charAt(r)) {
                        r++;
                    }
                    z[i] = r - l;
                    r--;
                }
            }
        }
    }

}
