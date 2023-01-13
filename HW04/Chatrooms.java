import java.util.ArrayList;
public class Chatrooms {
    interface Chatroom {
        void sendMessage(String msg, User user);
      
        void appendClient(User user);
      }
      void sendMsg(String text) {
        chatroom.sendMessage(text, this);
      }
      void printMessage(String msg) {
             System.out.printf("Чат %s: %s\n", name, msg);
      }
      
      class Chat implements Chatroom {
      
        ArrayList<User> users = new ArrayList<>();
      
        @Override
        public void sendMessage(String text, User me) {
      
          for (User user : users) {
            if (user.name != me.name) {
              user.printMessage(text);
            }
          }
        }
       
        @Override
        public void appendClient(User client) {
          System.out.println("\n >>> добавился " + client.name);
          users.add(client);
      
        }
      }
}
