public class GrassMonster extends Monster{

	public GrassMonster(String name, int damage, int life, String type){
		
		super(name, damage, life, type);
	}

         @Override
	 public String takeHit(){
	    return "";
	 }

}
