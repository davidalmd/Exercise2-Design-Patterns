public class configurationTest {
    public static void main(String[] args) {
        GameConfiguration gameConfig = GameConfiguration.getInstance();

        // Imprimindo todos os dados do arquivo de configuração como pede na questão
        gameConfig.printAll();

        // Acessando individualmente alguns atributos do arquivo de configuração como pede na questão
        System.out.println("AppId: " + gameConfig.getAppId());
        System.out.println("Language: " + gameConfig.getLanguage());
        System.out.println("Signature: " + gameConfig.getSignature());

    }
}
