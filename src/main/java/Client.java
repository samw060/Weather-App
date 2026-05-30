import javax.net.ssl.HttpsURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Client {
    /**
     * Creates the client to send and recieve the requests
     */
    private HttpClient client = HttpClient.newHttpClient();

    /**
     * The api key for openweathermap.org
     */
    private String apiKey = "fc6ba67fa7afd9770cc11af85e00dcaa";

    /**
     * Makes the url request we want to send in url, creates http request object with url.
     * Sets up the response object to receive from the server via the client for the request and
     * how we want to receive the data as a string in the body handler.
     * @param city is the city the user entered.
     */
    public void getCityWeather(String city){
        try {
            String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
