package ex0212.board;

public class UploadBoard extends Board {
	private String fileName;
	
	public UploadBoard() {
		// TODO Auto-generated constructor stub
	}

	public UploadBoard(int no, String subject, String writer, String content, String fileName) {
		super(no, subject, writer, content);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UploadBoard [fileName=");
		builder.append(fileName);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
