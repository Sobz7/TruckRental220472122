package za.ac.cput.factory;

import za.ac.cput.domain.LoginDetail;
import za.ac.cput.util.Helper;

public class LoginDetailFactory {
    public static LoginDetail createLoginDetail(String username, String password)
    {
        if(Helper.isNullorEmpty(username) || Helper.isNullorEmpty(password))
        {
            return null;
        }

        LoginDetail ld = new LoginDetail.Builder().setUsername(username)
                .setPassword(password)
                .build();
        return ld;

    }

}
