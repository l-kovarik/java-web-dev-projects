package org.launchcode;
public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */

    /* Student Pseudo-code:
These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * ArrayList<String> testArr = new ArrayList();
     * testArr.add("[LaunchCode]"); - Pass
     * indexOf("[") > indexOf("])" - (0, -1)
                        -----
     * testArr.add("Launch[Code]"); - Pass
     * testArr.add("[]LaunchCode"); - Pass
     * testArr.add(""); - Pass
     * testArr.add("[]"); - Pass
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["

 */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
        }
        return brackets == 0;
    }

//    public static hasBalancedBrackets("Launch[]code");
//    hasBalancedBrackets("[");

}