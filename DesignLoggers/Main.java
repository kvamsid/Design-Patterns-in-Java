package LowLevelDesign.vamsiPractise.DesignLoggers;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new ErrorLogProcessor(new DebugLogProcessor(new InfoLogProcessor(null)));

        logger.log(1, "Logger-1");
        logger.log(3, "Logger-2");
        logger.log(3, "Logger-3");
    }
}
