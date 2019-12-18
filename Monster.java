public abstract class Monster{

   private String name;
   private int damage;
   private int life;
   private String type;


   	//Der Konstruktor

 	public Monster(String name, int damage, int life, String type){

       	    this.name=name;
            this.damage=damage;
            this.life=life;
	    this.type="Monster";
 }

	//Setters definieren

 	public void setName(String name){
	    
		this.name=name;
	}

	public void setDamage(int damage){
	
		this.damage=damage;
	}

	public void setLife(int life){
	
		this.life=life;
	}

	public void setType(String type){
	
		this.type=type;
	}

	//Getters definieren

	public String getName(){
	
		return this.name;
	}

	public int getDamage(){
	
		return this.damage;
	}

	public int getLife(){
	 
		return this.life;
	}

	public String getType(){
	
		return this.type;
	}

public abstract String takeHit();


public String takeHit(Monster monster1, Monster monster2)throws Exception{

	String ty=monster1.getType();
	String ty2=monster2.getType();
        int monsterLife=0;
        int opponentLife=0;
        int currentMonsterDamage=0;
        int opponentMonsterDamage=0;

	if(ty2.equals("fire")){   //Für Firemonster
	
		if(ty.equals("water")){

                opponentMonsterDamage=(monster1.getDamage())*2;
                currentMonsterDamage=(monster2.getDamage())/2;
                monsterLife = monster2.getLife()-opponentMonsterDamage;
                opponentLife = monster1.getLife()-currentMonsterDamage;

        }
        	else if(ty.equals("grass")){

                opponentMonsterDamage=(monster1.getDamage())/2;
                currentMonsterDamage=(monster2.getDamage())*2;
                monsterLife = monster2.getLife()-opponentMonsterDamage;
                opponentLife = monster1.getLife()-currentMonsterDamage;
        }
	}

	if(ty2.equals("grass")){  //Für Grassmonster
	
		if(ty.equals("fire")){

                opponentMonsterDamage=(monster1.getDamage())*2;
                currentMonsterDamage=(monster2.getDamage())/2;
                monsterLife = monster2.getLife()-opponentMonsterDamage;
                opponentLife = monster1.getLife()-currentMonsterDamage;

        }
        	else if(ty.equals("water")){

                opponentMonsterDamage=(monster1.getDamage())/2;
                currentMonsterDamage=(monster2.getDamage())*2;
                monsterLife = monster2.getLife()-opponentMonsterDamage;
                opponentLife = monster1.getLife()-currentMonsterDamage;
        }	
	}

	if(ty2.equals("water")){	//Für Watermonster

		if(ty.equals("grass")){

                opponentMonsterDamage=(monster1.getDamage())*2;
                currentMonsterDamage=(monster2.getDamage())/2;
                monsterLife = monster2.getLife()-opponentMonsterDamage;
                opponentLife = monster1.getLife()-currentMonsterDamage;
        }
        	else if(ty.equals("fire")){

                opponentMonsterDamage=(monster1.getDamage())/2;
                currentMonsterDamage=(monster2.getDamage())*2;
                monsterLife = monster2.getLife()-opponentMonsterDamage;
                opponentLife = monster1.getLife()-currentMonsterDamage;
        }
	}

	monster2.setLife(monsterLife);
        monster1.setLife(opponentLife);

		//Jetzt werden die Ausgaben generiert. 				

	if(monsterLife>0 && opponentLife >0){
		Thread.sleep(3000);
        return  "++++++++++++++++++++der Kampf beginnt++++++++++++++++++++\n"+monster1.getName()+" attacks "+monster2.getName()+" and causes "+opponentMonsterDamage+" damage.\n"+monster2.getName()+ " has "+monsterLife+" lifepoints left.\nNow it's "+monster2.getName()+ " turn. It attacks "+monster1.getName()+" and causes "+currentMonsterDamage+" damage.\n"+monster1.getName()+ " has "+opponentLife+" lifepoints left.\n";
        }

        if(monsterLife<=0){
		Thread.sleep(3000);
        return "++++++++++++++++++++der Kampf beginnt++++++++++++++++++++\n" +monster1.getName()+" attacks "+monster2.getName()+" and causes "+opponentMonsterDamage+" damage.\n"+monster2.getName()+" has no lifepoints left and is KO.\nThe winner is "+monster1.getName()+" and has "+monster1.getLife()+" lifepoints left.\n";
        }
        else{
		Thread.sleep(3000);
        return "++++++++++++++++++++der Kampf beginnt++++++++++++++++++++\n" +monster2.getName()+" attacks "+monster1.getName()+" and causes "+currentMonsterDamage+" damage.\n"+monster1.getName()+" has no lifepoints left and is KO.\nThe winner is "+monster2.getName()+" and has "+monster2.getLife()+" lifepoints left.\n";

        }
}
}

