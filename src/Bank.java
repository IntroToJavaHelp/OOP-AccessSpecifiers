public class Bank
{
    //#region public

    /* public
     *
     * In java, when a method or property of a class or instance of a class
     * is public, it means that it can be accessed from any instance of the class
     * or if the method/property is static, directly from the class
     *
     * What should I make public?
     *      Any methods that you intend to call outside of your class should be made public.
     *      Variables can be public if you intend to read/write them outside your class,
     *      however you can use getters and setters which will be demonstrated in the
     *      section for the private keyword.
     *      public properties/methods should be things that you do not need to conceal,
     *      for example a user-id could be public whereas a password would not be.
     */

    public final int accountNumber = accountHolders;
    //#endregion

    //#region private

    /* private
     *
     * private methods/properties are only accessible within the class itself.
     * Classes that extend this class will not inherit any private variables.
     * Attempting to access a private method/prop of a class or instance of
     * said class will result in an error. Example:
     *      final Bank myBank = new Bank("joe", "abc");
     *      System.out.println(myBank.password); // Error
     * However, you can define "setter" and "getter" methods for private variables, which
     * allow you to set and get your private variables with these methods
     * Example:
     *      public class Bank
     *      {
     *          private String password = "abc123";
     *          public Bank() { }
     *          // here we change the value of ${password} inside the method
     *          // we can do this because we access the variable from inside the Bank class
     *          public void setPass(String newPass)
     *          {
     *              password = newPass;
     *          }
     *          // here we return the value of ${password}
     *          public String getPass()
     *          {
     *              return password;
     *          }
     *      }
     */
    private static int accountHolders = 1;
    private double balance = 0.0;
    private final String username;
    private String password;
    //#endregion

    //#region protected

    // protected methods/properties are private, except they are inherited.
    // we will revisit protected when we cover inheritance and polymorphism

    //#endregion

    public Bank(String username, String password)
    {
        accountHolders++;
        this.username = username;
        this.password = password;
    }

    /**
     *
     * Allows the user to change the bank account's password.
     *
     * @param oldPass old password
     * @param newPass new password
     * @throws Throwable oldPass must match current password
     */
    public void changePassword(String oldPass, String newPass) throws Throwable
    {
        if(!oldPass.equals(password)) {
            throw new Exception("Old password was incorrect; password was not changed");
        } else {
            password = newPass;
        }
    }
}