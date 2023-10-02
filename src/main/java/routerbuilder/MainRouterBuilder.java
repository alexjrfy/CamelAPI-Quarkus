package routerbuilder;
import jakarta.ws.rs.core.MediaType;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import routes.HelloRoute;

public class MainRouterBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration()
                .apiContextPath("/swagger")
                .apiContextRouteId("swagger")
                .contextPath("/api")
                .apiProperty("host","")
                .apiProperty("port", "8080")
                .bindingMode(RestBindingMode.json)
                .dataFormatProperty("prettyPrint", "true")
                .enableCORS(true)
                .apiProperty("api.title", "Minha API")
                .apiProperty("api.version", "1.0")
                .apiProperty("api.description", "Descrição da Minha API")
                .apiProperty("api.contact.name", "Seu Nome")
                .apiProperty("api.contact.email", "seu@email.com")
                .apiProperty("api.contact.url", "https://www.seusite.com");
        ;

        rest("hello")
                .get()
                .description("Desc")
                .routeId("HelloGet")
                .produces(MediaType.APPLICATION_JSON)
                .to(HelloRoute.HELLO)
        ;
    }
}
