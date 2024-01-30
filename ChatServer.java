import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    ArrayList<String> messages = new ArrayList<String>();
    ArrayList<String> users = new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            if (!messages.isEmpty()) {
                return toString(users,messages);
            } else {
                return "No messages yet";
            }
        } else if (url.getPath().contains("/add-message")) {
            String query = url.getQuery();
            String[] parameters = query.split("&");
            String message = "";
            String user = "";

            for (String parameter : parameters) {
                String[] keyValue = parameter.split("=");
                if (keyValue.length == 2) {
                    if (keyValue[0].equals("s")) {
                        message = keyValue[1].replace("+", " "); // replace '+' to space for the message
                    } else if (keyValue[0].equals("user")) {
                        user = keyValue[1];
                    }
                }
                messages.add(message);
                users.add(user);

            }
            return toString(users,messages);
        } else {
            return "404 Not Found!";
        }
    }

    public static String toString(ArrayList<String> l1, ArrayList<String> l2) {
        String result = "" ;
        for (int i = 0; i < l1.size(); i++) {
            result += l1.get(i) + ": " + l2.get(i) + "\n";
        }
        return result;
    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
