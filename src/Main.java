public class Main {
    public static void main(String[] args) {
        System.out.println(walkOrStayAtHome(20, 5));
        System.out.println(walkOrStayAtHome(15, 10));
        System.out.println(walkOrStayAtHome(50, 15));
        System.out.println(walkOrStayAtHome(60, -20));
        System.out.println(walkOrStayAtHome(70, -25));
        System.out.println();

        int age = (generateRandomAge());
        int temperature = (generateRandomAge());
        System.out.println(walkOrStayAtHome(age, temperature));
    }

    public static String walkOrStayAtHome(int personsAge, int outsideTemperature) {
        if (personsAge >= 20 && personsAge <= 45 && outsideTemperature >= -20 && outsideTemperature <= 30) {
            return "Можно идти гулять";
        } else if (personsAge <= 20 && outsideTemperature >= 0 && outsideTemperature <= 28) {
            return "Можно идти гулять";
        } else if (personsAge >= 45 && outsideTemperature >= -10 && outsideTemperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        int rand = (int) (Math.random() * 70);
        return rand;
    }
}