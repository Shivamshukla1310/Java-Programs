class Object_use{
    int gear = 3;
    public static void main(String args[]){
        Object_use bicycle = new Object_use();
        System.out.println(bicycle.gear);
        bicycle.accelarate();
    }
    void accelarate(){
        System.out.println("Sports Bicycle");
    }
}