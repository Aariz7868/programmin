 package WeaponGame;

import java.util.Scanner;

public class Game {
	
	Game(){
		System.out.println("======Game Has Started======");
}
	public Weapon selectWeapon() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score: ");
		int score=sc.nextInt();
		if(score<=400) {
			System.out.println("You Got Knife...");
			Knife k=new Knife();
			return k;
		}else if(score<=800) {
			System.out.println("You Got Gun...");
			return new Gun();
		}
		else {
			
			System.out.println("You Got Bomb...");
			return new Bomb();
		}
}
}