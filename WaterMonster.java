public class WaterMonster extends Monster{




	public WaterMonster(String name, int damage, int life, String type){
	
		super(name, damage, life, type);
	}



	 @Override
        public String takeHit(Monster monster){

        String ty=monster.getType();
        int fireMonsterLife=0;
        int opponentLife=0;
        int currentMonsterDamage=0;
        int opponentMonsterDamage=0;


        if(ty.equals("grass")){

                opponentMonsterDamage=(monster.getDamage())*2;
                currentMonsterDamage=(this.getDamage())/2;
                fireMonsterLife = this.getLife()-opponentMonsterDamage;
                opponentLife = monster.getLife()-currentMonsterDamage;

        }
        else if(ty.equals("fire")){

                opponentMonsterDamage=(monster.getDamage())/2;
                currentMonsterDamage=(this.getDamage())*2;
                fireMonsterLife = this.getLife()-opponentMonsterDamage;
                opponentLife = monster.getLife()-currentMonsterDamage;
        }


        this.setLife(fireMonsterLife);
        monster.setLife(opponentLife);


        if(fireMonsterLife>0 && opponentLife >0){
        return  "++++++++++++++++++++der Kampf beginnt++++++++++++++++++++\n"+monster.getName()+" attacks "+this.getName()+" and causes "+opponentMonsterDamage+" damage.\n"+this.getName()+ " has "+fireMonsterLife+" lifepoints left.\n Now it's "+this.getName()+ " turn. It attacks "+monster.getName()+" and causes "+currentMonsterDamage+" damage.\n"+monster.getName()+ " has "+opponentLife+" lifepoints left.\n";
        }


        if(fireMonsterLife<=0){
        return "++++++++++++++++++++der Kampf beginnt++++++++++++++++++++\n" +monster.getName()+" attacks "+this.getName()+" and causes "+opponentMonsterDamage+" damage.\n"+this.getName()+" has no lifepoints left and is KO.\n The winner is "+monster.getName()+" and has "+monster.getLife()+" lifepoints left.\n";
        }
        else{
        return "++++++++++++++++++++der Kampf beginnt++++++++++++++++++++\n" +this.getName()+" attacks "+monster.getName()+" and causes "+currentMonsterDamage+" damage.\n"+monster.getName()+" has no lifepoints left and is KO.\n The winner is "+this.getName()+" and has "+this.getLife()+" lifepoints left.\n";

        }
}


}
