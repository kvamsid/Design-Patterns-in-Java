package LowLevelDesign.vamsiPractise.PaymentGateway.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankService extends InstrumentService {

    @Override
    public InstrumentDO addInstrument(InstrumentDO instrument) {
        BankInstrument bankInstrument = new BankInstrument();
        bankInstrument.setInstrumentId((int) new Random().nextInt(100-10)+10);
        bankInstrument.setBankAccount(instrument.getBankAccountNumber());
        bankInstrument.setIFSCNo(instrument.getIfsc());
        bankInstrument.setUserId(instrument.getUserId());
        bankInstrument.setInstrumentType(InstrumentType.BANK);
        List<Instrument> instrumentList = userInstruments.get(instrument.userId);
        if(instrumentList == null) {
            instrumentList = new ArrayList<Instrument>();
        }
        instrumentList.add(bankInstrument);
        userInstruments.put(instrument.userId, instrumentList);
        return convertInstrumentDOToInstrument(bankInstrument);
    }

    @Override
    public List<InstrumentDO> getInstrumentByUserId(int userId) {
        List<Instrument> instrumentList = userInstruments.get(userId);
        List<InstrumentDO> result = new ArrayList<>();
        for(Instrument instrument : instrumentList) {
            if(instrument.getInstrumentType() == InstrumentType.BANK) {
                result.add(convertInstrumentDOToInstrument((BankInstrument) instrument));
            }
        }
        return result;
    }

    private InstrumentDO convertInstrumentDOToInstrument(BankInstrument bankInstrument) {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.setInstrumentId(bankInstrument.getInstrumentId());
        instrumentDO.setBankAccountNumber(bankInstrument.getBankAccount());
        instrumentDO.setIfsc(bankInstrument.getIFSCNo());
        instrumentDO.setUserId(bankInstrument.getUserId());
        instrumentDO.setInstrumentType(bankInstrument.getInstrumentType());
        return instrumentDO;
    }
}
