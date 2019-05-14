package algorithms;

/**
 * Created by linld on 2019/5/10.
 */
public class ReverseString {
    char tmp;

    public static void main(String args[]) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        ReverseString rs = new ReverseString();
        rs.reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        int index = 0;
        int end = s.length - 1;
        changeCharPlace(index, end, s);
    }

    public void changeCharPlace(int i, int j, char[] s) {
        if (i >= j)
            return;

        tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;

        changeCharPlace(i + 1, j - 1, s);
    }
}
