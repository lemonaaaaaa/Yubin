
public class BaseballGall {

	private int postNo; // 게시글번호
	private String postName; // 게시글제목
	private String postNae; // 게시글내용
	private String postPer; // 작성자
	private String postDate; // 작성일자

	public BaseballGall() {

	}

	public BaseballGall(int postNo, String postName, String postNae, //
			String postPer, String postDate) {
		super();
		this.postNo = postNo;
		this.postName = postName;
		this.postNae = postNae;
		this.postPer = postPer;
		this.postDate = postDate;

	}

	public int getPostNo() {
		return postNo;
	}

	public int setPostNo(int postNo) {
		return this.postNo = postNo;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getPostNae() {
		return postNae;
	}

	public void setPostNae(String postNae) {
		this.postNae = postNae;
	}

	public String getPostPer() {
		return postPer;
	}

	public void setPostPer(String postPer) {
		this.postPer = postPer;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return " Baseball [게시글 번호 ] " + postNo//
				+ " [ 게시글 제목 ] " + postName//
				+ " [ 작성자 ] " + postPer//
				+ " [ 작성일자 ] " + postDate//
		;}
	
		public String toString2() {
			return " Baseball [게시글 번호 ] " + postNo//
					+ " [ 게시글 제목 ]" + postName//
					+ " [ 내용 ] " + postNae//
					+ " [ 작성자 ] " + postPer//
					+ " [ 작성일자 ] " + postDate//
			;
		
		
	}

}
