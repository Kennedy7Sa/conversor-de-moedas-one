import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoConvert {

    public Moeda conectStringtoJson(String  par, String amount)  {

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/cb1ffbcf12c4f607c4e50d09/"+par+"/"+amount);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            throw new RuntimeException("não consegui obter a paridade ");
        }
    }
}
