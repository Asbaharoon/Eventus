package models;

/**
 * This class holds the session of the current logged in user.
 * Can be used to check if user is logged in.
 *
 * @author Salah Al-Dhaferi
 */
public class UserSession {
    /**
     * Variables
     */
    private static int idOfLoggedInUser = -1;
    private static String dateAndTimeOfLogin;
    private static String typeOfUser;


    /**
     * Logout from the current session returning the type of user to (Guest)
     *
     * @author Salah Al-Dhaferi
     */
    public static void logout() {
        idOfLoggedInUser = -1;
        dateAndTimeOfLogin = null;
        typeOfUser = null;
    }

    /**
     * Login the current user and establish the session
     *
     * @author Salah Al-Dhaferi
     *
     * @param id The id of the user who has just logged in
     * @param dateOfLogin the date and time of the login
     * @param type type of the logged in user
     */
    public static void login(int id,String dateOfLogin, String type){
        idOfLoggedInUser = id;
        dateAndTimeOfLogin  = dateOfLogin;
        typeOfUser = type;

    }

    /**
     * Checks if the user is logged in
     *
     * @return true if user is logged in, false if not.
     *
     * @author Salah Al-Dhaferi
     */
    public static boolean userIsLoggedIn() {
        return idOfLoggedInUser != -1;
    }

    /**
     * Setters and getters for all variables
     *
     * @author Salah Al-Dhaferi
     */
    //region Setters and getters
    public static int getIdOfLoggedInUser() {
        return idOfLoggedInUser;
    }

    public static void setIdOfLoggedInUser(int idOfLoggedInUser) {
        UserSession.idOfLoggedInUser = idOfLoggedInUser;
    }

    public static String getDateAndTimeOfLogin() {
        return dateAndTimeOfLogin;
    }

    public static void setDateAndTimeOfLogin(String dateAndTimeOfLogin) {
        UserSession.dateAndTimeOfLogin = dateAndTimeOfLogin;
    }

    public static String getTypeOfUser() {
        return typeOfUser;
    }

    public static void setTypeOfUser(String typeOfUser) {
        UserSession.typeOfUser = typeOfUser;
    }

    //endregion
}
