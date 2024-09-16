import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstNonRepeatedInAString {
    public static void main(String[] args) {
        String str="abbac";

        char[] arr =str.toCharArray();
        Character[] carr =new Character[str.length()];
        for(int i=0;i<arr.length;i++)
            carr[i]=arr[i];

        System.out.println(Arrays.stream(carr).filter(s-> Collections.frequency(List.of(carr),s)==1).findFirst().get());

    }
}
