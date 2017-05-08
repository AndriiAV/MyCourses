package site;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Profile {
    private String name;
    private String phoneNumber;
    private String email;

    public Profile(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public static boolean testPhoneNumber (String phoneNumber){
        Pattern p = Pattern.compile("^\\+?+[0-9_()-]{5,20}$");
        /*
        ^ - початок рядка, який перевіряється
        $ - кінець рядка, який перевіряється
        \\+? - екранований знак "+" є необов'язковим
        0-9_()- - набір доступних символів
        {5,20} - може бути від 5 до 20 символів
        */
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }

    public static boolean testEmail (String email){
        Pattern p = Pattern.compile(".+\\@.+\\..+");
        Matcher m = p.matcher(email);
        return m.matches();
    }
}
