package LowLevelDesign.vamsiPractise.PaymentGateway.Instrument;

public class CardInstrument extends Instrument {
    String cardNo;
    String cvv;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
