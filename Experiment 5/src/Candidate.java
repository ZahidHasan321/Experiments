import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Candidate {

    private LinkedHashMap<String, Integer> candidates = new LinkedHashMap<>(5);
    static private int[] ballot = new int[10];
    static private int[] votes = new int[6];
    static private String names[];

    {
        names = new String[]{"a", "b", "c", "d", "e"};
    }
    private int spoiltVotes = 0;

    {
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            ballot[i] = rand.nextInt(6) + 1;
            if (ballot[i] >= 1 && ballot[i] <= 5)
                votes[ballot[i] - 1]++;
            else
                spoiltVotes++;
        }
        System.out.println("Spoil votes: " + spoiltVotes);
    }


    {
        for(int i = 0; i < 5; i++)  {
            candidates.put(names[i], votes[i]);
        }
    }

    public void print() {
        for(Map.Entry<String,Integer> candidate : candidates.entrySet()) {
            System.out.println(candidate.getKey() + ": "+ candidate.getValue());
        }
    }

}
