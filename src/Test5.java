public class Test5 {
    public static void main(String[] args) {
        //Strings..........
        String name="vidhyanand     reddy";
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.length());
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.indexOf('a'));
        System.out.println(name.equals("vidhyanand reddy"));
        System.out.println(name.charAt(1));
        System.out.println(name.startsWith("vi"));
        System.out.println(name.replace('r','R'));
        System.out.println(name.substring(0,10));
        System.out.println(name.endsWith("dy"));
        System.out.println(name.codePointAt(2));
        System.out.println(name.concat(" CSE"));
        System.out.println(name.isEmpty());
        System.out.println(name.contains("vr"));
    }
}
