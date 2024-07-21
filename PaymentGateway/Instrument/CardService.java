package LowLevelDesign.vamsiPractise.PaymentGateway.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService extends InstrumentService {

    @Override
    public InstrumentDO addInstrument(InstrumentDO instrument){
        CardInstrument cardInstrument = new CardInstrument();
        cardInstrument.setInstrumentId((int) new Random().nextInt(100-10)+10);
        cardInstrument.setCardNo(instrument.getCardNumber());
        cardInstrument.setCvv(instrument.getCvv());
        cardInstrument.setUserId(instrument.getUserId());
        cardInstrument.setInstrumentType(InstrumentType.CARD);
        List<Instrument> instrumentList = userInstruments.get(cardInstrument.getUserId());
        if(instrumentList == null){
            instrumentList = new ArrayList<>();
        }
        instrumentList.add(cardInstrument);
        userInstruments.put(cardInstrument.getUserId(), instrumentList);
        return convertInstrumentDOToInstrument(cardInstrument);
    }

    @Override
    public List<InstrumentDO> getInstrumentByUserId(int userId){
        List<Instrument> instrumentList = userInstruments.get(userId);
        List<InstrumentDO> instrumentDOList = new ArrayList<>();
        for(Instrument instrument : instrumentList){
            if(instrument.getInstrumentType() == InstrumentType.CARD){
                instrumentDOList.add(convertInstrumentDOToInstrument((CardInstrument) instrument));
            }
        }
        return instrumentDOList;
    }

    private InstrumentDO convertInstrumentDOToInstrument(CardInstrument cardInstrument) {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.setInstrumentId(cardInstrument.getInstrumentId());
        instrumentDO.setCardNumber(cardInstrument.getCardNo());
        instrumentDO.setCvv(cardInstrument.getCvv());
        instrumentDO.setUserId(cardInstrument.getUserId());
        instrumentDO.setInstrumentType(cardInstrument.getInstrumentType());
        return instrumentDO;
    }
}
