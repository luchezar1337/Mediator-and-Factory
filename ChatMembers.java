
public abstract class ChatMembers {
		protected MessageMediator mediator;
		protected String name;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public abstract void send(String msg,ChatMembers user1);

	    public abstract void receive(String msg);
}
