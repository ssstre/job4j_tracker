package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.truEat(ball);
        ball.ranAwayHare(hare);
        wolf.truEat(ball);
        ball.ranAwayWolf(wolf);
        fox.truEat(ball);
        ball.ateAFox(fox);
    }
}
