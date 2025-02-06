package streamcode;

import java.util.Arrays;
import java.util.List;


public class Stream_task7 {
	public static void main(String[] args) {
        List<String> words = Arrays.asList("hello","java" ,"world", "java","hello" ,"streams");
        
        long count = words.stream().filter(i -> i.startsWith("h")).count();
        
        
        
        System.out.println("String without duplicates " + count);
        
    }


}
