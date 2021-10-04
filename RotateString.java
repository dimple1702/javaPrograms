/**
	Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
	A shift on s consists of moving the leftmost character of s to the rightmost position.
	For example, if s = "abcde", then it will be "bcdea" after one shift.
*/

import java.util.*;
public class RotateString{
	public static void main(String[] args) {
		String s = "abcde";
		String goal = "cdabe";
	
		System.out.println("Is Rotated: " + IsRotated(s, goal));
	}

	public static boolean IsRotated(String s, String goal) {
		return (s.length() == goal.length() && (s+s).contains(goal));
	}

	public static boolean IsRotated2(String s, String goal) {
		/**
		 * rotate the string by 1
		 * check if the rotated string = goal
		 * if yes return true else false
		 * continue upto lenght of string		 
		*/
	}
}