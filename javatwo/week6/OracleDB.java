package week6;

public class OracleDB implements DataAccessObject{
	public void select() {
		System.out.println("OracleDB에서 검색");
	}
	public void insert() {
		System.out.println("OracleDB에서 삽입");
	}
	public void update() {
		System.out.println("OracleDB에서 수정");
	}
	public void delete() {
		System.out.println("OracleDB에서 삭제");
	}
}

class MySqlDB implements DataAccessObject{
	public void select() {
		System.out.println("MySqlDB에서 검색");
	}
	public void insert() {
		System.out.println("MySqlDB에서 삽입");
	}
	public void update() {
		System.out.println("MySqlDB에서 수정");
	}
	public void delete() {
		System.out.println("MySqlDB에서 삭제");
	}
}
