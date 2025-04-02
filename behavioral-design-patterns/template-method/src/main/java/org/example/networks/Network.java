package org.example.networks;

/**
 * Base class of social network. That defines the template "post" method
 */
public abstract class Network {
    String username;
    String password;

    public Network() {
    }

    /**
     * Publish the data to whatever network.
     */
    public final boolean post(String message){
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.username, this.password)){
            // Send the post data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        } else {
            return false;
        }
    }

    abstract boolean logIn(String username, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
