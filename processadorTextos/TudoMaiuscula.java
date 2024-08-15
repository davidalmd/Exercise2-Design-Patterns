package processadorTextos;

public class TudoMaiuscula extends ProcessadorTextoTemplate {

    @Override
    public char[] converterCaracteres(char[] caracteres) {
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = Character.toUpperCase(caracteres[i]);
        }
        return caracteres;
    }
}
