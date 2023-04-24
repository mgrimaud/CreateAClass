public class PersonRunner {
    public static void main(String[] args) {
        Person axel = new Person(17, "Axel");
        axel.setWeight(90);
        axel.setHeight(100);
        axel.setFace(new Face(100000));

        axel.info();
    }
} 
