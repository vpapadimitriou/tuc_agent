package action;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;
import perceptor.GetNormalJointValue;

public class Walk {


	public String WalkMotionString(int i){

		//String java.lang.Integer.toHexString( int )
		String msg = "";
		Vector<String> WalkMotionVector=new Vector<String>();
		WalkMotionVector=readWalk();
		
		GetNormalJointValue gNjV=new GetNormalJointValue();

		
		String[] joint = WalkMotionVector.elementAt(0).split(",");
		String[] value = WalkMotionVector.elementAt(i).split(",");

		float Rvalue=0;
		for (int x=0; x<joint.length; x++){
			
			//System.out.println(joint[x]);
			float aa = Float.valueOf(value[x+2].trim()).floatValue();
			float a = gNjV.Get(joint[x], aa);
			String sent=""+a;
			
			msg+="("+joint[x]+" "+sent+")";
			
		}

		return msg;
	}


	public Vector<String> readWalk(){

		Vector<String> WalkMotionVector=new Vector<String>();
		File file = new File("walk.txt");
		StringBuffer contents = new StringBuffer();
		BufferedReader reader=null;

		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;

			// repeat until all lines is read
			while ((text = reader.readLine()) != null) {
				WalkMotionVector.add(reader.readLine());
				//System.out.println(reader.readLine());
				contents.append(text).append(System.getProperty("line.separator"));


			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// show file contents here
		return WalkMotionVector;

	}


}
