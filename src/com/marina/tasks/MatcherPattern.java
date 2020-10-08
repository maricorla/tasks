package com.marina.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherPattern {

        public static void main(String[] args) {
            String text = "This pattern should be presented: mail@example and here other rows";
            String patternString = "pattern";
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(text);
            System.out.println("looking at = " +  matcher.lookingAt());
            System.out.println("Our text matches: " + matcher.matches());
        }
    }


