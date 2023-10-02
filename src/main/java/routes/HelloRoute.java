package routes;

import org.apache.camel.builder.RouteBuilder;

public class HelloRoute extends RouteBuilder {

    public static final String HELLO = "direct:hello";
    @Override
    public void configure() throws Exception {
        from("direct:hello")
                .setBody().simple("{\"message\": \"Hello, World!\"}")
                .log("Response JSON: ${body}");
    }
}
