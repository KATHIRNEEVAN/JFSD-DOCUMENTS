package Assignments;

public class Books {
    String title;
    String author;
    int ISBN ;
    Books(String title,String author,int ISBN){
    	this.title = title;
    	this.author = author;
    	this.ISBN = ISBN;
    }
    void changeno(int ISBN) {
    	this.ISBN=ISBN;
    	System.out.println(this.ISBN);
    }
	public static void main(String[] args) {
		Books obj = new Books("Earth","Ramesh",12044);
		System.out.println(obj.title+" "+obj.author+" "+obj.ISBN);
		obj.changeno(12354);

	}

}
