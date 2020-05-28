import java.util.ArrayList;
import java.util.List;

public class ChatMessageMediator  implements MessageMediator{

	private static List<User> chatMember;

    public ChatMessageMediator() {
        this.chatMember = new ArrayList<>();
    }
		
	public static void RemoveHim(ChatMembers chatM) {
		chatMember.remove(chatM);
	}
	@Override
	public void sendMessage(String message, ChatMembers chatMember) {
		for (ChatMembers u : this.chatMember) {
            //message should not be received by the user sending it
            if (u != chatMember) {
                u.receive(message);
            }
        }
	}

	@Override
	public void createMember(UserFactory userFactory) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void addUser(ChatMembers chatMembers) {
		// TODO Auto-generated method stub
		
	}*/

}
