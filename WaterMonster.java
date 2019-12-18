public class WaterMonster extends Monster{


	public WaterMonster(String name, int damage, int life, String type){
	
		super(name, damage, life, type);
	}


	@Override
	public String takeHit(Monster monster){
		return "";
	}
}
