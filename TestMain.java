

public class TestMain {
	public static void Attack(CombatUnit[] cus){
		

		for(int i = 0; i < cus.length; i++) {
			cus[i].Attack();
		}
	}

	public static void main(String[] args) {
		CombatUnit[] cu = new CombatUnit[10];
		
		cu[0]=new Fighter();
		cu[1]=new Fighter();
		cu[2]=new Footman();
		cu[3]=new Footman();
		cu[4]=new Fighter();
		cu[5]=new Tank();
		cu[6]=new Fighter();
		cu[7]=new Fighter();
		cu[8]=new Fighter();
		cu[9]=new SCV();

		
		
		Attack(cu);
	}

}
