package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._02_after.order;
public class Client {
    private RequestHandler requestHandler;
    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }
    public void doWork(){
        Request request = new Request("요청");
        requestHandler.handle(request);
    }
    public static void main(String[] args) {
        Client client = new Client(RequestHandlerBuilder.builder()
                .addHandler(new AuthRequestHandler())
                .addHandler(new LoggingRequestHandler())
                .addHandler(new PrintRequestHandler()).build());
        client.doWork();
    }
}
