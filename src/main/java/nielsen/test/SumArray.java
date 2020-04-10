package nielsen.test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class SumArray {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            String[] input = line.split(";");

            String[] strArr = input[0].split(",");
            int[] arr = new int[strArr.length];
            for (int j = 0; j < strArr.length; j++) {
                arr[j] = Integer.parseInt(strArr[j]);
            }
            int sum = Integer.parseInt(input[1]);
            findPair(arr, sum);
        }
    }

    private static void findPair(int[] arr, int sum) {
        List<String> output = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    output.add(arr[i] + "," + arr[j]);
                }
            }
        }
        if(!output.isEmpty()){
            System.out.println(String.join(";", output));
        }else{
            System.out.println("NULL");
        }
    }

}