package org.fundacionjala.Wilcard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by erickaviraca on 9/2/2016.
 */
public class SearchEngine {

    /**
     * Finds and return the position of the pattern matches.
     *
     * @param needle, the original needle.
     * @param haystack, the string when the needle will evaluate.
     * @return --> the position (an integer number). and if it isn't found (-1)
     */
    public static int find(String needle, String haystack) {
        final String regex = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
        Matcher matcher = Pattern.compile(regex).matcher(haystack);
        return matcher.find() ? matcher.start() : -1;
    }

}

