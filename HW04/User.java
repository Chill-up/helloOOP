public class User {
  String name;
  private Chatroom chatroom;
  public User(String name, Chatroom chatroom) {
    this.name = name;
    this.chatroom = chatroom;
  }
}
