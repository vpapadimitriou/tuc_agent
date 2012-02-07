package perceptor;

public class GetNormalJointValue {


	float alrValue;
	float chnValue;
	
	/*float he1Min= -120;
	float he1Max= 120;
	float he2Min= -45;
	float he2Max= 45;

	float Rhe1Min=(float) -1.57;
	float Rhe1Max=(float) 1.57;
	float Rhe2Min=(float) -0.79;
	float Rhe2Max=(float) 0.79;

	float rae1Min=-120;
	float rae1Max=120;
	float rae2Min=-95;
	float rae2Max=1;
	float rae3Min=-120;
	float rae3Max=120;
	float rae4Min=-90;
	float rae4Max=1;

	float Rrae1Min=(float) -2.09;
	float Rrae1Max=(float) 2.09;
	float Rrae2Min=(float) -1.66;
	float Rrae2Max=0;
	float Rrae3Min=(float) -2.09;
	float Rrae3Max=(float) 2.09;
	float Rrae4Min=0;
	float Rrae4Max=(float) 1.66;

	float lae1Min=-120;
	float lae1Max=120;
	float lae2Min=-1;
	float lae2Max=-95;
	float lae3Min=-120;
	float lae3Max=120;
	float lae4Min=-90;
	float lae4Max=1;

	float Rlae1Min=(float) -2.09;
	float Rlae1Max=(float) 2.09;
	float Rlae2Min=0;
	float Rlae2Max=(float) 1.66;
	float Rlae3Min=(float) -2.09;
	float Rlae3Max=(float) 2.09;
	float Rlae4Min=(float) -1.66;
	float Rlae4Max=0;

	float rle1Min=-45;
	float rle1Max=25;
	float rle2Min=25;
	float rle2Max=100;
	float rle3Min=-90;
	float rle3Max=1;
	float rle4Min=-130;
	float rle4Max=1;
	float rle5Min=-45;
	float rle5Max=75;
	float rle6Min=-25;
	float rle6Max=45;

	float Rrle1Min=(float) -0.79;
	float Rrle1Max=(float) 0.44;
	float Rrle2Min=(float) -1.57;
	float Rrle2Max=(float) 0.52;
	float Rrle3Min=(float) -0.94;
	float Rrle3Max=(float) 0.68;
	float Rrle4Min=0;
	float Rrle4Max=(float) 2.27;
	float Rrle5Min=(float) -1.22;
	float Rrle5Max=(float) 0.79;
	float Rrle6Min=(float) -0.79;
	float Rrle6Max=(float) 0.79;

	float lle1Min=-25;
	float lle1Max=45;
	float lle2Min=-25;
	float lle2Max=100;
	float lle3Min=-90;
	float lle3Max=1;
	float lle4Min=-130;
	float lle4Max=1;
	float lle5Min=-45;
	float lle5Max=75;
	float lle6Min=-45;
	float lle6Max=25;

	float Rlle1Min=(float) -0.44;
	float Rlle1Max=(float) 0.79;
	float Rlle2Min=(float) -1.57;
	float Rlle2Max=(float) 0.52;
	float Rlle3Min=(float) -0.94;
	float Rlle3Max=(float) 0.68;
	float Rlle4Min=0;
	float Rlle4Max=(float) 2.27;
	float Rlle5Min=(float) -1.22;
	float Rlle5Max=(float) 0.79;
	float Rlle6Min=(float) -0.79;
	float Rlle6Max=(float) 0.79;


	float perc;
	float percV;
	float Min = 0;
	float Max = 0;
	float RMin = 0;
	float RMax = 0;*/

	public float Get(String name,float value){

		if(name.equalsIgnoreCase("he1")){
			
			alrValue = HingeJointPerceptor.getHj1();

		}else if(name.equalsIgnoreCase("he2")){	
			
			alrValue = HingeJointPerceptor.getHj2();

		}else if(name.equalsIgnoreCase("rae1")){
			
			alrValue = HingeJointPerceptor.getRaj1();

		}else if(name.equalsIgnoreCase("rae2")){
			
			alrValue = HingeJointPerceptor.getRaj2();

		}else if(name.equalsIgnoreCase("rae3")){
			
			alrValue = HingeJointPerceptor.getRaj3();

		}else if(name.equalsIgnoreCase("rae4")){
			
			alrValue = HingeJointPerceptor.getRaj4();
			
		}else if(name.equalsIgnoreCase("lae1")){
			
			alrValue = HingeJointPerceptor.getLaj1();

		}else if(name.equalsIgnoreCase("lae2")){
			
			alrValue = HingeJointPerceptor.getLaj2();

		}else if(name.equalsIgnoreCase("lae3")){
			
			alrValue = HingeJointPerceptor.getLaj3();

		}else if(name.equalsIgnoreCase("lae4")){
			
			alrValue = HingeJointPerceptor.getLaj4();

		}else if(name.equalsIgnoreCase("rle1")){
			
			alrValue = HingeJointPerceptor.getRlj1();

		}else if(name.equalsIgnoreCase("rle2")){
			
			alrValue = HingeJointPerceptor.getRlj2();

		}else if(name.equalsIgnoreCase("rle3")){
			
			alrValue = HingeJointPerceptor.getRlj3();

		}else if(name.equalsIgnoreCase("rle4")){

			alrValue = HingeJointPerceptor.getRlj4();


		}else if(name.equalsIgnoreCase("rle5")){
			
			alrValue = HingeJointPerceptor.getRlj5();

		}else if(name.equalsIgnoreCase("rle6")){

			alrValue = HingeJointPerceptor.getRlj6();

		}else if(name.equalsIgnoreCase("lle1")){

			alrValue = HingeJointPerceptor.getLlj1();

		}else if(name.equalsIgnoreCase("lle2")){

			alrValue = HingeJointPerceptor.getLlj2();

		}else if(name.equalsIgnoreCase("lle3")){

			alrValue = HingeJointPerceptor.getLlj3();

		}else if(name.equalsIgnoreCase("lle4")){

			alrValue = HingeJointPerceptor.getLlj4();

		}else if(name.equalsIgnoreCase("lle5")){

			alrValue = HingeJointPerceptor.getLlj5();

		}else if(name.equalsIgnoreCase("lle6")){
			
			alrValue = HingeJointPerceptor.getLlj6();

		}
		System.out.println("old value"+alrValue);

		chnValue=value;

		System.out.println("new value"+chnValue);

		return chnValue;
	}


}
