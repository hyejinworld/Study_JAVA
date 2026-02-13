package ex0212.board;


public class QaBoard extends Board {


	private boolean replyState;
	public QaBoard() {
		
	}
	public QaBoard(int no, String subject, String writer, String content,  boolean replyState) {
		super(no, subject, writer, content);
		
		this.replyState = replyState;
		// TODO Auto-generated constructor stub
		
	}
	public QaBoard(boolean replyState) {
		this.replyState = replyState;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString()); //super 추가 
		builder.append("QaBoard [replyState=");
		builder.append(replyState);
		builder.append("]");
		return builder.toString();
	}
	
	
}
