package ifmt.cba.servico;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("exemplo02")
public class ExemploWS02 {
    @GET
    @Produces
    public String getTexto(){
        JsonObject json = Json.createObjectBuilder()
            .add("Mensagem1", "Exemplo02")
            .add("Mensagem2", "JAX-RS").build();
        return json.toString();      
    }
}
