import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		 MessageMediator mediator = new ChatMessageMediator();
		
		 ChatMembers user1 = new User("Kati");
		 ChatMembers user2 = new User("Katrin");
		 ChatMembers user3 = new User("Kateto");
		 
		 user1.send("addBot",user1);
		 user2.send("cat", user2);
		 user3.send("cat", user3);
		 user2.send("adsad", user2);
		
		
		//UserFactory user1 = new UserFactory();
		//BotFactory bot = new BotFactory();
		

	}

}
