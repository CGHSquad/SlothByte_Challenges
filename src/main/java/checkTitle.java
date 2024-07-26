public class checkTitle {
    public static boolean titleCheck(String title) {
        /*Approach: Split every space into a new array and then check
        if each first letter is uppercase*/

        //Split the String into a new array
        String[] isTitle = title.split(" ");

        //Checks if First character is uppercase
        for (String word: isTitle){
            if (word.isEmpty() || !Character.isUpperCase(word.charAt(0))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(titleCheck("A Mind Boggling Achievement"));
        System.out.println(titleCheck("A Simple C++ Program!"));
        System.out.println(titleCheck("Water is transparent"));
    }
}
