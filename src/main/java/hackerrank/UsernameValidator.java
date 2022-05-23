package hackerrank;

import java.util.regex.Pattern;

/**
 * The username consists of  to  characters inclusive.
 * If the username consists of less than  or greater than  characters, then it is an invalid username.
 * The username can only contain alphanumeric characters and underscores (_).
 * Alphanumeric characters describe the character set consisting of lowercase characters ,
 * uppercase characters , and digits .
 * The first character of the username must be an alphabetic character,
 * i.e., either lowercase character  or uppercase character .
 */
/*
  ^[a-zA-Z0-9]      # start with an alphanumeric character
  (                 # start of (group 1)
    [._-](?![._-])  # follow by a dot, hyphen, or underscore, negative lookahead to
                    # ensures dot, hyphen, and underscore does not appear consecutively
    |               # or
    [a-zA-Z0-9]     # an alphanumeric character
  )                 # end of (group 1)
  {3,18}            # ensures the length of (group 1) between 3 and 18
  [a-zA-Z0-9]$      # end with an alphanumeric character

                    # {3,18} plus the first and last alphanumeric characters,
                    # total length became {5,20}
 */
public class UsernameValidator {

    public static void main(String[] args) {

        String username = "Samantha_21?";

        String regex = "^[a-zA-Z]([_](?![_])|[a-zA-Z0-9]){7,29}";

        System.out.println(username.matches(regex));

    }
}
