package ex0212.board;

import java.util.List;

//자유게시판

public class FreeBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
	System.out.println(super.getClass().getSimpleName()); //현재 클래스 이름을 가지고 와줌
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println(super.getClass().getSimpleName()+"UPDATE");
		
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println(super.getClass().getSimpleName());
		return new FreeBoard (20, "수업중", "미미", "재밌다");
	}
	
	@Override
	public int delete(int no) {
		System.out.println(super.getClass().getSimpleName()+"delect call");
		return 10;
	}

//	 @Override
//	public List<Board> selectAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
