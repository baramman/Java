package ch07;

public interface RemoteControl {

	// �߻�޼���
	public abstract void powerOn();	// abstract ��������
	public abstract void powerOff();
	
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
}