package ThreadHomeWork;
/*
 * Hello It is me 
 * What are you doing?
 * */
public class Run {

	public static void main(String[] args) {
		creatingThread t = new creatingThread();
		t.start();
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
