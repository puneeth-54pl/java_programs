
class Author{

    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        return ("Author[name=" + this.name + ", email=" + this.email + ", gender=" + this.gender + "]");
    }

}

class AuthorMain {

    public static void main(String args[]) {
        Author a1 = new Author("robert", "author@book.com", 'm');
        System.out.println("Author name:" + a1.getName());
        System.out.println("Author email:" + a1.getEmail());
        System.out.println("Author gender:" + a1.getGender());
        a1.SetEmail("author@gmail.com");
        System.out.println("Author new email:" + a1.getEmail());
        System.out.println("Author details:" + a1);
    }
}
