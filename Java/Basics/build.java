public class build 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);
        sb.setCharAt(6, 'U');
        sb.append(8);
        sb.insert(1, 10);
        sb.insert(5,true);
        sb.reverse();
        sb.deleteCharAt(6);
        sb.delete(5, 9);
        System.out.println(sb);
        String s = sb.toString();
        System.out.println(s);
    }
}