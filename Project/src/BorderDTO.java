import java.util.Date;

public class BorderDTO {
//	private String num;
	private String title;
	private String content;
	private String uid;
	private String tdate;
	private int count;
//	public String getNum() {
//		return num;
//	}
//	public void setNum(String num) {
//		this.num = num;
//	}
	public String getContent() {
		return content;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}