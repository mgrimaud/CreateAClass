import java.util.Scanner;

public class Person {
    //#region variables
    public Scanner sc = new Scanner(System.in);
    private int age;
    private Face face;
    private double weight;
    private double height;
    private String skinColor;
    private String name;
    //#endregion

    //#region contructors
    public Person() {}

    public Person(int a) {
        age = a;
    }

    public Person(int a, String n) {
        age = a;
        name = n;
    }

    public Person(int a, Face f) {
        age = a;
        face = f;
    }

    public Person(int a, String n, Face f) {
        age = a;
        name = n;
        face = f;
    }

    //#endregion

    //#region getters & setters
    public void setAge(int a) {
        age = a;
    }
    
    public int getAge() {
        return age;
    }

    public void setFace(Face f) {
        face = f;
    }

    public Face getFace() {
        return face;
    }

    public void setWeight(double w) {
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setSkinColor(String sc) {
        skinColor = sc;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setName(String n) {
        skinColor = n;
    }

    public String getName() {
        return name;
    }
    //#endregion

    //#region helper methods

    // these methods calculate the multiplier used to change aspects of an object depending on age
    private double timePassesWeight() {
        double weightMultiplier;

        if(age < 25) {
            weightMultiplier = 1.13;
        }
        else if(age < 65) {
            weightMultiplier = 1.01;
        }
        else {
            weightMultiplier = 0.9;
        }

        return weightMultiplier;
    }

    private double timePassesHeight() {
        double heightMultplier;
        
        if(age < 65) {
            heightMultplier = 1.01;
        }
        else {
            heightMultplier = 0.99;
        }

        return heightMultplier;
    }

    private double timePassesHairs() {
        double hairMultplier;
        
        if(age < 25) {
            hairMultplier = 1.01;
        }
        else if(age < 65){
            hairMultplier = 1;
        }
        else {
            hairMultplier = 0.99;
        }

        return hairMultplier;
    }
    //#endregion
    
    //#region other methods
    //implements the aging system and changes physical features depending on the multipliers determined in timePasses____
    public void agePerson() {
        age++;
        weight *= timePassesWeight();
        height *= timePassesHeight();
        face.setNumHairs((int) (face.getNumHairs()*timePassesHairs()));
    }

    public void agePerson(int a) {
        for (int i = 0; i < a; i++) {
            agePerson();
        }

    }

    // this method allows the user to get information and characteristics of their Person object
    // using user input and nested if-statements
    public void info() {
        System.out.println("What aspect of " + name + " are you looking for?: ");
        String answer = sc.nextLine();
        if(answer.equals("face")) {
            System.out.println("What aspect of the face are you looking for?: ");
            String answerTwo = sc.nextLine();

            if(answerTwo.equals("num hairs")) {
                System.out.println(face.getNumHairs());
            }
            else if (answerTwo.equals("has dimples")){
                System.out.println(face.getDimples());
            }
            else if (answerTwo.equals("has freckles")){
                System.out.println(face.getDimples());
            }
            else if (answerTwo.equals("has cleft chin")){
                System.out.println(face.getCleftChin());
            }
            else if (answerTwo.equals("has widow's peak")){
                System.out.println(face.getWidowsPeak());
            }
            else if (answerTwo.equals("has wrinkles")){
                System.out.println(face.getWrinkles());
            }
            else {
                System.out.println("Sorry, that isn't one of my options. Please try again.");
            }
        }

        else {
            if(answer.equals("name")){
                System.out.println(name);
            }
            else if(answer.equals("age")){
                System.out.println(age);
            }
            else if(answer.equals("height")){
                System.out.println(height);
            }
            else if(answer.equals("weight")) {
                System.out.println(weight);
            }
            else if(answer.equals("skin color")) {
                System.out.println(skinColor);
            }
            else {
                System.out.println("Sorry, that isn't one of my options. Please try again.");
            }
        }
    }

    //#endregion
}