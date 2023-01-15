package com.template.cases;

public class TestSprite {
	
	public static void main(String[] args) {
		Sprite mySprite = new MyPlane();
		mySprite.setX(100);
		mySprite.setY(300);
		mySprite.draw();
		
		Sprite enemySprite = new EnemyPlane();
		enemySprite.setX(0);
		enemySprite.setY(300);
		enemySprite.draw();
	}

}
