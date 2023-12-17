package com.Game.Iteration1;

class Mario
{
	public void up()
	{
		System.out.println("mario up");
	}
	public void down()
	{
		System.out.println("mario down");
	}
	public void left()
	{
		System.out.println("mario left");
	}
	public void right()
	{
		System.out.println("mario right");
	}
}
class Contra
{
	public void up()
	{
		System.out.println("contra up");
	}
	public void down()
	{
		System.out.println("contra down");
	}
	public void left()
	{
		System.out.println("contra left");
	}
	public void right()
	{
		System.out.println("contra right");
	}
}
class PacMan
{
	public void up()
	{
		System.out.println("pacman up");
	}
	public void down()
	{
		System.out.println("pacman down");
	}
	public void left()
	{
		System.out.println("pacman left");
	}
	public void right()
	{
		System.out.println("pacman right");
	}
}
public class GameRunner 
{
		public void rungame(Mario mario) {
			mario.up();
			mario.down();
			mario.left();
			mario.right();
		}
}
