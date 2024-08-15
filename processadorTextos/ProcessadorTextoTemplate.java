package processadorTextos;

public abstract class ProcessadorTextoTemplate {

    public final String processarTexto(String texto) {
        char[] caracteres = extrairCaracteres(texto);
        char[] caracteresConvertidos = converterCaracteres(caracteres);
        String resultado = juntarCaracteres(caracteresConvertidos);
        return resultado;
    }

    public static char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }

    public abstract char[] converterCaracteres(char[] caracteres);

    public static String juntarCaracteres(char[] caracteres) {
        return new String(caracteres);
    }

}
