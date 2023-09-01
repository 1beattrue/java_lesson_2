public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();

        ball.setXY(1., 2.);
        System.out.println(ball);

        ball.move(3.5, 1.5);
        System.out.printf("%s, %s\n", ball.getX(), ball.getY());

        Ball ball2 = new Ball(3.5, -1.5);
        System.out.println(ball2);
    }
}
