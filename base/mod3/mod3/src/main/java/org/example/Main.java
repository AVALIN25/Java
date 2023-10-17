package org.example;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.print("Введите имя: ");
      String name = reader.readLine();
      System.out.print("Введите логин: ");
      String login = reader.readLine();
      System.out.print("Введите возраст: ");
      int age = Integer.parseInt(reader.readLine());
      System.out.print("Введите хобби через запятую: ");
      String[] hobbies = reader.readLine().split(",");
      User user = new User(name, login, age, hobbies);

      // Сериализация объекта
      FileOutputStream fileOut = new FileOutputStream("user.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(user);
      out.close();
      fileOut.close();
      System.out.println("Объект User был сериализован в файл user.ser");

      // Десериализация объекта
      FileInputStream fileIn = new FileInputStream("user.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      User deserializedUser = (User) in.readObject();
      in.close();
      fileIn.close();
      System.out.println("Объект User был десериализован из файла user.ser");

      // Вывод полученного объекта с помощью переопределенного метода toString()
      System.out.println(deserializedUser.toString());
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
