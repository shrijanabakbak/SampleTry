public class Trap_Water {
	
	public static void main (String[] args) {
		Trap_Water sc = new Trap_Water();
		int height[]= {4,0,6};
		int result=sc.trap(height);
		System.out.println("the max water that can be stored is "+ result);
		
	}
	public int trap(int[] height) {
		int ans=0;
		int h= height.length;
		
		
		int[]leftmax= new int[h];
		leftmax[0]= height[0];
		for(int i=1; i<h; i++) {
			leftmax[i]= Math.max(height[i],leftmax[i-1]);
			System.out.println(leftmax[i]);
		}
		
		int[]rightmax= new int[h];
		rightmax[h-1]= height[h-1];
		for(int i=h-2; i<=0;i--) {
			rightmax[i]=Math.max( height[i],rightmax[i+1]); 
			System.out.println(rightmax[i]);
		}
		
		
		for(int i=0; i<h;i++) {
			ans += (Math.min(leftmax[i], rightmax[i])- height[i]);
		}
		
		return ans; 
		
		
	}

}
