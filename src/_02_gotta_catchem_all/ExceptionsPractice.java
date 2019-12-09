package _02_gotta_catchem_all;

public class ExceptionsPractice {
public static void main(String[] args) {
	try {
        throw 10;
    } catch(int e) {
        System.out.println("Got the  Exception " + e);
    }
	
	//complile error will occur
}
}

