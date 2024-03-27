package Challenge;

//Design a Course class.
//Instance variables: courseName, enrolledStudents.
//Static variable: maxCapacity, the maximum number of students for any course.
//Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
//Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses.
 class Course{  
	 
	 String courseName;
	 int enrollments;
	 
	 
	 static int maxCapacity = 100;
	 
	 
	 Course(String courseName){
		 this.courseName = courseName;
		 this.enrollments = 0;
		 this.ennrollecStudent = new String[maxCapacity];
	 }
	 
	 String []  ennrollecStudent = new String[maxCapacity];
	 static void setMaxCapacity(int maxCapacity) {
		 Course.maxCapacity = maxCapacity;
	 }
	 
	 void enrollStudent(String studentName) {
	        if (enrollments < maxCapacity) {
	        	ennrollecStudent[enrollments] = studentName;
	            enrollments++;
	            System.out.println(studentName + " enrolled in the course: " + courseName);
	        } else {
	            System.out.println("Enrollment failed: Course capacity reached.");
	        }
	 }
 }




class Book{ // Create a Book class for a library system.
   // Instance variables: title, author, isbn.
   // Static variable: totalBooks, a counter for the total number of book instances.
    //Instance methods: borrowBook(), returnBook().
    //Static method: getTotalBooks(), to get the total number of books in the library.
	
	private String title;
	
	private String author;
	
	private int isbn;
	
	private static int totalbook = 0;

	public Book(String string, String author, int isbn) {
		this.title = string;
		this.author = author;
		this.isbn = isbn;
		totalbook++;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


			public void borrowBook() {
		        // Implement borrowBook method logic here
		        System.out.println("Book titled '" + title + "' has been borrowed.");
		    }

		    // Instance method to return a book
		    public void returnBook() {
		        // Implement returnBook method logic here
		        System.out.println("Book titled '" + title + "' has been returned.");
		    }

		    public static int getTotalBooks() {
		        return totalbook;
		    }
	
}

public class Challenge_51_52 {

	public static void main(String[] args) {
		
		Book b1 = new Book("Tittle1","Author1",123);
		Book b2 = new Book("Tittle2","Author2",324);
		System.out.println("Total books: " + Book.getTotalBooks());
		b1.borrowBook();
		b1.returnBook();
		
		
		System.out.println();
        // Create a Course object
        Course mathCourse = new Course("Mathematics");

        // Set the maximum capacity
        Course.setMaxCapacity(50);

        // Enroll students
        mathCourse.enrollStudent("Alice");
        mathCourse.enrollStudent("Bob");
        mathCourse.enrollStudent("Charlie");

        
        for (int i = 0; i < 5; i++) {
            mathCourse.enrollStudent("Student" + i);
        }

	}

}
