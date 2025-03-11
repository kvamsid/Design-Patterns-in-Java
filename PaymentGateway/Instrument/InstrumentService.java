package LowLevelDesign.vamsiPractise.PaymentGateway.Instrument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InstrumentService {
    static Map<Integer, List<Instrument>> userInstruments = new HashMap<Integer, List<Instrument>>();
    public abstract InstrumentDO addInstrument(InstrumentDO instrumentDO);
    public abstract List<InstrumentDO> getInstrumentByUserId(int userID);
}
