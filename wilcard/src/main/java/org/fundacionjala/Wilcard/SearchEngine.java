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
        if (isValidNeedle(needle) == true) {
            Pattern r = Pattern.compile(buildPattern(needle));
            Matcher m = r.matcher(haystack);
            if (m.find() == true) {
                return m.start();
            }
            return -1;
        }
        return -1;
    }

    /**
     * Builds the pattern from the original to the recognized
     *
     * @param needle, the base needle.
     * @return --> modifier.replaceAll(sustitute).
     */
    public static String buildPattern(String needle){
        String regex = "[_]";
        String sustitute = ".";

        Pattern patron = Pattern.compile(regex);
        Matcher modifier = patron.matcher(needle);
        modifier.find();

        return modifier.replaceAll(sustitute);
    }

    /**
     * method to verify if it's a valid needle
     *
     * @param needle, the needle to be evaluate.
     * @return --> validate.find()
     */
    public static boolean isValidNeedle(String needle) {
        String regex = "[A-Za-z_]";
        Pattern valid = Pattern.compile(regex);
        Matcher validate = valid.matcher(needle);
        return validate.find();
    }

}

