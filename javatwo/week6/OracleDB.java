package week6;

public class OracleDB implements DataAccessObject{
	public void select() {
		System.out.println("OracleDB���� �˻�");
	}
	public void insert() {
		System.out.println("OracleDB���� ����");
	}
	public void update() {
		System.out.println("OracleDB���� ����");
	}
	public void delete() {
		System.out.println("OracleDB���� ����");
	}
}

class MySqlDB implements DataAccessObject{
	public void select() {
		System.out.println("MySqlDB���� �˻�");
	}
	public void insert() {
		System.out.println("MySqlDB���� ����");
	}
	public void update() {
		System.out.println("MySqlDB���� ����");
	}
	public void delete() {
		System.out.println("MySqlDB���� ����");
	}
}
