package practice7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardGame {

    private int firstCard;
    private int secondCard;
    private int step;
    private boolean gameOver = false;

    public void addCard(Queue deck, int a) {
        deck.add(a);
    }

    public void step(Queue deck1, Queue deck2) {

        if (deck1.peek() == null) {
            System.out.println("second " + step);
            gameOver = true;
            return;
        }
        if (deck2.peek() == null) {
            System.out.println("first " + step);
            gameOver = true;
            return;
        }

        firstCard = (int) deck1.peek();
        if (firstCard == 0) {
            firstCard = 10;
        };

        secondCard = (int) deck2.peek();
        if (secondCard == 0) {
            secondCard = 10;
        };

        if (firstCard > secondCard) {
            if (firstCard == 10) {
                firstCard = 0;
            }
            deck2.remove();
            deck1.remove();
            deck1.add(firstCard);
            deck1.add(secondCard);
            step++;
        }
        if (secondCard > firstCard) {
            if (secondCard == 10) {
                secondCard = 0;
            }
            deck2.remove();
            deck1.remove();
            deck2.add(firstCard);
            deck2.add(secondCard);
            step++;
        }
        if (firstCard == secondCard) {
            deck1.remove();
            deck2.remove();
            if (firstCard == 10) {
                firstCard = 0;
            }
            if (secondCard == 10) {
                secondCard = 0;
            }
            deck1.add(firstCard);
            deck2.add(secondCard);
            step++;
        }

        System.out.println("Итог шага " + step +": \n" + deck1 + "\n" + deck2);
        if (step >= 106) {
            gameOver = true;
            System.out.println("botva");
        }
    }

    public static void main(String[] args) {
        CardGame game = new CardGame();
        Queue<Integer> firstDeck = new LinkedList<>();
        Queue<Integer> secondDeck = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пять карт первой колоды:");
        for (int i = 1; i <= 5; i++) {
            game.addCard(firstDeck, input.nextInt());
        }
        System.out.println("Введите пять карт второй колоды:");
        for (int i = 1; i <= 5; i++) {
            game.addCard(secondDeck, input.nextInt());
        }

        while ((game.gameOver) == false) {
            game.step(firstDeck, secondDeck);
        }

    }

}
