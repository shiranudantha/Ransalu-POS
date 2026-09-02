package pos;


public class Session {

    private static int employeeId;
    private static String username;
    private static String fullName;
    private static String role;

    public static void start(int employeeId, String username, String fullName, String role) {
        Session.employeeId = employeeId;
        Session.username = username;
        Session.fullName = fullName;
        Session.role = role;
    }

    public static void clear() {
        employeeId = 0;
        username = null;
        fullName = null;
        role = null;
    }

    public static int getEmployeeId() {
        return employeeId;
    }

    public static String getUsername() {
        return username;
    }

    public static String getFullName() {
        return fullName;
    }

    public static String getRole() {
        return role;
    }
}
