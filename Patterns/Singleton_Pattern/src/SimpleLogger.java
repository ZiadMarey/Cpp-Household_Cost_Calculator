public enum SimpleLogger implements Loggers{

    FIRSTLOGGER;
    private SimpleLogger(){
    }

    public static SimpleLogger getInstance() {
        return FIRSTLOGGER;
    }

    @Override
    public void log(Loglevel severity, String message) {
        System.err.println(severity+message)   ;
    }
}
