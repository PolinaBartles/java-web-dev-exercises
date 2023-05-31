package exercises;

public class StringArray {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
            //System.out.println(Arrays.toString(words));
        }

        String[] sentences = sentence.split("\\.");
        for (String i : sentences) {
            System.out.print(i);
        }

    }
}
