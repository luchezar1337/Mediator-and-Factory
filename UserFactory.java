
public class UserFactory extends MemberFactory {
	public UserFactory(MessageMediator mediator, String name) {
        super();
        mediator.createMember(this);
    }
	
	@Override
	public ChatMembers createMember(String name, MessageMediator messageMediator) {
		// TODO Auto-generated method stub
		return new User(name);
	}

}
