
public class Bot extends ChatMembers {
	
	String name = "BOT";
	ChatMembers chatM;
	
	@Override
	public void send(String msg,ChatMembers chatMember) {
		System.out.println(this.name + " sends: " + msg);
        mediator.sendMessage(msg, this);
		chatM = chatMember;
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + " receives:" + msg);
		if(msg == "cat") {
			System.out.println("'cat' is forbiden word !!!");
		}
		ChatMessageMediator.RemoveHim(chatM);
		
	}

}
