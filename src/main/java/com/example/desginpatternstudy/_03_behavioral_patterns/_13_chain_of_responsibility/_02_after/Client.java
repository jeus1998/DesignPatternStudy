package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._02_after;

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
        RequestHandler chain =
                new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
