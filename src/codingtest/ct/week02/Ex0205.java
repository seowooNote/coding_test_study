package codingtest.ct.week02;

import java.util.List;
import java.util.Vector;

public class Ex0205 {
	// List - Vector
	public static void main(String[] args) {
		
		Board board = new Board();
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setWriter("작성자1");
		
		List<Board> list = new Vector<>();
		list.add(board);
		list.add(new Board("제목2", "내용2", "작성자2")); // AllArgsConstructor 사용
		list.add(new Board("제목3", "내용3", "작성자3"));
		list.add(new Board("제목4", "내용4")); // RequiredArgsConstructor 사용
		
		System.out.println(list.toString()); // 해당 메모리 주소값이 출력
		for(int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getTitle() + ", " + b.getContent() + ", " + b.getWriter());
		}
		
	}

}

class Board {
	private String title;	// 제목
	private String content;	// 내용
	private String writer;	// 작성자
	
	// 기본 생성자 - NoArgsConstructor 생략가능
	public Board() {
		
	}
	
	// AllArgsConstructor
	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	// RequiredConstructor
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
		this.writer = "관리자";
	}
	
	// Getter & Setter / Alt + Shift + S
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}