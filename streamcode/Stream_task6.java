package streamcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_task6 {
	public static void main(String[] args) {
        List<String> words = Arrays.asList("hello","java" ,"world", "java","hello" ,"streams");
        
        List<String> sortedarray = words.stream()
                                           .sorted()
                                           .collect(Collectors.toList());
        
        
        
        System.out.println("String without duplicates " + sortedarray);
        
    }

}
