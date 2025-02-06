package streamcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_task4 {
	public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        
        List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        
        List<String> lowerCaseWords = words.stream()
                                           .map(String::toLowerCase)
                                           .collect(Collectors.toList());
        
        System.out.println("Uppercase words: " + upperCaseWords);
        System.out.println("Lowercase words: " + lowerCaseWords);
    }

}
