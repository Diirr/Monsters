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

public abstract String takeHit(Monster monster);


/*public String takeHit(Monster monster1, Monster monster2){

	String ty=monster.getType();
	String ty2=monster2.getType();
        int monsterLife=0;
        int opponentLife=0;
        int currentMonsterDamage=0;
        int opponentMonsterDamage=0;



	if(ty2.equals("fire"){   //Für Firemonster
	
	
		if(ty.equals("water")){

                opponentMonsterDamage=(monster.getDamage())*2;
                currentMonsterDamage=(this.getDamage())/2;
                monsterLife = this.getLife()-opponentMonsterDamage;
                opponentLife = monster.getLife()-currentMonsterDamage;

        }
        else if(ty.equals("grass")){

                opponentMonsterDamage=(monster.getDamage())/2;
                currentMonsterDamage=(this.getDamage())*2;
                monsterLife = this.getLife()-opponentMonsterDamage;
                opponentLife = monster.getLife()-currentMonsterDamage;
        }
	}

	if(ty2.equals("grass"){  //Für Grassmonster
	
		if(ty.equals("fire")){

                opponentMonsterDamage=(monster.getDamage())*2;
                currentMonsterDamage=(this.getDamage())/2;
                monsterLife = this.getLife()-opponentMonsterDamage;
                opponentLife = monster.getLife()-currentMonsterDamage;

        }
        else if(ty.equals("water")){

                opponentMonsterDamage=(monster.getDamage())/2;
                currentMonsterDamage=(this.getDamage())*2;
                monsterLife = this.getLife()-opponentMonsterDamage;
                opponentLife = monster.getLife()-currentMonsterDamage;
        }

	
	}


	if(ty2.equals("water"){  //Für Watermonster
	
	
	if(ty.equals("grass")){

                opponentMonsterDamage=(monster.getDamage())*2;
                currentMonsterDamage=(this.getDamage())/2;
                monsterLife = this.getLife()-opponentMonsterDamage;
                opponentLife = monster.getLife()-currentMonsterDamage;

        }
        else if(ty.equals("fire")){

                opponentMonsterDamage=(monster.getDamage())/2;
                currentMonsterDamage=(this.getDamage())*2;
                monsterLife = this.getLife()-opponentMonsterDamage;
                opponentLife = monster.getLife()-currentMonsterDamage;
        }
	
	}

	this.setLife(monsterLife);
        monster.setLife(opponentLife);





}*/
}


