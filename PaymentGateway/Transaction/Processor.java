package LowLevelDesign.vamsiPractise.PaymentGateway.Transaction;

import LowLevelDesign.vamsiPractise.PaymentGateway.Instrument.InstrumentDO;
import LowLevelDesign.vamsiPractise.PaymentGateway.Instrument.InstrumentService;

public class Processor {
    public void processPayment(InstrumentDO senderDO, InstrumentDO receiverDO){
        System.out.println("Processing Payment via Processor");
    }
}
