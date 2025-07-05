public class stringopeartions{
    public static void main(String[] args) {
        String s1="Object Oriented Programming-Java 5";
        System.out.println(s1);
        System.out.println("Length of string:"+s1.length());
        System.out.println("char at first position:"+s1.charAt(0));
        System.out.println("Character at last position:"+s1.charAt(s1.length()-1));
        System.out.println("First word of string:"+s1.substring(0,s1.indexOf(" ")));
    }
}