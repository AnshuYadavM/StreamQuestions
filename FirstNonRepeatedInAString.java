
import java.util.LinkedHashMap;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedInAString {
    public static void main(String[] args) {
        String str="abbac";
//Method 1
        /*
        char[] arr =str.toCharArray();
        Character[] carr =new Character[str.length()];
        for(int i=0;i<arr.length;i++)
            carr[i]=arr[i];

        System.out.println(str.chars().mapToObj(c-> (char) c).filter(s-> Collections.frequency(List.of(carr),s)==1).findFirst().get());
*/
//Method 2
        char c=str.chars().mapToObj(s-> (char) s)
                        .collect(Collectors.groupingBy(
                                    Function.identity(),
                                    LinkedHashMap::new,
                                    Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(e->e.getValue()==1)
                        .map(e->e.getKey())
                .findFirst().get();

        System.out.println(c);
    }
}
