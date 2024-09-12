package assign5.org;

public class assig5que1 {

	
		// TODO Auto-generated method stub
		 static int instanceCount = 0;
		    
		   
		    public assig5que1() {
		        instanceCount++;
		    }

		  
		    public static int getInstanceCount() {
		        return instanceCount;
		    }

		    public static void main(String[] args) {
		        
		        assig5que1 obj1 = new assig5que1();
		        assig5que1 obj2 = new assig5que1();
		        assig5que1 obj3 = new assig5que1();

		        
		        System.out.println("Number of instances created: " + assig5que1.getInstanceCount());

	}

}
