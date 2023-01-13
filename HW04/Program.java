
import java.util.ArrayList;

public class Program {

  public static void main(String[] args) {
    Chatrooms gb = new Chatrooms();

    User client1 = new User("Вася", gb);
    User client2 = new User("Маша", gb);
    User client4 = new User("Вальдемар", gb);

    gb.appendClient(client1);
    gb.appendClient(client2);
    gb.appendClient(client4);

    client1.sendMsg("привет всем!");

    client2.sendMsg("ку-ку!");

    User client3 = new User("Коля", gb);
    gb.appendClient(client3);

    client3.sendMsg("hello world!");
  }
}




