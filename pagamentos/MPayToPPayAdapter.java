public class MPayToPPayAdapter implements PPay {
    private MPay mPay;

    public MPayToPPayAdapter(MPay mPay) {
        this.mPay = mPay;
    }

    @Override
    public String getCustCardNo() {
        return mPay.getCreditCardNo();
    }

    @Override
    public String getCardOwnerName() {
        return mPay.getCustomerName();
    }

    @Override
    public String getCardExpMonthDate() {
        return mPay.getCardExpMonth() + "-" + mPay.getCardExpYear();
    }

    @Override
    public Integer getCVVNo() {
        return mPay.getCardCVVNo().intValue();
    }

    @Override
    public Double getTotalAmount() {
        return mPay.getAmount();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        mPay.setCreditCardNo(custCardNo);
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        mPay.setCustomerName(cardOwnerName);
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        String[] parts = cardExpMonthDate.split("-");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid date format");
        }

        String month = parts[0];
        String year = parts[1];
        mPay.setCardExpMonth(month);
        mPay.setCardExpYear(year);
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        mPay.setCardCVVNo(cVVNo.shortValue());
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        mPay.setAmount(totalAmount);
    }
    
}
