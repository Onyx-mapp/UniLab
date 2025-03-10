public class Main {
    class Vector {
        private int x;
        private int y;
        private int z;

        public void setCoordination(int a, int b, int c) {
            this.x = a;
            this.y = b;
            this.z = c;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public int getZ() {
            return z;
        }
        public int scalarProduct (Vector a, Vector b) {
            return a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ();
        }
        public Vector plusVector (Vector a, Vector b) {
            Vector c = new Vector();
            c.setCoordination( a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
            return c;
        }
        public Vector multiplyVector (Vector a, int n) {
            Vector b = new Vector();
            b.setCoordination( a.getX() * n, a.getY() * n, a.getZ() * n);
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}