import java.util.*;

public class Arena{

	public static void main(String[] args){

		ArrayList<Monster> monsters = new ArrayList<>();
	
	
		Monster hellfire = new FireMonster("Hellfire", 120, 550,"");
		Monster mowingmachine = new GrassMonster("MowingMachine",80, 600,"");
		Monster neptune = new WaterMonster ("Neptune", 100, 555,"");
		Monster monster = new WaterMonster("", 50, 50, "");

		monsters.add(hellfire);
		monsters.add(mowingmachine);
		monsters.add(neptune);

		hellfire.setType("fire");
		mowingmachine.setType("grass");
		neptune.setType("water");


	System.out.println("Willkommen zum Monsterduell. Sie können aus drei Monstern wählen und es gegen ein zufällig gewähltes Monster kämpfen lassen.\n Bitte wählen Sie:\nDie 1 für : hellfire - Ein Feuermonster\nDie 2 für : mowingMachine - Ein Grasmonster\nDie 3 für : Neptune - Ein Wassermonster");


	Collections.shuffle(monsters);
	Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

	if(i==1 && hellfire.getName().equals (monsters.get(0).getName())){
		while(hellfire.getName().equals (monsters.get(0).getName())){
			Collections.shuffle(monsters);
		}
	}
	if(i==1 && !hellfire.getName().equals (monsters.get(0).getName())){	
        	while(hellfire.getLife()>0 && monsters.get(0).getLife()>0){
		       try{	
			System.out.println(monster.takeHit(hellfire,monsters.get(0)));
		       } catch(Exception e){
		       }
	}
		}	

	 if(i==2 && mowingmachine.getName().equals (monsters.get(0).getName())){
                while(mowingmachine.getName().equals (monsters.get(0).getName())){
                        Collections.shuffle(monsters);
                }
	}
	if(i==2 && !mowingmachine.getName().equals (monsters.get(0).getName())){ 
        	while(mowingmachine.getLife()>0 && monsters.get(0).getLife()>0){
			try{
        		System.out.println(monster.takeHit(mowingmachine,monsters.get(0)));
			}catch(Exception e){
			}
        }
		 }

	 if(i==3 && neptune.getName().equals (monsters.get(0).getName())){
                while(neptune.getName().equals (monsters.get(0).getName())){
                        Collections.shuffle(monsters);
                }
	 }

        if(i==3 && !neptune.getName().equals (monsters.get(0).getName())){
        	while(neptune.getLife()>0 && monsters.get(0).getLife()>0){
			try{
        		System.out.println(monster.takeHit(neptune,monsters.get(0)));
			}catch(Exception e){
			}
        	}
	}
}
}

