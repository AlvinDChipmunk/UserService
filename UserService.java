package com.hubgitalvin.wk4.usrserv;

/*

 * Student: Alvin H. Revilas
 *
 * Week 4 Assignment 2:  Create a User Service
 *
 * Project Summary:  
 *
 * - Create a UserService class with one method.  The 
 *       method's name is createUser.  
 * - This createUser method will take an array of 
 *       Strings as input.
 * - The input array will have three Strings inside of it: 
 *    - A Username
 *    - A Password
 *    - A Name
 *
 * Other parameters:  
 * 
 * - The createUser method will output a User object that 
 *       will be populated with the username, password and 
 *       name above.
 * 
 * Possible Ideas for the design: 
 * 
 * - Example Input:
 *    - stringInput[0] = "aUsernameHere";
 *    - stringInput[1] = "aPasswordHere";
 *    - stringInput[2] = "Somebodies Name";
 *
*/

/* Basic Program Logic: 
 * 1. Set up input array
 * 2. Invoke CreateUser method and use the input array 
 * 3. Output should be a "User" object that has the traits from the input array
*/ 

import com.hubgitalvin.wk3.usrassign.User;

public class UserService {

	public static void main(String[] args) {
		
		String[] objIn = new String[3];
		
		objIn[0] = "keypeele1985@humor.com";
		objIn[1] = "uDum@$$96";
		objIn[2] = "A.A.Ron Bala-Ke";
		
		User alvUser = CreateUser(objIn);
		
	}
	
	public static User CreateUser(String[] usrTraits) {

		User myUser = new User(); 

		myUser.setUserName(usrTraits[0]); 
		myUser.setPassword(usrTraits[1]); 
		myUser.setName(usrTraits[2]); 
	
		return myUser; 
	
	}

}
