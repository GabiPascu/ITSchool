package session11.config_example;


public class ApiService implements Config {

    void fetchData() {
        System.out.println("Fetching data from:" + API_ENDPOINT);
    }
}
