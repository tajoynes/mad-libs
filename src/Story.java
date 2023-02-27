import java.util.Random;

public class Story {
    Random random = new Random();
    String story;
    String name;
    String adj1;
    String adj2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNumbers;

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdj1() {
        return adj1;
    }

    public void setAdj1(String adj1) {
        this.adj1 = adj1;
    }

    public String getAdj2() {
        return adj2;
    }

    public void setAdj2(String adj2) {
        this.adj2 = adj2;
    }

    public String getNoun1() {
        return noun1;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public String getRandomNumbers() {
        return randomNumbers;
    }

    public void setRandomNumbers() {
        int index = 0;
        int[] numbers = new int[4];
        while (index < numbers.length) {
            int num = random.nextInt(0,20);
            numbers[index] = num + index;
            index++;
        }
        randomNumbers = numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3];
    }
}
