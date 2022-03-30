package homework;

public class Baseball {

	private int postNo;
	private String postName;
	private String postNae;
	private String postPer;

	public Baseball() {

	}

	public Baseball(int postNo, String postName, String postNae, String postPer) {
		super();
		this.postNo = postNo;
		this.postName = postName;
		this.postNae = postNae;
		this.postPer = postPer;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
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

	@Override
	public String toString() {
		return "Baseball 갤러리 [게시글 번호 =" + postNo //
				+ ", 제목 =" + postName //
				+ ", 내용 =" + postNae //
				+ ", 작성자 =" //
				+ postPer + "]";
	}

}
