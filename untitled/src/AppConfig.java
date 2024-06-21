public class AppConfig {
    // La única instancia de la clase
    private static AppConfig instance;

    // Propiedades de configuración
    private String serverUrl;
    private int port;


    private AppConfig() {

        serverUrl = "http://defaultserver.com";
        port = 8080;
    }

    // Método estático sincronizado para obtener la única instancia de la clase
    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    // Métodos para obtener y establecer las propiedades
    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


}
