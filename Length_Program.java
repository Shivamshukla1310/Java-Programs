// To Count The Given String for its Length

class Length_Program
{
    public static void main(String args[])
    {
        String s1 = "Sunstone ";
        String s2 = " ADYPU";
        int len = s1.length();
        String concati = s1.concat(s2);
        System.out.println(concati);
        String trim = concati.trim();
        System.out.println(len);
        System.out.println(trim);
    }
}