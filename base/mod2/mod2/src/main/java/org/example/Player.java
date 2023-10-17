package org.example;
import java.util.Random;

public class Player {
  public enum VARIANTS {
    ROCK,
    PAPER,
    SCISSORS
  }

  private String name;
  private VARIANTS choice;

  public Player() {
    this.name = "Bot";
    this.choice = getRandomChoice();
  }

  public Player(VARIANTS choice, String name) {
    this.name = name;
    this.choice = choice;
  }

  public String getName() {
    return name;
  }

  public VARIANTS getChoice() {
    return choice;
  }

  private VARIANTS getRandomChoice() {
    Random random = new Random();
    return VARIANTS.values()[random.nextInt(VARIANTS.values().length)];
  }

  public String whoWins(Player player1, Player player2) {
    VARIANTS p1Choice = player1.getChoice();
    VARIANTS p2Choice = player2.getChoice();

    if (p1Choice == p2Choice) {
      return "Ничья";
    } else if (p1Choice == VARIANTS.ROCK && p2Choice == VARIANTS.SCISSORS ||
      p1Choice == VARIANTS.PAPER && p2Choice == VARIANTS.ROCK ||
      p1Choice == VARIANTS.SCISSORS && p2Choice == VARIANTS.PAPER) {
      return "Победил игрок с именем: " + player1.getName();
    } else {
      return "Победил игрок с именем: " + player2.getName();
    }
  }
}


