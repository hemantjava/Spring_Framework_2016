
public class Author {
private int authorId;
private String authorName;
public Author(int authorId, String authorName) {
	this.authorId = authorId;
	this.authorName = authorName;
}
@Override
public String toString() {
	return "Author [authorId=" + authorId + ", AuthorName=" + authorName + "]";
}
public int getAuthorId() {
	return authorId;
}

public String getAuthorName() {
	return authorName;
}
}
