import java.util.*;

public class Arena{

	public static void main(String[] args){

		ArrayList<Monster> monsters = new ArrayList<>(); //Anlegen einer Arraylist für die Monster, damit ich später mischen kann
		
		Monster hellfire = new FireMonster("Hellfire", 120, 550,"");
		Monster mowingmachine = new GrassMonster("MowingMachine",80, 600,"");
		Monster neptune = new WaterMonster ("Neptune", 100, 555,"");
		Monster monster = new WaterMonster("", 50, 50, ""); //Das Objekt wird nur zum Aufruf der Methode TakeHit in der Monsterklasse genutzt

		monsters.add(hellfire);
		monsters.add(mowingmachine);
		monsters.add(neptune);

		hellfire.setType("fire");
		mowingmachine.setType("grass");
		neptune.setType("water");


	System.out.println("Willkommen zum Monsterduell. Sie können aus drei Monstern wählen und es gegen ein zufällig gewähltes Monster kämpfen lassen.\n Bitte wählen Sie:\nDie 1 für : hellfire - Ein Feuermonster\nDie 2 für : mowingMachine - Ein Grasmonster\nDie 3 für : Neptune - Ein Wassermonster");


	Collections.shuffle(monsters);  //Hier werden die Objekte gemischt
	Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

	if(i==1 && hellfire.getName().equals (monsters.get(0).getName())){   //Wenn das Monster hellfire vom Spieler gewählt wurdestelle ich hier sicher, dass das gegnerische Monster nicht auch Hellfire ist
		while(hellfire.getName().equals (monsters.get(0).getName())){
			Collections.shuffle(monsters);
		}
	}
	if(i==1 && !hellfire.getName().equals (monsters.get(0).getName())){	
        	while(hellfire.getLife()>0 && monsters.get(0).getLife()>0){
		       try{								//mit try und catch fange ich die Exceptions auf, die durch Thread.sleep() ausgelöst werden
			System.out.println(monster.takeHit(hellfire,monsters.get(0)));
		       } catch(Exception e){
		       }
	}
		}	

	 if(i==2 && mowingmachine.getName().equals (monsters.get(0).getName())){  //Das gleiche hier das zweite Monster
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

	 if(i==3 && neptune.getName().equals (monsters.get(0).getName())){   //Und auch für das dritte Monster
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

