class Ex2 {
    String text;

    Ex2(String language){
        text = language;
        System.out.println(text);
    }

    public static void main(String[] args) {
        Ex2 e1 = new Ex2("Java");
        Ex2 e2 = new Ex2("Python");
        Ex2 e3 = new Ex2("C");
        Ex2 e4 = new Ex2("Kotlin");
    }
}
