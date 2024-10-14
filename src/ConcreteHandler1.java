class ConcreteHandler1 implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Task1")) {
            System.out.println("Handled by Handler1");
        } else if (next != null) {
            System.out.println("Handler1 passing the request to next handler");
            next.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled");
        }
    }
}