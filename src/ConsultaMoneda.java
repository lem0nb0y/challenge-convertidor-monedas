import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Monedas buscarMonedas;

    public Monedas buscarMonedas(String _monedaBase, String _monedaObjetivo){
        URI direccion = URI.create(
        "https://v6.exchangerate-api.com/v6/c9a677afcc40d6cc94d25787/pair/"+_monedaBase+"/"+_monedaObjetivo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }
        catch (Exception e) {
            throw new RuntimeException("No se pudo encontrar la Moneda. Intente nuevamente");
        }
    }
}
