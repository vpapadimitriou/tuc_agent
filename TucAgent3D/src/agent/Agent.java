package agent;

//import java.util.Vector;
//import connection.GetMessageAsVector;
import action.Dance;
import action.Walk;
import connection.Connection;
//import perceptor.Ball;
import perceptor.Perceptors;
//import worldState.ServerTime;
//import worldState.ServerTime;
//import behavior.Behavior;
import perceptor.ForceResistancePerceptor;



public class Agent {





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Perceptors Gp = new Perceptors();
		
		String host = "127.0.0.1";
		int port = 3100;

		//initializes the connection
		Connection con = new Connection(host,port);
		//GetMessageAsVector GmAv= new GetMessageAsVector(null);
		boolean isConnected = false;
		
		boolean playerIsInit=false;

		//establish the connection between agent and server
		isConnected = con.establishConnection();
		
		Walk dnc=new Walk();

		//Creation of Nao robot
		if(isConnected==true){
			con.sendMessage("(scene rsg/agent/nao/nao.rsg)");
		}

		int i=0;
		int y=1;
		String walking = null;
		
		while(con.isConnected()){

			
			String mesg=con.receiveMessage();
			//System.out.println(mesg);
			//get every message and update all perceptors
			Gp.GetPerceptors(con);
			
			
			if (playerIsInit==false){
				con.sendMessage("(init(unum 1)(teamname TucAgents3D))");
				playerIsInit=true;
			}
			
			i++;
			if (i>100){
			if(i%30 ==0){
				
				walking= dnc.WalkMotionString(y);
				y++;
				con.sendMessage(walking);
			}
			
			//String a = dnc.WalkMotionString(y,con);
			
			//System.out.println(y);
			
			
			//con.sendMessage(walking);
			}

			
			//initialiaze the player number and the teamname
			
			
			
			
		}

	}
	
	
	
}