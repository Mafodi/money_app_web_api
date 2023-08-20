package platforms.api.apiClasses;

import java.io.*;

public class AuthenticationTokenManager {
    private String tokenFileLocation = "src/test/feature/api/TokenStore/api.security.token.txt";

    public void saveAuthToken(String tokenFromGetSecurityToken) {
        try {
            FileOutputStream fileOS = new FileOutputStream(tokenFileLocation);
            fileOS.write(tokenFromGetSecurityToken.getBytes());
            fileOS.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
