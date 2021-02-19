

public class CalculatorImpl implements Calculator
{

	@Override
	public String addition(int[] firstUnits,int[] secondUnits) 
	{
		int bigha =0,kattha=0,dhur=0,dhurki=0,furki=0,lurki=0,surki=0;
		
		if(firstUnits[6] !=0 || secondUnits[6] !=0)
		{
			surki =firstUnits[6]+secondUnits[6];
			if(surki >= 20)
			{
				lurki += surki/20;
				surki=surki%20;
			}
		}
		if(firstUnits[5] !=0 || secondUnits[5]!=0)
		{
			lurki +=firstUnits[5]+secondUnits[5];
			if(lurki >= 20)
			{
				furki += lurki/20;
				lurki = lurki%20;
			}
		}
		if(firstUnits[4] !=0 || secondUnits[4]!=0)
		{
			furki +=firstUnits[4]+secondUnits[4];
			if(furki >= 20)
			{
				dhurki += furki/20;
				furki = furki%20;
			}
		}
		if(firstUnits[3] !=0 || secondUnits[3] !=0)
		{
			dhurki +=firstUnits[3]+secondUnits[3];
			if(dhurki >= 20)
			{
				dhur += dhurki/20;
				dhurki = dhurki%20;
			}
		}
		if(firstUnits[2] !=0 || secondUnits[2]!=0)
		{
			dhur +=firstUnits[2]+secondUnits[2];
			if(dhur >= 20)
			{
				kattha += dhur/20;
				dhur = dhur%20;
			}
		}
		if(firstUnits[1] !=0 || secondUnits[1] !=0)
		{
			kattha +=firstUnits[1]+secondUnits[1];
			if(kattha >= 20)
			{
				bigha += kattha/20;
				kattha = kattha%20;
			}
		}
		if(firstUnits[0] !=0 || secondUnits[0]!=0)
		{
			bigha += firstUnits[0]+secondUnits[0];
		}
		
		StringBuilder result=new StringBuilder();
		if(bigha >= 0)
			result.append(bigha+" Bigha,");
		if(kattha >= 0)
			result.append(kattha+" Kattha,");
		if(dhur >= 0)
			result.append(dhur+" Dhur,");
		if(dhurki >= 0)
			result.append(dhurki+" Dhurki,");
		if(furki >= 0)
			result.append(furki+" Furki,");
		if(lurki >= 0)
			result.append(lurki+" Lurki,");
		if(surki >= 0)
			result.append(surki+" Surki");
		
		return result.toString();
	}

	@Override
	public String substraction(int[] firstUnits,int[] secondUnits) 
	{
		int bigha =0,kattha=0,dhur=0,dhurki=0,furki=0,lurki=0,surki=0;
		
		if(firstUnits[6] !=0 || secondUnits[6] !=0)
		{
			if(secondUnits[6] > firstUnits[6]) {
				firstUnits[6] += 20;
				firstUnits[5] -= 1;
				
				surki =firstUnits[6]-secondUnits[6];
			} else {
				surki =firstUnits[6]-secondUnits[6];
			}
		}
		if(firstUnits[5] !=0 || secondUnits[5]!=0)
		{
			if(secondUnits[5] > firstUnits[5]) {
				firstUnits[5] += 20;
				firstUnits[4] -= 1;
				
				lurki = firstUnits[5]-secondUnits[5];
			} else {
				lurki = firstUnits[5]-secondUnits[5];
			}
		}
		if(firstUnits[4] !=0 || secondUnits[4]!=0)
		{
			if(secondUnits[4] > firstUnits[4]) {
				firstUnits[4] += 20;
				firstUnits[3] -= 1;
				
				furki = firstUnits[4] - secondUnits[4];
			} else {
				furki = firstUnits[4] - secondUnits[4];
			}
		}
		if(firstUnits[3] !=0 || secondUnits[3] !=0)
		{
			if(secondUnits[3] > firstUnits[3]) {
				firstUnits[3] += 20;
				firstUnits[2] -= 1;
				
				dhurki = firstUnits[3]-secondUnits[3];
			} else {
				dhurki = firstUnits[3]-secondUnits[3];
			}
		}
		if(firstUnits[2] !=0 || secondUnits[2]!=0)
		{
			if(secondUnits[2] > firstUnits[2]) {
				firstUnits[2] += 20;
				firstUnits[1] -= 1;
				
				dhur = firstUnits[2]-secondUnits[2];
			} else {
				dhur = firstUnits[2]-secondUnits[2];
			}
		}
		if(firstUnits[1] !=0 || secondUnits[1] !=0)
		{
			if(secondUnits[1] > firstUnits[1]) {
				firstUnits[1] += 20;
				firstUnits[0] -= 1;
				
				kattha = firstUnits[1]-secondUnits[1];
			} else {
				kattha = firstUnits[1]-secondUnits[1];
			}
		}
		if(firstUnits[0] !=0 || secondUnits[0]!=0)
		{
			bigha = firstUnits[0]-secondUnits[0];
		}
		
		StringBuilder result=new StringBuilder();
		if(bigha >= 0)
			result.append(bigha+" Bigha,");
		if(kattha >= 0)
			result.append(kattha+" Kattha,");
		if(dhur >= 0)
			result.append(dhur+" Dhur,");
		if(dhurki >= 0)
			result.append(dhurki+" Dhurki,");
		if(furki >= 0)
			result.append(furki+" Furki,");
		if(lurki >= 0)
			result.append(lurki+" Lurki,");
		if(surki >= 0)
			result.append(surki+" Surki");
		
		return result.toString();
	}
	
	@Override
	public String multiplication(int[] firstUnits,int unitFactor) 
	{
		int bigha =0,kattha=0,dhur=0,dhurki=0,furki=0,lurki=0,surki=0;
		
		if(firstUnits[6] !=0)
		{
			surki =firstUnits[6]*unitFactor;//32
			if(surki >= 20)
			{
				lurki += surki/20;//1
				surki=surki%20;//12
			}	
		}
		if(firstUnits[5] !=0)
		{
			lurki +=firstUnits[5]*unitFactor;//26+1 = 27
			if(lurki  >= 20)
			{
				furki +=lurki/20;//1
				lurki =lurki%20;//7
			}
		}
		if(firstUnits[4] !=0)
		{
			furki +=firstUnits[4]*unitFactor;//1+12=13
			if(furki  >= 20)
			{
				dhurki +=furki/20; //0
				furki =furki%20; //0
			}
		}
		if(firstUnits[3] !=0)
		{
			dhurki +=firstUnits[3]*unitFactor; //26
			if(dhurki  >= 20)
			{
				dhur +=dhurki/20;//1
				dhurki =dhurki%20;//6
			}
		}
		if(firstUnits[2] !=0)
		{
			dhur +=firstUnits[2]*unitFactor;//1+4=5
			if(dhur  >= 20)
			{
				kattha +=dhur/20;//0
				dhur =dhur%20; //0
			}
		}
		if(firstUnits[1] !=0)
		{
			kattha +=firstUnits[1]*unitFactor;//0+6 =6
			if(kattha  >= 20)
			{
				bigha +=kattha/20;//0
				kattha =kattha%20;//6
			}
		}
		if(firstUnits[0] !=0)
		{
			bigha +=firstUnits[0]*unitFactor;//0
		}
		
		StringBuilder result=new StringBuilder();
		if(bigha >= 0)
			result.append(bigha+" Bigha,");
		if(kattha >= 0)
			result.append(kattha+" Kattha,");
		if(dhur >= 0)
			result.append(dhur+" Dhur,");
		if(dhurki >= 0)
			result.append(dhurki+" Dhurki,");
		if(furki >= 0)
			result.append(furki+" Furki,");
		if(lurki >= 0)
			result.append(lurki+" Lurki,");
		if(surki >= 0)
			result.append(surki+" Surki");
		
		return result.toString();
	}
	
	@Override
	public String division(int[] firstUnits,int unitFactor) 
	{
		int bigha =0,kattha=0,dhur=0,dhurki=0,furki=0,lurki=0,surki=0;
		
		if(firstUnits[0] !=0)
		{
			bigha =firstUnits[0]/unitFactor;//0
			int mKattha = firstUnits[0]%unitFactor;//0
			kattha = mKattha * 20;// 0
		}
		if(firstUnits[1] !=0)
		{
			kattha += firstUnits[1];//1
			int mDhur = kattha % unitFactor;//1
			kattha = kattha/unitFactor;//0
			if(mDhur !=0)
			{
				dhur = mDhur*20;//20
			}
		} else {
			int mDhur = kattha % unitFactor;//0
			kattha = kattha/unitFactor;//4
		
			if(mDhur !=0)
			{
				dhur = mDhur*20;//0
			}
		}
		
		if(firstUnits[2] !=0)
		{
			dhur += firstUnits[2];// 20+17=37
			int mDhurki = dhur % unitFactor;//2
			dhur = dhur/unitFactor;//37/9 = 4
			if(mDhurki !=0)
			{
				dhurki = mDhurki * 20;//40
			}
		} else {
			int mDhurki = dhur % unitFactor;//4
			dhur = dhur/unitFactor;//94/5 = 18
			if(mDhurki !=0)
			{
				dhurki = mDhurki * 20;//80
			}
		}
		
		if(firstUnits[3] !=0)
		{
			dhurki += firstUnits[3];//20+12 =32
			int mFurki = dhurki % unitFactor;//5
			dhurki = dhurki/unitFactor;//32/9=3
			
			if(mFurki !=0)
			{
				furki = mFurki * 20;//100
			}
		} else {
			int mFurki = dhurki % unitFactor;
			dhurki = dhurki/unitFactor;
			
			if(mFurki !=0) {
				furki = mFurki * 20;//0
			}
		}
		
		if(firstUnits[4] !=0)
		{
			furki = furki+firstUnits[4];//0+12=12
			int mLurki = furki % unitFactor;//2
			furki = furki/unitFactor;//2
			
			if(mLurki !=0)
			{
				lurki = mLurki*20;//40
			}
		} else {
			int mLurki = furki % unitFactor;//1
			furki = furki/unitFactor;//11
			
			if(mLurki !=0)
			{
				lurki = mLurki*20;//20
			}
		}
		
		if(firstUnits[5] !=0)
		{
			lurki = lurki+firstUnits[5];//40+8=48
			int mSurki = lurki % unitFactor;//8
			lurki = lurki/unitFactor;//9
			
			if(mSurki !=0)
			{
				surki = mSurki*20;//60
			}
		} else {
			int mSurki = lurki % unitFactor;//2
			lurki = lurki/unitFactor;//2
			
			if(mSurki !=0)
			{
				surki = mSurki*20;//40
			}
		}
		
		if(firstUnits[6] !=0)
		{
			surki = surki+firstUnits[6];//60+13=73
			if(surki !=0)
			{
				surki =surki/unitFactor;//14
			}
		} else {
			surki =surki/unitFactor;//40/9=4
		}
		
		StringBuilder result=new StringBuilder();
		if(bigha >= 0)
			result.append(bigha+" Bigha,");
		if(kattha >= 0)
			result.append(kattha+" Kattha,");
		if(dhur >= 0)
			result.append(dhur+" Dhur,");
		if(dhurki >= 0)
			result.append(dhurki+" Dhurki,");
		if(furki >= 0)
			result.append(furki+" Furki,");
		if(lurki >= 0)
			result.append(lurki+" Lurki,");
		if(surki >= 0)
			result.append(surki+" Surki");
		
		return result.toString();
	}

}
