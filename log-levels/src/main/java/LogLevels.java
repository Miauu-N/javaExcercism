public class LogLevels {
    
    public static String message(String logLine) {
        String[] splited = logLine.split(":");
        return splited[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] splited =  logLine.split("]");
        return splited[0].substring(1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")" ;
    }
}
