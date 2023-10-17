package org.example;
import java.io.Serializable;

public class User implements Serializable {
  private String name;
  private String login;
  private int age;
  private String[] hobbies;

  public User(String name, String login, int age, String[] hobbies) {
    this.name = name;
    this.login = login;
    this.age = age;
    this.hobbies = hobbies;
  }

  public String toString() {
    return "\nПользователь: " + name
      + " с логином: " + login
      + ". Его возраст: " + age
      + ". Все хобби: \n" + String.join("\n", hobbies).replaceAll(" ", "");
  }
}
