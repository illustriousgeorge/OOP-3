public abstract class Entity {
    public static int positionX1;
    public static int positionY1;
    public static int MyX;
    public static int MyY;

    public static boolean colliding(String typ) throws Exception {
        switch (typ) {
            case "Wall":
                if (Abc.positionY1 < Wall.positionY1 || Player.positionY1 < Wall.positionY1) {
                    return true;
                } else {
                    return false;
                }
            case "Dunno":
                if (Abc.positionX1 < Player.positionX1 + Player.MyX &&
                        Abc.positionX1 + Abc.MyX > Player.positionX1 &&
                        Abc.positionY1 < Player.positionY1 + Player.MyY &&
                        Abc.positionY1 + Abc.MyY > Player.positionY1) {
                    return true;
                } else {
                    return false;
                }
            case "Player":
                if (Player.positionX1 < Abc.positionX1 + Abc.MyX &&
                        Player.positionX1 + Player.MyX > Abc.positionX1 &&
                        Player.positionY1 < Abc.positionY1 + Abc.MyY &&
                        Player.positionY1 + Player.MyY > Abc.positionY1) {
                    return true;
                } else {
                    return false;
                }
            default:
                throw new Exception("no parameter given");
        }
    }

    public static enum type {
        Player, Obstacle
    }
}