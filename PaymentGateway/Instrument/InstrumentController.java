package LowLevelDesign.vamsiPractise.PaymentGateway.Instrument;

import java.util.List;

public class InstrumentController {
    InstrumentServiceFactory instrumentServiceFactory;

    public InstrumentController() {
        this.instrumentServiceFactory = new InstrumentServiceFactory();
    }

    public InstrumentDO addInstrument(InstrumentDO instrument) {
        InstrumentService instrumentService = instrumentServiceFactory.getInstrumentService(instrument.getInstrumentType());
        return instrumentService.addInstrument(instrument);
    }

    public List<InstrumentDO> getAllInstruments(int userId) {
        InstrumentService bankInstrumentService = instrumentServiceFactory.getInstrumentService(InstrumentType.BANK);
        InstrumentService cardInstrumentService = instrumentServiceFactory.getInstrumentService(InstrumentType.CARD);
        List<InstrumentDO> result = bankInstrumentService.getInstrumentByUserId(userId);
        result.addAll(cardInstrumentService.getInstrumentByUserId(userId));
        return result;
    }

    public InstrumentDO getInstrumentByID(int userId, int instrumentId) {
        List<InstrumentDO> allInstruments = getAllInstruments(userId);
        for(InstrumentDO instrument: allInstruments) {
            if(instrument.getInstrumentId() == instrumentId) {
                return instrument;
            }
        }
        return null;
    }
}
