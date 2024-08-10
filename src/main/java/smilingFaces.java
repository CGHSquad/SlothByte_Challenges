import java.util.Set;

public class smilingFaces {
    public static int countSmileys(String[] smiles){
        //Runtime of O(n) as we only iterate through the array once
        if(smiles.length == 0){
            return 0;
        }
        int count = 0;
        Set<String> smile = Set.of(":)", ";)", ";-)", ":-)", ";~)", ":~)", ":D", ";D", ";-D", ":-D", ";~D", ":~D");

        for(String smiley : smiles){
            if(smile.contains(smiley)){
                count++;
            }
        }

        return count;
    }
    public static int countSmileysV2(String[] smiles){
        //Runtime of O(n) as we only iterate through the array once
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(countSmileys(new String[] {":)", ";(", ";}", ":-D"}));
        System.out.println(countSmileys(new String[] {";D", ":-(", ":-)", ";~)"}));
        System.out.println(countSmileys(new String[] {";]", ":[", ";*", ":$", ";-D"}));
    }
}
