public class Test {
    public static void main(String[] args) {
            // Test Flower
            Flower rose = new Flower("Rose");
            rose.setSmellIntensity(2); // Set intensity to strong
            System.out.println("Flower: " + rose.getName() + ", Intensity: " + rose.getSmellIntensity());

            // Test Citrus
            Citrus lemon = new Citrus("Lemon");
            lemon.setColor("Yellow");
            System.out.println("Citrus: " + lemon.getCname() + ", Color: " + lemon.getColor());

            // Test Apple
            Apple redApple = new Apple("Red");
            redApple.setColor("Red");
            System.out.println("Apple Color: " + redApple.getColor());

            // Test Tomato
            Tomato cherryTomato = new Tomato("Cherry");
            System.out.println("Tomato Products: " + cherryTomato.products());
            System.out.println("Tomato Watering Schedule: " + cherryTomato.getWatered());

            new GUI();
        }
    }