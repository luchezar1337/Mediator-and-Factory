
public class User extends ChatMembers {
	


	@Override
	public void send(String msg,ChatMembers chatMember) {
		System.out.println(this.name + " sends: " + msg);
        mediator.sendMessage(msg, this);
		
		if(msg == "addBot") {
			ChatMembers bot = new Bot();
		}
	}

	@Override
	public void receive(String msg) {
		 System.out.println(this.name + " receives:" + msg);
	}

	public User(String name) {
		super();
		this.name = name;
	}

}
