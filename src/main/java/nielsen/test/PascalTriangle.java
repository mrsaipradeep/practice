package nielsen.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;

public class PascalTriangle {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            printPascal(Integer.parseInt(line));
        }
    }
    private static void printPascal(int n)
    {
        IntStream.range(0,n).forEach(PascalTriangle::processEachRow);
    }

    private static void processEachRow(int index) {
        for (int i = 0; i <= index; i++)
            System.out.print(calculate(index, i)+" ");
    }

    private static int calculate(int index, int k)
    {
        int res = 1;
        if (k > index - k)
            k = index - k;

        for (int i = 0; i < k; ++i)
        {
            res *= (index - i);
            res /= (i + 1);
        }
        return res;
    }
}