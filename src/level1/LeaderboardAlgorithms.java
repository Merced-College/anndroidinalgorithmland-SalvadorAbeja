package level1;

import java.util.ArrayList;

/**
 * STUDENT TODO FILE
 *
 * You will implement sorting and binary search for the Leaderboard Terminal.
 */
public class LeaderboardAlgorithms {

    /**
     * TODO: Sort the list by score DESCENDING (highest score first).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     * - You may use Collections.sort + Comparator for the first version.
     * - Week 8 challenge/extra credit: replace with merge sort or quicksort.
     */
    public static void sortByScoreDescending(ArrayList<ScoreEntry> list) {
        // TODO
    	
    	for (int i = 1; i < list.size(); i++) {
     	   int j = i;
     	   // Insert numbers[i] into sorted part
     	   // stopping once numbers[i] in correct position
     	   while (j > 0 && list.get(j).getScore() > list.get(j-1).getScore()) {
     	       
     	      // Swap numbers[j] and numbers [j - 1]
     	      ScoreEntry temp = list.get(j);
     	      list.set(j, list.get(j-1));
     	      list.set(j-1, temp);
     	      j--;
    			
    		}
    	}
    }

    /**
     * TODO: Sort the list by username ASCENDING (A -> Z).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     */
 
    public static void sortByUsernameAscending(ArrayList<ScoreEntry> list) {
        // TODO
    	
    	for (int i = 1; i < list.size(); i++) {
      	   int j = i;
      	   // Insert numbers[i] into sorted part
      	   // stopping once numbers[i] in correct position
      	   while (j > 0 && list.get(j).getUsername().compareTo(list.get(j-1).getUsername()) < 0) {
      	       
      	      // Swap numbers[j] and numbers [j - 1]
      	      ScoreEntry temp = list.get(j);
      	      list.set(j, list.get(j-1));
      	      list.set(j-1, temp);
      	      j--;
    		}
    	}
    }

    /**
     * TODO: Binary search for an EXACT username match.
     *
     * Precondition: list must already be sorted by username ascending!
     *
     * @return index of the matching entry, or -1 if not found
     */
    public static int binarySearchByUsername(ArrayList<ScoreEntry> list, String username) {
        // TODO
    	int low = 0;
        int high = list.size() - 1;
     
        while (high >= low) {
           int mid = (high + low) / 2;
           if (list.get(mid).getUsername().compareTo(username) < 0) {
              low = mid + 1;
           }
           else if (list.get(mid).getUsername().compareTo(username) > 0) {
              high = mid - 1;
           }
           else {
              return mid;
           }
        }
        return -1;
    }
}
