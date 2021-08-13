public class Book {
   private String msg;
   private int num;
   private Author author;

public void setAuthor(Author author) {
	this.author = author;
}

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

@Override
public String toString() {
	return "Book [msg=" + msg + ", num=" + num + ", author=" + author + "]";
}

}
