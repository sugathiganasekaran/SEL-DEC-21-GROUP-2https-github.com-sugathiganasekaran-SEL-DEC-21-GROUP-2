package week1.day2;

public class IntersectionNo {

	public static void main(String[] args) {
		int[] arrp={3,2,11,4,6,7};	
		int[] arrq= {1,2,8,4,9,7};
		for(int i=0;i<arrp.length;i++)
			for(int j=0;j<arrq.length;j++)
		{
			if(arrp[i] == arrq[j]) {
				System.out.println(arrp[i]);
		}
	}

}
}