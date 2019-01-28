package strings;

import java.util.Arrays;

public class SplitTest {
    public static void main(String[] args) {
        String input = "0000000001110000110101010000011000111001111111111";
    
        String[] split = input.split("0");
    
        for (String st : split){
            System.out.println(st);
        }
    
        Arrays.stream(split)
            .mapToInt(String::length)
            .max()
            .ifPresent(System.out::println);
    }
}
