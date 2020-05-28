
public interface MessageMediator {
	void sendMessage(String message, ChatMembers chatMember);

	void createMember(UserFactory userFactory);
}
