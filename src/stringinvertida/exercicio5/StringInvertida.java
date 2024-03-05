package stringinvertida.exercicio5;

public class StringInvertida {
    public static void main(String[] args) {
        String s = "String invertida";
        String invertida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i);
        }
        System.out.println(invertida);
    }
}
