public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        for(int i = 0; i < languages.length; i++) {
            System.out.println(languages[i]);
        }
        int n = (int) (Math.random() * 1000000);
        System.out.println(n);
        n = n * 3;
        System.out.println(n);
        n = n + (byte)10101;
        System.out.println(n);
        n = n + 0xFF;
        System.out.println(n);
        n = n * 6;
        System.out.println(n);
        while (n > 9) {
            int suma = 0;
            while (n != 0) {
                suma = suma + n % 10;
                n = n / 10;
            }
            n = suma;
        }
        System.out.println(n);
        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);
    }
}