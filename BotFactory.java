
public class BotFactory extends MemberFactory{

	@Override
	public ChatMembers createMember(String name, MessageMediator messageMediator) {
		// TODO Auto-generated method stub
		return new Bot();
	}

}
