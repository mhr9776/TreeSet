import java.util.Random;
import java.util.Set;
import java.util.SortedSet;

public class TreeSet {
    public static void main(String[] args) {
        //Create treeSet
        Set<Character> treeSet1 = new java.util.TreeSet<>();
        Set<Character> treeSet2 = new java.util.TreeSet<>();
        //add random character
        treeSetRandomFiller(treeSet1, 10);
        treeSetRandomFiller(treeSet2, 10);

        System.out.println("TreeSet1: " + treeSet1);
        System.out.println("TreeSet2: " + treeSet2 + "\n\n");

        System.out.println("Union: " + union(treeSet1, treeSet2));
        System.out.println("Intersection: " + intersection(treeSet1, treeSet2));


    }
    //fill treeSets
    public static void treeSetRandomFiller(Set<Character> treeSet, int finalTreeSetSize){
        Random random = new Random();
        while (treeSet.size() < finalTreeSetSize){
            treeSet.add((char) (random.nextInt(26) + 'a'));
        }
    }

    public static Set<Character> union(Set<Character> treeSet1, Set<Character> treeSet2){
        Set<Character> result = new java.util.TreeSet<>(treeSet1);
        result.addAll(treeSet2);
        return result;
    }

    public static Set<Character> intersection(Set<Character> treeSet1, Set<Character> treeSet2){
        Set<Character> result = new java.util.TreeSet<>(treeSet1);
        result.retainAll(treeSet2);
        return result;
    }
}
