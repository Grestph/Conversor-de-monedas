import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

  public class ConsultaApi {

    public Moneda buscarConversion(String monedaOrigen, String monedaDestino) {

        String direccion = "https://v6.exchangerate-api.com/v6/5efbeee25c78cf16216504d6/pair/"
                + monedaOrigen + "/" + monedaDestino;

        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new Gson();

            Moneda moneda = gson.fromJson(json, Moneda.class);

            return moneda;

        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener la conversión.");
        }
    }
}