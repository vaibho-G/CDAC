package assign5.org;

class abc{
	private String log;
    private static  abc logRef;
    private abc(String log){
        this.log = log;
    }
    
    
     static abc getInstance(String log){
        if (logRef == null){
            logRef = new abc(log);
        }else{
            System.out.println("Already Exists");
        }
        return abc.logRef;
    }
     

    String getLog(){
       return this.log;
    }
    void clearLog(){
        this.log = "";
    }
}

public class assign5que2 {

	public static void main(String[] args) {

		abc logger1 = abc.getInstance("abcd");
		
        System.out.println(logger1.getLog());

        logger1.clearLog();
        abc l2 = abc.getInstance("def");
        System.out.println(l2.getLog());
	}

}
