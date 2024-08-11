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
        int i = 0, count = 0;
        while(i < smiles.length){
            if(smiles[i].length() == 2){
                if(smiles[i].charAt(1) == 'D' || smiles[i].charAt(1) == ')'){
                    count++;
                }
            }else {
                    if(smiles[i].charAt(2) == 'D' || smiles[i].charAt(2) == ')'){
                        count++;
                    }
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSmileys(new String[] {":)", ";(", ";}", ":-D"}));
        System.out.println(countSmileys(new String[] {";D", ":-(", ":-)", ";~)"}));
        System.out.println(countSmileys(new String[] {";]", ":[", ";*", ":$", ";-D"}));

        System.out.println(countSmileysV2(new String[] {":)", ";(", ";}", ":-D"}));
        System.out.println(countSmileysV2(new String[] {";D", ":-(", ":-)", ";~)"}));
        System.out.println(countSmileysV2(new String[] {";]", ":[", ";*", ":$", ";-D"}));
    }
}
