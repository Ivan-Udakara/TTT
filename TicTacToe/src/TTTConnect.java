import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TTTConnect {

    private String username = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/tictactoe";

    private Connection con;
    private Statement statement;
    private ResultSet rs;
    /*connection to the database*/

    TTTConnect() {
        try {
            con = DriverManager.getConnection(url, username, password);
            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println("OK");

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }

    void setStats(String winner,String looser ) {//pwon and pdefeat are usernames of players
         this.setName(winner);
         this.setName(looser);
         
         this.incField(winner, "Played");
         this.incField(looser, "Played");
         
         this.incField(winner, "Won");
         this.incField(looser, "Defeated");
         
    }

    boolean isUserAvailable(String name) {  // check the availability of user
        String userName = "";
        boolean avaiable = false;
        try {

            rs = statement.executeQuery("select UserName from userlog");

            while (rs.next() && !(userName.equals(name))) {

                userName = rs.getString("UserName");              
                if (userName.equals(name)) {
                    avaiable = true;
                }
            }
            if (avaiable) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " error");
            return false;
        }

    }

    /* get available value in database*/
    int getInt(String field, String name) {//get int value available field=column name key= user name
        int temp = -1;
        try {

            rs = statement.executeQuery("select * from stats where UserName='" + name + "'");

            
            rs.next();
            temp = rs.getInt(field);
            

        } catch (SQLException e) {
            System.out.println(e.getMessage() + " error");

        }
        return temp;
    }
    
    /*get user name from table*/

    Player[] getList() {
        Player list[]=new Player[500];
        Player p= new Player();
        try {

            rs = statement.executeQuery("select * from userlog");

            int i=0;
            while (rs.next()) {

                p.setName(rs.getString("UserName"));
                p.setPlayed(rs.getInt("played"));
                p.setWon(rs.getInt("won"));
                p.setDefeted(rs.getInt("defeted"));
    
    
                list[i]=p;
                i++;
               
            }
            
            return list;

        } catch (SQLException e) {
            System.out.println(e.getMessage() + " error");
            return null;
        }

    }
    /*add a user*/

    void setName(String value) {
        try {
            if (!isUserAvailable(value)) {
                statement.executeUpdate("INSERT INTO userlog(`UserName`) VALUES('" + value + "')");
            } 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    /* incrementing value in a field*/

    void incField(String name, String field) {
        try {

            statement.executeUpdate("UPDATE userlog\n"
                    + " SET " + field + " = " + field + "+1 \n"
                    + "WHERE UserName='" + name + "'");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
