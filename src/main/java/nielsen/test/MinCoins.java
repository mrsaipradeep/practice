package nielsen.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MinCoins {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(findMinCoins(Integer.parseInt(line)));
        }
    }

    private static int findMinCoins(int amt) {
        List<Integer> ans = new ArrayList<>();
        int[] coins = {1, 3, 5};
        for (int i = coins.length - 1; i >= 0; i--) {
            System.out.println("each coin"+coins[i]);
            while (amt >= coins[i]) {
                amt -= coins[i];
                ans.add(coins[i]);
            }
        }
        return ans.size();
    }
}