package utils;

import filesutils.FileReader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegHexUtils {

    public String sortNumericString(String numericString) {
        StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(numericString);
        return matcher.results().map(m -> m.group()).sorted().collect(Collectors.joining(","));
    }

    public Long countWordRepeat(String word) {
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        String text = FileReader.loadFile(System.getProperty("user.dir") + "\\resources\\textfile.txt");
        Matcher matcher = pattern.matcher(text);
        return matcher.results().count();
    }

}
