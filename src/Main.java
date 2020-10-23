public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Abc dunn = new Abc();
        Wall wall = new Wall();

        try {
            System.out.println(Entity.colliding("Player"));
            System.out.println(Entity.colliding("Abc"));
            System.out.println(Entity.colliding("Wall"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}