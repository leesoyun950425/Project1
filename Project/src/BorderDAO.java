
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BorderDAO {
	String url = "jdbc:mysql://localhost:3306/clothes";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insert(BorderDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "insert into border values(null,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getUid());
			ps.setString(4, dto.getTdate());
			ps.setInt(5, dto.getCount());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public BorderDTO select(Object inputId) {
		BorderDTO dto = new BorderDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from border where uid = ?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, inputId);
			rs = ps.executeQuery();
			if(rs.next()) {
				String title = rs.getString(2);
				String content = rs.getString(3);
				String uid = rs.getString(4);
				String tdate = rs.getString(5);
				int count = rs.getInt(6);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setUid(uid);
				dto.setTdate(tdate);;
				dto.setCount(count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	public BorderDTO select2(Object inputId) {
		BorderDTO dto = new BorderDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from border where title = ?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, inputId);
			rs = ps.executeQuery();
			if(rs.next()) {
				String title = rs.getString(2);
				String content = rs.getString(3);
				String uid = rs.getString(4);
				String tdate = rs.getString(5);
				int count = rs.getInt(6);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setUid(uid);
				dto.setTdate(tdate);;
				dto.setCount(count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	public BorderDTO select3(Object inputId) {
		BorderDTO dto = new BorderDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from border where date = ?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, inputId);
			rs = ps.executeQuery();
			if(rs.next()) {
				String title = rs.getString(2);
				String content = rs.getString(3);
				String uid = rs.getString(4);
				String tdate = rs.getString(5);
				int count = rs.getInt(6);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setUid(uid);
				dto.setTdate(tdate);;
				dto.setCount(count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		BorderDTO dto = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from border ";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				dto = new BorderDTO();
				String title = rs.getString(2);
				String uid = rs.getString(4);
				String tdate = rs.getString(5);
				int count = rs.getInt(6);
				dto.setTitle(title);
				dto.setUid(uid);
				dto.setTdate(tdate);
				dto.setCount(count);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public void update(BorderDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "update border set content =? where uid =?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getContent());
			ps.setString(2, dto.getUid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}public int updatecount(int count) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "update border set count =?";
			ps = con.prepareStatement(sql);
			ps.setInt(1,count);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}return count;
	}
	public void delete(BorderDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "delete from border where uid = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getUid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}