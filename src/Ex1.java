class Ex1 {
    void text(){
        int number = 12345;
        System.out.println(number);
    }
    void text(int y, String a){
        System.out.println(y+ " and " +a);
    }
    static void text(String b){
        System.out.println(b);
    }
    static int text(int z){
        z = 389;
        return z;
    }

    public static void main(String[] args) {
        Ex1 e = new Ex1();
        e.text();
        e.text(123, "abc");
        text("54abcd");
        System.out.println(text(2));
    }
}
