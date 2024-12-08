public class Animal {
    
    // Fields / Porperties
    // please add 5 different properties that and animal could have.
    // EX: Animals's kind (Cat, Dog, Lion, etc.) ...
    // In this 5, you want to include a variable that will indicate what kind of animal it is.
    // Beside the 4 you decide, please add a double value name: runDistance

    private String kind;
    private String color;
    private String bodySize;
    private int runTime;
    private double runDistance;

    public Animal(String theKind, String theColor, String theBodySize, int theRunTime, double theRunDistance) {
        this.kind = theKind;
        this.color = theColor;
        this.bodySize = theBodySize;
        this.runTime = theRunTime;
        this.runDistance = theRunDistance;
    }

    public int getRunTime() {
        return this.runTime;
    }


    public void setRunTime(int newRunTime) {
        this.runTime = newRunTime;
    }


    public String checkRunDistance() {
        if (getRunTime() < 10) { 
            return "The run distance is suitable for many situations";
        }
        return "The run distance are not long enough for some cases";
    }

    public static void main(String[] args) {

        Animal animal1 = new Animal("cat", "Black And White", "Small", 9, 93.75);

        System.out.println(animal1.kind);
        System.out.println(animal1.color);

        animal1.setRunTime(8);
        System.out.println(animal1.getRunTime());
        System.out.println(animal1.checkRunDistance());
    }
}
