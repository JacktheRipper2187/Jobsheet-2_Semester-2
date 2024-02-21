public class Snake {
    int x, y, width, height;
    // konstruktor
    Snake(int ex, int ye, int wi, int he) {
        x = ex;
        y = ye;
        width = wi;
        height = he;
    }
     void moveLeft() {
       x -= 1;
       detectCollision(x, y);
    }
    void moveRight() {
        x += 1;
        detectCollision(x, y);
    }
    void moveUp() {
        y -= 1;
        detectCollision(x, y);
    }
    void moveDown() {
        y+= 1;
        detectCollision(x, y);
    }
    void printPosition(){
        System.out.println("Posisi ular ada pada x : " + x + "\ndan berada pada sumbu : " + y);
    }
    void detectCollision(int x, int y) {
        if (x < 0 || x > width || y < 0 || y > height) {
           System.out.println(":) Game Over :V");
           System.exit(0);
        }
    }
}
