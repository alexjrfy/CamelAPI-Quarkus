package routes;


import domain.dto.Person;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersonRoute extends RouteBuilder {

    public static final String GET_PERSON = "direct:getPerson";

    @Value("${endPointGetPerson}")
    private String endPoint;
    @Override
    public void configure() throws Exception {

        from(GET_PERSON)
                .routeId("getPerson")
                .to("http://www.google.com")
                .log("${body}")
        ;
    }
}
