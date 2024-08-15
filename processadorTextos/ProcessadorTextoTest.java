package processadorTextos;

public class ProcessadorTextoTest {
    public static void main(String[] args) {

        String letraCamisa10 = "Se uM DiA Eu dIsSeR.\n" +
                                "qUe nÃo tE AmO, é qUe eU Te aMo\n" +
                                "aInDa mAiS, pOdE AcReDiTaR\n" +
                                "Se uM DiA Eu dIsSeR.\n" +
                                "qUe nÃo tE QuErO, é qUe eU Te qUeRo\n" +
                                "o dObRo oU MaIs, TeNtA ImAgInAr\n" +
                                "nÃo sEi mEnTiR, mEuS OlHoS DiZeM MaIs qUe mInHa bOcA\n" +
                                "Eu vEjO QuE NãO TeM SaÍdA, eSsE TeU JeItO MeIo lOuCa\n" +
                                "mE FaZ FeLiZ, aMoR QuE VaI DuRaR PrA ToDa vIdA\n" +
                                "Eu nÃo mE SePaRo dE VoCê mUlHeR\n" +
                                "NeM Se a GlObElEzA uM DiA Me qUiSeR\n" +
                                "Se nA MeGa-sEnA Eu vEnCeR\n" +
                                "FiCo cOm vOcÊ, fIcO CoM VoCê\n" +
                                "sE No bArCeLoNa eU FoR CaMiSa 10\n" +
                                "Me cObRiR De oUrO Da cAbEçA AoS PéS\n" +
                                "MeSmO AsSiM Se iSsO AcOnTeCeR,\n" +
                                "fIcO CoM VoCê, FiCo cOm vOcÊ\n" +
                                "Se uM DiA Eu dIsSeR.\n" +
                                "qUe nÃo tE AmO, é qUe eU Te aMo\n" +
                                "aInDa mAiS, pOdE AcReDiTaR\n" +
                                "Se uM DiA Eu dIsSeR.\n" +
                                "qUe nÃo tE QuErO, é qUe eU Te qUeRo\n" +
                                "o dObRo oU MaIs, TeNtA ImAgInAr\n" +
                                "nÃo sEi mEnTiR, mEuS OlHoS DiZeM MaIs qUe mInHa bOcA\n" +
                                "Eu vEjO QuE NãO TeM SaÍdA, eSsE TeU JeItO MeIo lOuCa\n" +
                                "mE FaZ FeLiZ, aMoR QuE VaI DuRaR PrA ToDa vIdA\n" +
                                "Eu nÃo mE SePaRo dE VoCê mUlHeR\n" +
                                "NeM Se a GlObElEzA uM DiA Me qUiSeR\n" +
                                "Se nA MeGa-sEnA Eu vEnCeR\n" +
                                "FiCo cOm vOcÊ, fIcO CoM VoCê\n" +
                                "sE No bArCeLoNa eU FoR CaMiSa 10\n" +
                                "Me cObRiR De oUrO Da cAbEçA AoS PéS\n" +
                                "MeSmO AsSiM Se iSsO AcOnTeCeR,\n" +
                                "fIcO CoM VoCê, FiCo cOm vOcÊ";

        ProcessadorTextoTemplate processador = new TudoMinuscula();
        String resultado = processador.processarTexto(letraCamisa10);
        System.out.println(resultado + "\n\n");
        
        processador = new TudoMaiuscula();
        resultado = processador.processarTexto(letraCamisa10);
        System.out.println(resultado);
    }
}
