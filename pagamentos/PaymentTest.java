public class PaymentTest {
    public static void testPPay(PPay pp) {
        System.out.println(pp.getCardOwnerName());
        System.out.println(pp.getCustCardNo());
        System.out.println(pp.getCardExpMonthDate());
        System.out.println(pp.getCVVNo());
        System.out.println(pp.getTotalAmount());
    }

    public static void main(String[] args) {

        // Criando uma instância de MPay
        MPay mPay = new MPayImpl();
        mPay.setCreditCardNo("1234567896543210");
        mPay.setCustomerName("João Bosco");
        mPay.setCardExpMonth("12");
        mPay.setCardExpYear("2033");
        mPay.setCardCVVNo((short) 130);
        mPay.setAmount(1573.87);

        // Adaptando MPay para PPay
        PPay pp = new MPayToPPayAdapter(mPay);

        // Testando o PPay
        testPPay(pp);
    }
}
