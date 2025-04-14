import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class PracticeProblem {

	public static void main(String args[]) {

	}


	//1
	 public static ArrayList<String> perms(String str) {
        ArrayList<String> result = new ArrayList<>();
        permuteHelper("", str, result);
        return result;
    }

    private static void permuteHelper(String prefix, String remaining, ArrayList<String> result) {
        if (remaining.length() == 0) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            permuteHelper(
                prefix + remaining.charAt(i),
                remaining.substring(0, i) + remaining.substring(i + 1),
                result
            );
        }
    }





	//2
    public static ArrayList<String> permsUnique(String str) {
        Set<String> set = new HashSet<>();
        permuteHelperUnique("", str, set);
        return new ArrayList<>(set);
    }

    private static void permuteHelperUnique(String prefix, String remaining, Set<String> result) {
        if (remaining.length() == 0) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            permuteHelperUnique(
                prefix + remaining.charAt(i),
                remaining.substring(0, i) + remaining.substring(i + 1),
                result
            );
        }
    }

}
