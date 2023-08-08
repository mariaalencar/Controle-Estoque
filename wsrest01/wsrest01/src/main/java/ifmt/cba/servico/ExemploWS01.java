package ifmt.cba.servico;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("exemplo01")
public class ExemploWS01 {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTexto(){
        return "Exemplo01 JAX-RS!";
    }
}
