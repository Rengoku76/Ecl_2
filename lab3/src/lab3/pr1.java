package lab3;
/**
 * ����� ���������� - ������ ����� ��� �������� ����������
 * @author ����� �.�.
 */
public class pr1 {
	/** ���� ��� �������� �������� ����� ���������� */
	private String firm;
	/**���� ��� �������� ������������ �������� ����������*/
	private int maxSpeed;
	/**
	 * 
	 * @param firma - �������� ����� ���������� */
	public void setFirm(String firma) {
	firm=firma;
	}
	/**
	 * ������������� �������� ���� (@link Auto#maxSpeed)
	 * @param speed - �������� - ������������ �������� ���������� */
	public void setMaxSpeed(int speed) {
	maxSpeed = speed;
	}
	/**
	 * ���������� �������� ���� (@link Auto#firm)
	 * @return ����� �������� ������������ �������� ���������� */
	public int getMaxSpeed() {
	return maxSpeed;
	}
	/** 
	 * ���������� �������� ���� (@link Auto#firm)
	 * @return ������ � ��������� ����� ���������� */
	public String getFirm() {
	return firm;
	}
	/**
	 * ������� ���������� � ������ "��� ��������" � ������������ ��������� ������ 0*/
	public void Auto() {
		firm= "��� ��������";
		maxSpeed = 0;
	}
	/**
	 * ������� ���������� � ��������� ���������� ����� � ������������ ��������
	 * @param firma - �������� ����� ����������
	 * @param speed - �������� ������������ �������� ����������*/
	public void Auto(String firma, int speed) {
		firm = firma;
		maxSpeed=speed;
	}
}
