public class EncryptAndDecrypt {
    public static void main(String[] args) {
        char ch = 'A';
        ch = (char) (ch + 8);

        System.out.println(ch);
        ch = (char) (ch - 8);
        System.out.println(ch);
    }
}
