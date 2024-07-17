package prtc2;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.SQLException;

public class Mysql1 {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/aem";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * FROM users";
            stmt = conn.prepareStatement(sql);
            System.out.println(conn+"  "+stmt);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // Process ResultSet data
                String data = rs.getString("email");
                System.out.println(data);
            }
            rs.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
