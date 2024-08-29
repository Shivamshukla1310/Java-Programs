class Newprg{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        b = a++;
        System.out.println(b);
        b = ++a;
        System.out.println(b);
        System.out.println(a);
    }
}