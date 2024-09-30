public class base
{
    public static void main(String[] args) {
        int a = 33;
        String binString = "10101";
        
        // DECIMAL TO OTHER NUMBER SYSTEMS
        // Integer.toString(variable,to which base conversion)
        System.out.println(Integer.toString(a,2));
        System.out.println(Integer.toString(a,8));
        System.out.println(Integer.toString(a,16));

        // BINARY TO OTHER NUMBER SYSTEMS
        System.out.println(Integer.parseInt(binString,2));
        System.out.println(Integer.parseInt(binString,8));
        System.out.println(Integer.parseInt(binString,16));

    }
}