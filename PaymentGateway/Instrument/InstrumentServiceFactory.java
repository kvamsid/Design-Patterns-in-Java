package LowLevelDesign.vamsiPractise.PaymentGateway.Instrument;

public class InstrumentServiceFactory {
    public InstrumentService getInstrumentService(InstrumentType instrumentType) {
        return switch (instrumentType) {
            case BANK -> new BankService();
            case CARD -> new CardService();
        };
    }
}
