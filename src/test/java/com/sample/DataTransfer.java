package com.sample;

import org.testng.annotations.DataProvider;

public class DataTransfer {
	@DataProvider(/*name="login",*/indices= {1,2},parallel=true)
	public String[][] data(){
		String[][] da=new String[3][2];
		da[0][0]="8610707648";
		da[0][1]="Abdul@123";
		da[1][0]="8610707648";
		da[1][1]="Abdul@123";
		da[2][0]="hfhnfgnfd";
		da[2][1]="ghggdyg";
		return da;
	}

}
/*we cant able to use dataprovider and parameter in a same class if suppose we did it will show dataprovider 
mismatch because of dataprovider has higher residence.it give method match exception
*/
