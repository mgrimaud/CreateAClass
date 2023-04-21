public class Person {
    //#region variables
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
    //#endregion
    
    //#region other methods
    public void agePerson() {
        age++;
        weight *= timePassesWeight();
        height *= timePassesHeight();
    }

    public void agePerson(int a) {
        for (int i = 0; i < a; i++) {
            age++;
            weight *= timePassesWeight();
            height *= timePassesHeight();
        }

    }
    //#endregion
}