class Ball { 
    boolean usable; 
    Ball ball;
public static void main (String[] args) {
    Ball b = new Ball();
    System.out.print(b.usable);
    System.out.print(" "+ b.ball.usable);
}
}