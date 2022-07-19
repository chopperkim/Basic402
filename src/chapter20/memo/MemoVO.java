package chapter20.memo;

import java.sql.Date;

// VO(Value Object)
// DTO(Data Transfer Object)
// Model
// Item
public class MemoVO {
	private int id;
	private String title;
	private String contents;
	private Date registerDate;
	private Date modifyDate;
	public MemoVO() {
	}
	
	public MemoVO(int id, String title, String contents) {
		this.id = id;
		this.title = title;
		this.contents = contents;
	}

	public MemoVO(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}

	public MemoVO(int id, String title, String contents, Date registerDate, Date modifyDate) {
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.registerDate = registerDate;
		this.modifyDate = modifyDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%s\n", id, title,
				contents, registerDate, modifyDate);
	}
	
}





