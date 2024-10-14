class ConcreteHandler2 implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Task2")) {
            System.out.println("Handled by Handler2");
        } else if (next != null) {
            System.out.println("Handler2 passing the request to next handler");
            next.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled");
        }
    }
}