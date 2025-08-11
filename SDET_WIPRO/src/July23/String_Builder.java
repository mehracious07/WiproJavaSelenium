package July23;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
System.out.println(sb.append(" Good Morning"));
System.out.println(sb.charAt(2));
System.out.println(sb.indexOf("M"));
System.out.println(sb.replace(11,18,"Night"));
System.out.println(sb.delete(11,16));
System.out.println(sb.insert(11,"Morning"));
System.out.println(sb.length());
System.out.println(sb.reverse());

	}

}
