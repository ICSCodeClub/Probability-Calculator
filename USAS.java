import java.util.*;
import java.util.Scanner;

	public class USAS {
	public static void main(String[] args) {
		
					String releaseVersionAndDate = " Alpha Version 0.4 (4/_/2021)";
								
					//Introduction
					System.out.println("Welcome to U.S.A.S." + releaseVersionAndDate + ".");
					System.out.println("This program is currently in Alpha stages. We are constantly working on the program and would love feedback to fix and improve.");
					System.out.println("");
					
					//Note
					System.out.println("Please note if you do not live in Redmond, Sammamish, Kirkland, or Woodinville, Washington, this program will have less accurate results.");
					System.out.println("If using the program when not in the region will work but may have less acccurate results and less optomizations.");
					System.out.println("");
							
					//Command List
					System.out.println("Here is the list of commands:");
					System.out.println("!calc snow delay chance");
					//calculates chance of a delay because of snow
					System.out.println("!calc snow cancellation chance");
					//calculate the chance of a cancellation because of snow
					System.out.println("!calc poweroutage chance");
					//calculate the chance of a poweroutage
					System.out.println("!calc covid hospitalization/death chance");
					//calculate the chance of being hospitalized or dying from covid based off age, health issues, and sex
					System.out.println("!calc covid risk assessment chance");
					//calculate the chance of getting covid depending on the size of group you are in and the county of the us you are in
					System.out.println("!give feedback");
					//option to give feedback
					System.out.println("!give credits");
					//command to show the credits				
					System.out.println("!repeat snow delay chance");
					//command to repeat the chance of a delay because of snow
					System.out.println("!repeat snow cancellation chance");
					//command to repeat the chance of a cancellation because of snow
					System.out.println("!repeat poweroutage chance");
					//command to repeat the chance of a poweroutage
					System.out.println("!repeat covid hospitalization/death chance");
					//command to repeat the chance of hospitalization/death from covid
					System.out.println("!repeat covid risk assessment chance");
					//command to repeat the chance of getting covid depending on the size of group you are in and the county of the us you are in
					System.out.println("!quit");
					//command to quit program when the user is done
					System.out.println("");
												
			
					Scanner in = new Scanner(System.in);
					//Scanner for user input
					String userInput = "";
					//String for userInput	
					
					while (!userInput.equals("!quit")) {
					userInput = in.nextLine();
				
					//!calc snow delay chance command
					
					String delayIcePresent = "no";
					//this determines if there is ice or not
					byte delayInchesSnow = 0;
					//this determines how much snow there is if there is any 
					byte delayIcePresentAffect = 0;
					//this determines the % based off the user input with the delayIcePresent int
					byte delayInchesSnowAffect = 0;  
					//this determines the % based off the user input with the delayInchesSnow int
					
											
					if(userInput.equalsIgnoreCase("!calc snow delay chance")) {
						give_snow_delay_chance.give_snow_delay_chance(delayIcePresent, delayInchesSnow, delayIcePresentAffect, delayInchesSnowAffect, in);
						System.out.println("");
					}
					
					
					//!calc snow cancellation chance command
					
					String cancellationIcePresent = "no";
					//this determines if there is ice or not
					Byte cancellationInchesSnow = 0;
					//this determines how much snow there is if there is any 
					Byte cancellationIcePresentAffect = 0;
					//this determines the % based off the user input with the cancellationIcePresent int
					Byte cancellationInchesSnowAffect = 0;
					//this determines the % based off the user input with the cancellationInchesSnow int
					
								
					if(userInput.equalsIgnoreCase("!calc snow cancellation chance")) {
						give_snow_cancellation_chance.give_snow_cancellation_chance(cancellationIcePresent, cancellationInchesSnow, cancellationIcePresentAffect, cancellationInchesSnowAffect, in);
						System.out.println("");
					}								
												
											
					//!calc poweroutage chance
					
					String outageHighWindWarning = "no";
					//boolean used to tell if local services have determined if there is a wind warning;
					int outageWindSpeed = 0;
					//int used to store the wind speed to be used in the calculator.
					int outageWindSpeedAffect = 0;  
					//int used to determine the affect of wind speed on the final chance of a poweroutage
					
										
					if(userInput.equalsIgnoreCase("!calc poweroutage chance")) {
						give_poweroutage_chance.give_poweroutage_chance(outageHighWindWarning, outageWindSpeed, outageWindSpeedAffect, in);
						System.out.println("");
					}	
					
					
					//!calc covid hospitalization/death chance
					
					int c19hurtuserAge = 0;
					//int to tell the age of the user
					String c19hurtuserSex = "Male";
					//string to tell the sex of the user
					boolean c19hurtuserhasIssues = false;
					//boolean to tell if the user has other issues
					boolean c19hurtuserhasHypertension = false;
					//boolean to tell if the user has Hypertension
					boolean c19hurtuserhasDiabetes = false;
					//boolean to tell if the user has Diabetes
					boolean c19hurtuserhasCardiovascular = false;
					//boolean to tell if the user has Cardiovascular Disease
					boolean c19hurtuserhasRespiratory = false;
					//boolean to tell if the user has Respiratory Disease
					boolean c19hurtuserhasCancer = false;
					//boolean to tell if the user has Cancer
					boolean c19hurtuserhasOtherIllness = false;
					//boolean to tell if the user has an other serious illness
					
					
					if(userInput.equalsIgnoreCase("!calc covid hospitalization/death chance")) {
						give_covid_hospitalization_death_chance.give_covid_hospitalization_death_chance(c19hurtuserAge, c19hurtuserSex, c19hurtuserhasIssues, c19hurtuserhasHypertension, c19hurtuserhasDiabetes, c19hurtuserhasCardiovascular, c19hurtuserhasRespiratory, c19hurtuserhasCancer, c19hurtuserhasOtherIllness, in);
						System.out.println("");
					}
						
					
					//!calc covid risk assessment chance
					
					//boolean to tell that the covid risk calculator has been completed
					int c19riskNumberAtEvent = 0;
					//int to say the number of ppl that will be at the event
					String c19riskuserRegion = null;
					//String to tell location of the person

					
					if(userInput.equalsIgnoreCase("!calc covid risk assessment chance")) {
						give_covid_risk_assessment_chance.give_covid_risk_assessment_chance(c19riskNumberAtEvent, c19riskuserRegion, in);
						System.out.println("");
					}
					
					
					//!give feedback
					
					if(userInput.equalsIgnoreCase("!give feedback")) {
						give_feedback();
						System.out.println("");
					}

											
					//!give credits 
					
					if(userInput.equalsIgnoreCase("!give credits")) {
						give_credits();
						System.out.println("");
					}	
					
					
					//!repeat snow delay chance
					
					if(userInput.equalsIgnoreCase("!repeat snow delay chance")) {
						repeat_snow_delay_chance(give_snow_delay_chance.delayCalcCompleted, give_snow_delay_chance.delayChance);
						System.out.println("");
					}
					
					
					//!repeat snow cancellation chance
					
					if(userInput.equalsIgnoreCase("!repeat snow cancellation chance")) {
						repeat_snow_cancellation_chance(give_snow_cancellation_chance.cancellationCalcCompleted, give_snow_cancellation_chance.cancellationChance);
						System.out.println("");
					}
					
					
					//!repeat poweroutage chance
					
					if(userInput.equalsIgnoreCase("!repeat poweroutage chance")) {
						repeat_poweroutage_chance(give_poweroutage_chance.outageCalcCompleted, give_poweroutage_chance.outageChance);
						System.out.println("");
					}
					
					//!repeat covid hospitalization/death chance
					
					if(userInput.equalsIgnoreCase("!repeat covid hospitalization/death chance")) {
						repeat_covid_hospitalization_death_chance(give_covid_hospitalization_death_chance.c19hurtCompleted, give_covid_hospitalization_death_chance.c19hurtChanceDeath, give_covid_hospitalization_death_chance.c19hurtChanceHospitalization);
						System.out.println("");
					}
					
					
					//!repeat covid risk assessment chance
					
					if(userInput.equalsIgnoreCase("!repeat covid risk assessment chance")) {
						repeat_covid_risk_assessment(give_covid_risk_assessment_chance.c19riskCompleted, give_covid_risk_assessment_chance.c19riskChance);
						System.out.println("");
					}
					
					//System.out.println("Error 1 - Number is not a positive integer or its not in the correct range.");
					//System.out.println("Error 2 - Issue in true/false response.");
					//System.out.println("Error 3 - Calculation has not been completed.");
					//System.out.println("Error 4 - Calculation could not be completed.");		
					//System.out.println("Error 5 - User input is not in correct parameters.");
		}			
} 
//end of the main method
	
				private static class give_snow_delay_chance {
					public static int delayChance = 0;
					//int saying the % chance of there being a delay
					public static boolean delayCalcCompleted = false;
					//boolean saying if the calculator has been completed
					public static void give_snow_delay_chance (String delayIcePresent, Byte delayInchesSnow, Byte delayIcePresentAffect, Byte delayInchesSnowAffect, Scanner in) {
						System.out.println("This calculator calculates the chance of school being delayed.");
						System.out.println("A place that you can get accurate weather info from is: https://weather.com/");
						System.out.println("A place with very certain information is the district website: https://www.lwsd.org/");
						System.out.println("Ok. There Ice on the road (yes/no)?");
						delayIcePresent=in.next();
						if(delayIcePresent.equalsIgnoreCase("Yes") || delayIcePresent.equalsIgnoreCase("Y")) {
						delayIcePresentAffect = 40;
						System.out.println("Ok. How many inches of snow are there on the road?");	
						delayInchesSnow = in.nextByte();
							if(delayInchesSnow == 0) {
								delayInchesSnowAffect = 0;
								delayChance = delayIcePresentAffect + delayInchesSnowAffect;
							}
							else if(delayInchesSnow == 1) {
								delayInchesSnowAffect = 30;
								delayChance = delayIcePresentAffect + delayInchesSnowAffect;
							}
							else if(delayInchesSnow == 2) {
								delayInchesSnowAffect = 60;
								delayChance = delayIcePresentAffect + delayInchesSnowAffect;
							}
							else if(delayInchesSnow == 3) {
								delayInchesSnowAffect = 90;
								delayChance = delayIcePresentAffect + delayInchesSnowAffect;
							}
							else if(delayInchesSnow >= 4 ) {
								delayInchesSnowAffect = 100;
								delayChance = delayIcePresentAffect + delayInchesSnowAffect;
							}	
							else {
								System.out.println("Sorry there was an issue.");
								System.out.println("Error 1 - Number is not a posotive integer or its not in the correct range.");
								System.out.println("Error 4 - Calculation could not be completed.");
							}
								if(delayChance > 100) {
									delayChance = 100;
									System.out.println("The chance of a delay is " + delayChance + "%.");
									delayCalcCompleted = true;
								}
								else {
									System.out.println("The chance of a delay is " + delayChance + "%.");
									delayCalcCompleted = true;
								}
						}
						else if(delayIcePresent.equalsIgnoreCase("No") || delayIcePresent.equalsIgnoreCase("N")) {
						delayIcePresentAffect = 0;
						System.out.println("Ok. How much snow is there on the road in inches?");	
						delayInchesSnow = in.nextByte();
							if(delayInchesSnow == 0) {
								delayInchesSnowAffect = 0;
								delayChance = delayIcePresentAffect + delayInchesSnowAffect;
							}
							else if(delayInchesSnow == 1) {
								delayInchesSnowAffect = 25;
								delayChance = delayIcePresentAffect + delayInchesSnowAffect;
							}
							else if(delayInchesSnow == 2) {
								delayInchesSnowAffect = 50;
								delayChance = delayIcePresentAffect + delayInchesSnowAffect;
							}	
							else if(delayInchesSnow == 3) {
								delayInchesSnowAffect = 75;
								delayChance = delayIcePresentAffect + delayInchesSnowAffect;
							}
							else if(delayInchesSnow >= 4) {
								delayInchesSnowAffect = 100;
								delayChance = delayIcePresentAffect + delayInchesSnowAffect;
							}
							else {
								System.out.println("Sorry there was an issue.");
								System.out.println("Error 1 - Number is not a positive integer or its not in the correct range.");
								System.out.println("Error 4 - Calculation could not be completed.");
							}
								if(delayChance > 100) {
									delayChance = 100;
									System.out.println("The chance of a delay is " + delayChance + "%.");
									delayCalcCompleted = true;
								}
								else {
									System.out.println("The chance of a delay is " + delayChance + "%.");
									delayCalcCompleted = true;
								}
						}
						else {
							System.out.println("Error 4 - Calculation could not be completed.");		
							System.out.println("Error 5 - User input is not in correct parameters.");
							delayIcePresentAffect = 0;
						}	
					}
				}
				
				private static class give_snow_cancellation_chance {
					public static int cancellationChance = 0;
					//int saying the % chance of there being a cancellation
					public static boolean cancellationCalcCompleted = false;
					//boolean saying if the calculator has been completed
					public static void give_snow_cancellation_chance (String cancellationIcePresent, Byte cancellationInchesSnow, Byte cancellationIcePresentAffect, Byte cancellationInchesSnowAffect, Scanner in) {
						System.out.println("This calculator calculates the chance of school being cancelled.");
						System.out.println("Ok. A few questions will be asked to determine the chance.");
						System.out.println("A place that you can get accurate weather info from is: https://weather.com/");
						System.out.println("A place with very certain information is the district website: https://www.lwsd.org/");
						System.out.println("Is there ice on the road (yes/no)?");
						cancellationIcePresent=in.next();	
							if(cancellationIcePresent.equalsIgnoreCase("Yes") || cancellationIcePresent.equalsIgnoreCase("Y")) {
								cancellationIcePresentAffect = 10;
							}
							else if (cancellationIcePresent.equalsIgnoreCase("No") || cancellationIcePresent.equalsIgnoreCase("N")) {
								cancellationIcePresentAffect = 0;
							}
							else {
								System.out.println("Error 5 - User input is not in correct parameters.");
								cancellationIcePresentAffect = 0;
							}
						System.out.println("Ok. How much snow is there on the road in inches (A # between 0-6)?");	
						cancellationInchesSnow=in.nextByte();
							if(cancellationInchesSnow == 0) {
								cancellationInchesSnowAffect = 0;
								cancellationChance = cancellationIcePresentAffect + cancellationInchesSnowAffect;
							}
							else if(cancellationInchesSnow == 1) {
								cancellationInchesSnowAffect = 10;
								cancellationChance = cancellationIcePresentAffect + cancellationInchesSnowAffect;
							}
							else if(cancellationInchesSnow == 2) {
								cancellationInchesSnowAffect = 25;
								cancellationChance = cancellationIcePresentAffect + cancellationInchesSnowAffect;
							}
							else if(cancellationInchesSnow == 3) {
								cancellationInchesSnowAffect = 40;
								cancellationChance = cancellationIcePresentAffect + cancellationInchesSnowAffect;
							}
							else if(cancellationInchesSnow == 4) {
								cancellationInchesSnowAffect = 70;
								cancellationChance = cancellationIcePresentAffect + cancellationInchesSnowAffect;
							}
							else if(cancellationInchesSnow == 5) {
								cancellationInchesSnowAffect = 90;
								cancellationChance = cancellationIcePresentAffect + cancellationInchesSnowAffect;
							}
							else if(cancellationInchesSnow == 6) {
								cancellationInchesSnowAffect = 100;
								cancellationChance = cancellationIcePresentAffect + cancellationInchesSnowAffect;
							}
							else {
								System.out.println("Sorry there was an issue.");
								System.out.println("Error 4 - Calculation could not be completed.");
							}
								if(cancellationChance > 100) {
									cancellationChance = 100;
									System.out.println("The chance of a cancellation is " + cancellationChance + "%.");
									cancellationCalcCompleted = true;
								}
								else {
									System.out.println("The chance of a cancellation is " + cancellationChance + "%.");
									cancellationCalcCompleted = true;
								}					
					}
				}
				
				private static class give_poweroutage_chance {
					public static int outageChance = 0;
					//int saying the % chance of there being a poweroutage
					public static boolean outageCalcCompleted = false;
					//boolean saying if the calculator has been completed
					public static void give_poweroutage_chance (String outageHighWindWarning, int outageWindSpeed, int outageWindSpeedAffect, Scanner in) {
						System.out.println("This calculator calculates the chance of there being a poweroutage.");
						System.out.println("Ok. A few questions will be asked to determine the chance.");
						System.out.println("A place that you can get accurate info from is: https://weather.com/");
						System.out.println("Is your region a 'suburb with trees', 'suburb without trees', or 'city'");
						String userRegion = in.nextLine();
						System.out.println("Is there a high speed warning at the moment (yes/no)?");
						outageHighWindWarning=in.next();
						System.out.println("Please check your weather app. What is the wind speed (please use MPH but only type in the number)?");
						outageWindSpeed=in.nextByte();	
							if(userRegion.equalsIgnoreCase("suburb with trees")) {
								if((outageWindSpeed >= 0) && (outageWindSpeed <= 3)) {
									outageWindSpeedAffect = 1;
								}
								else if((outageWindSpeed >= 4) && (outageWindSpeed <= 7)) {
									outageWindSpeedAffect = 5;
								}
								else if((outageWindSpeed >= 8) && (outageWindSpeed <= 12)) {
									outageWindSpeedAffect = 10;
								}
								else if((outageWindSpeed >= 13) && (outageWindSpeed <= 18)) {
									outageWindSpeedAffect = 20;
								}
								else if((outageWindSpeed >= 19) && (outageWindSpeed <= 24)) {
									outageWindSpeedAffect = 30;
								}
								else if((outageWindSpeed >= 25) && (outageWindSpeed <= 30)) {
									outageWindSpeedAffect = 40;
								}
								else if((outageWindSpeed >= 31) && (outageWindSpeed <= 35)) {
									outageWindSpeedAffect = 60;
								}
								else if((outageWindSpeed >= 36) && (outageWindSpeed <= 38)) {
									outageWindSpeedAffect = 70;
								}
								else if((outageWindSpeed >= 39) && (outageWindSpeed <= 46)) {
									outageWindSpeedAffect = 75;
								}
								else if((outageWindSpeed >= 47) && (outageWindSpeed <= 50)) {
									outageWindSpeedAffect = 85;
								}
								else if((outageWindSpeed >= 51) && (outageWindSpeed <= 55)) {
									outageWindSpeedAffect = 95;
								}
								else if((outageWindSpeed >= 56) && (outageWindSpeed <= 60)) {
									outageWindSpeedAffect = 100;
								}
								else if((outageWindSpeed >= 61) && (outageWindSpeed <= 65)) {
									outageWindSpeedAffect = 100;
								}
								else if((outageWindSpeed >= 66) && (outageWindSpeed <= 70)) {
									outageWindSpeedAffect = 100;
								}
								else if (outageWindSpeed > 70) {
									outageWindSpeedAffect = 100;
								}
								else {
									System.out.println("Sorry there was an issue.");
									System.out.println("Error 1 - Number is not a positive integer or its not in the correct range.");
									System.out.println("Error 4 - Calculation could not be completed.");
								}
							}
							else if(userRegion.equalsIgnoreCase("suburb without trees")) {
								if((outageWindSpeed >= 0) && (outageWindSpeed <= 3)) {
									outageWindSpeedAffect = 1;
								}
								else if((outageWindSpeed >= 4) && (outageWindSpeed <= 7)) {
									outageWindSpeedAffect = 2;
								}
								else if((outageWindSpeed >= 8) && (outageWindSpeed <= 12)) {
									outageWindSpeedAffect = 5;
								}
								else if((outageWindSpeed >= 13) && (outageWindSpeed <= 18)) {
									outageWindSpeedAffect = 15;
								}
								else if((outageWindSpeed >= 19) && (outageWindSpeed <= 24)) {
									outageWindSpeedAffect = 25;
								}
								else if((outageWindSpeed >= 25) && (outageWindSpeed <= 30)) {
									outageWindSpeedAffect = 40;
								}
								else if((outageWindSpeed >= 31) && (outageWindSpeed <= 35)) {
									outageWindSpeedAffect = 50;
								}
								else if((outageWindSpeed >= 36) && (outageWindSpeed <= 38)) {
									outageWindSpeedAffect = 60;
								}
								else if((outageWindSpeed >= 39) && (outageWindSpeed <= 46)) {
									outageWindSpeedAffect = 70;
								}
								else if((outageWindSpeed >= 47) && (outageWindSpeed <= 50)) {
									outageWindSpeedAffect = 80;
								}
								else if((outageWindSpeed >= 51) && (outageWindSpeed <= 55)) {
									outageWindSpeedAffect = 90;
								}
								else if((outageWindSpeed >= 56) && (outageWindSpeed <= 60)) {
									outageWindSpeedAffect = 95;
								}
								else if((outageWindSpeed >= 61) && (outageWindSpeed <= 65)) {
									outageWindSpeedAffect = 99;
								}
								else if((outageWindSpeed >= 66) && (outageWindSpeed <= 70)) {
									outageWindSpeedAffect = 100;
								}
								else if (outageWindSpeed > 70) {
									outageWindSpeedAffect = 100;
								}
								else {
									System.out.println("Sorry there was an issue.");
									System.out.println("Error 1 - Number is not a positive integer or its not in the correct range.");
									System.out.println("Error 4 - Calculation could not be completed.");
								}
							}
							else if(userRegion.equalsIgnoreCase("city")) {
								if((outageWindSpeed >= 0) && (outageWindSpeed <= 3)) {
									outageWindSpeedAffect = 1;
								}
								else if((outageWindSpeed >= 4) && (outageWindSpeed <= 7)) {
									outageWindSpeedAffect = 1;
								}
								else if((outageWindSpeed >= 8) && (outageWindSpeed <= 12)) {
									outageWindSpeedAffect = 10;
								}
								else if((outageWindSpeed >= 13) && (outageWindSpeed <= 18)) {
									outageWindSpeedAffect = 20;
								}
								else if((outageWindSpeed >= 19) && (outageWindSpeed <= 24)) {
									outageWindSpeedAffect = 25;
								}
								else if((outageWindSpeed >= 25) && (outageWindSpeed <= 30)) {
									outageWindSpeedAffect = 40;
								}
								else if((outageWindSpeed >= 31) && (outageWindSpeed <= 35)) {
									outageWindSpeedAffect = 55;
								}
								else if((outageWindSpeed >= 36) && (outageWindSpeed <= 38)) {
									outageWindSpeedAffect = 65;
								}
								else if((outageWindSpeed >= 39) && (outageWindSpeed <= 46)) {
									outageWindSpeedAffect = 75;
								}
								else if((outageWindSpeed >= 47) && (outageWindSpeed <= 50)) {
									outageWindSpeedAffect = 85;
								}
								else if((outageWindSpeed >= 51) && (outageWindSpeed <= 55)) {
									outageWindSpeedAffect = 95;
								}
								else if((outageWindSpeed >= 56) && (outageWindSpeed <= 60)) {
									outageWindSpeedAffect = 100;
								}
								else if((outageWindSpeed >= 61) && (outageWindSpeed <= 65)) {
									outageWindSpeedAffect = 100;
								}
								else if((outageWindSpeed >= 66) && (outageWindSpeed <= 70)) {
									outageWindSpeedAffect = 100;
								}
								else if (outageWindSpeed > 70) {
									outageWindSpeedAffect = 100;
								}
								else {
									System.out.println("Sorry there was an issue.");
									System.out.println("Error 1 - Number is not a positive integer or its not in the correct range.");
									System.out.println("Error 4 - Calculation could not be completed.");
								}
							}
							else {
								System.out.println("Sorry there was an issue.");
								System.out.println("Error 1 - Number is not a positive integer or its not in the correct range.");
								System.out.println("Error 4 - Calculation could not be completed.");
							}	
								
						if(outageHighWindWarning.equalsIgnoreCase("Yes") || outageHighWindWarning.equalsIgnoreCase("Y")) {
							outageChance = outageWindSpeedAffect + 75;
							if(outageChance > 100) {
								outageChance = 100;
								System.out.println("The chance of a poweroutage is " + outageChance + "%.");
								outageCalcCompleted = true;
							}
							else {
								System.out.println("The chance of a poweroutage is " + outageChance + "%.");
								outageCalcCompleted = true;
							}
						}
						else {
							outageChance = outageWindSpeedAffect; 
							if(outageChance > 100) {
								outageChance = 100;
								System.out.println("The chance of a poweroutage is " + outageChance + "%.");
								outageCalcCompleted = true;
							}
							else {
								System.out.println("The chance of a poweroutage is " + outageChance + "%.");
								outageCalcCompleted = true;
							}
						}
					}
				}
				
				private static class give_covid_hospitalization_death_chance {
					public static double c19hurtChanceDeath = 0;
					//double saying the % chance of the user dying of COVID
					public static double c19hurtChanceHospitalization = 0;
					//double saying the % chance of the user going to hospital due to COVID
					public static boolean c19hurtCompleted = false;
					//boolean saying if the calculator has been completed
					public static void give_covid_hospitalization_death_chance (int c19hurtuserAge, String c19hurtuserSex, boolean c19hurtuserhasIssues, boolean c19hurtuserhasHypertension, boolean c19hurtuserhasDiabetes, boolean c19hurtuserhasCardiovascular, boolean c19hurtuserhasRespiratory, boolean c19hurtuserhasCancer, boolean c19hurtuserhasOtherIllness, Scanner in) {
						System.out.println("This calculator calculates the chance of hospitalization/death due to COVID-19 based off factors such as age, sex, and health issues.");
						System.out.println("Note: This calculator is based off population of the US so results could be less accurate in other countries.");
						System.out.println("Note: This is assuming a worst-case senerio with an average person of this age.");
						System.out.println("Ok. A few questions will be asked to determine the chance.");
						System.out.println("What is your biological sex (Male or Female)?");
						c19hurtuserSex = in.nextLine();
						System.out.println("What is your age (0-89)?");
						c19hurtuserAge = in.nextInt();
						//System.out.println("Do you have serious health conditions (True or False)?");
						//c19hurtuserhasIssues = in.nextBoolean();
							
							/*if(c19hurtuserhasIssues == true) {
							System.out.println("Do you have Hypertension or High Blood Pressure (True or False)?");
							c19hurtuserHypertension = in.nextBoolean();
							System.out.println("Do you have Diabetes (True or False)?");
							c19hurtuserDiabetes = in.nextBoolean();
							System.out.println("Do you have Cardiovascular Disease (True or False)?");
							c19hurtuserCardiovascular = in.nextBoolean();
							System.out.println("Do you have Respiratory Disease (True or False)?");
							c19hurtuserRespiratory = in.nextBoolean();
							System.out.println("Do you have Cancer (True or False)?");
							c19hurtuserCancer = in.nextBoolean();
							System.out.println("Do you have another serious ilnness (True or False)?");
							c19hurtuserOtherIllness = in.nextBoolean();
							}
							else if(c19hurtuserhasIssues == false) {								
							}
							else {
							System.out.println("Error 2 - Issue in true/false response.");
							System.out.println("Error 4 - Calculation could not be completed.");
							}*/
							
							if((c19hurtuserAge >= 0) && (c19hurtuserAge <= 9)) {
								System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
								System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");	
							}
							else if((c19hurtuserAge >= 10) && (c19hurtuserAge <= 19)) {
								if(c19hurtuserSex.equalsIgnoreCase("Male") || c19hurtuserSex.equalsIgnoreCase("M")) {
									c19hurtChanceDeath = 0.03;
									c19hurtChanceHospitalization = 0.01;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else if (c19hurtuserSex.equalsIgnoreCase("Female") || c19hurtuserSex.equalsIgnoreCase("F")) {
									c19hurtChanceDeath = 0.03;
									c19hurtChanceHospitalization = 0.01;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else {
									System.out.println("Error 4 - Calculation could not be completed.");										
								}
							}
							else if((c19hurtuserAge >= 20) && (c19hurtuserAge <= 29)) {
								if(c19hurtuserSex.equalsIgnoreCase("Male") || c19hurtuserSex.equalsIgnoreCase("M")) {
									c19hurtChanceDeath = 0.84;
									c19hurtChanceHospitalization = 0.03;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else if (c19hurtuserSex.equalsIgnoreCase("Female") || c19hurtuserSex.equalsIgnoreCase("F")) {
									c19hurtChanceDeath = 0.84;
									c19hurtChanceHospitalization = 0.03;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else {
									System.out.println("Error 4 - Calculation could not be completed.");	
								}
							}
							else if((c19hurtuserAge >= 30) && (c19hurtuserAge <= 39)) {
								if(c19hurtuserSex.equalsIgnoreCase("Male") || c19hurtuserSex.equalsIgnoreCase("M")) {
									c19hurtChanceDeath = 2.78;
									c19hurtChanceHospitalization = 0.07;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else if (c19hurtuserSex.equalsIgnoreCase("Female") || c19hurtuserSex.equalsIgnoreCase("F")) {
									c19hurtChanceDeath = 2.78;
									c19hurtChanceHospitalization = 0.07;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else {
									System.out.println("Error 4 - Calculation could not be completed.");	
								}
							}
							else if((c19hurtuserAge >= 40) && (c19hurtuserAge <= 49)) {
								if(c19hurtuserSex.equalsIgnoreCase("Male") || c19hurtuserSex.equalsIgnoreCase("M")) {
									c19hurtChanceDeath = 3.44;
									c19hurtChanceHospitalization = 0.13;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else if (c19hurtuserSex.equalsIgnoreCase("Female") || c19hurtuserSex.equalsIgnoreCase("F")) {
									c19hurtChanceDeath = 3.44;
									c19hurtChanceHospitalization = 0.13;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else {
									System.out.println("Error 4 - Calculation could not be completed.");	
								}
							}
							else if((c19hurtuserAge >= 50) && (c19hurtuserAge <= 59)) {
								if(c19hurtuserSex.equalsIgnoreCase("Male") || c19hurtuserSex.equalsIgnoreCase("M")) {
									c19hurtChanceDeath = 6.61;
									c19hurtChanceHospitalization = 0.48;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else if (c19hurtuserSex.equalsIgnoreCase("Female") || c19hurtuserSex.equalsIgnoreCase("F")) {
									c19hurtChanceDeath = 6.61;
									c19hurtChanceHospitalization = 0.48;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else {
									System.out.println("Error 4 - Calculation could not be completed.");	
								}
							}
							else if((c19hurtuserAge >= 60) && (c19hurtuserAge <= 69)) {
								if(c19hurtuserSex.equalsIgnoreCase("Male") || c19hurtuserSex.equalsIgnoreCase("M")) {
									c19hurtChanceDeath = 9.56;
									c19hurtChanceHospitalization = 1.56;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else if (c19hurtuserSex.equalsIgnoreCase("Female") || c19hurtuserSex.equalsIgnoreCase("F")) {
									c19hurtChanceDeath = 9.56;
									c19hurtChanceHospitalization = 1.56;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else {
									System.out.println("Error 4 - Calculation could not be completed.");	
								}
							}
							else if((c19hurtuserAge >= 70) && (c19hurtuserAge <= 79)) {
								if(c19hurtuserSex.equalsIgnoreCase("Male") || c19hurtuserSex.equalsIgnoreCase("M")) {
									c19hurtChanceDeath = 13.45;
									c19hurtChanceHospitalization = 3.47;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else if (c19hurtuserSex.equalsIgnoreCase("Female") || c19hurtuserSex.equalsIgnoreCase("F")) {
									c19hurtChanceDeath = 13.45;
									c19hurtChanceHospitalization = 3.47;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else {
									System.out.println("Error 4 - Calculation could not be completed.");	
								}
							}
							else if((c19hurtuserAge >= 80) && (c19hurtuserAge <= 89)) {
								if(c19hurtuserSex.equalsIgnoreCase("Male") || c19hurtuserSex.equalsIgnoreCase("M")) {
									c19hurtChanceDeath = 14.9;
									c19hurtChanceHospitalization = 6.32;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else if (c19hurtuserSex.equalsIgnoreCase("Female") || c19hurtuserSex.equalsIgnoreCase("F")) {
									c19hurtChanceDeath = 14.9;
									c19hurtChanceHospitalization = 6.32;
									System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
									System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
									c19hurtCompleted = true;
								}
								else if((c19hurtuserAge > 89)) {
									System.out.println("Sorry but the number is out of the range. Please rerun a program and input a number less than 89. ");
								}
								else {
									System.out.println("Error 4 - Calculation could not be completed.");	
								}
							}
							else {
								System.out.println("Error 1 - Number is not a positive integer or its not in the correct range.");
								System.out.println("Error 3 - Calculation has not been completed.");
								System.out.println("Error 4 - Calculation could not be completed.");
							}	
					}
				}
				
				private static class give_covid_risk_assessment_chance {
					public static double c19riskChance = 0;
					//double saying the % chance of the user getting COVID based off the size of the group they are in
					public static boolean c19riskCompleted = false;
					//boolean saying if the calculator has been completed
					public static void give_covid_risk_assessment_chance (int c19riskNumberAtEvent, String c19riskuserRegion, Scanner in) {
						System.out.println("This calculator calculates the chance of someone in the event getting COVID-19 due to the amount of people you are going to be with and the region you in.");
						System.out.println("Ok. A few questions will be asked to determine the chance.");
						System.out.println("How many people will be at your event (Please submit one of the following numbers 10, 15, 20, 25, 50, 100, 500, 1000, and 5000)?");
						//c19riskNumberAtEvent = in.nextInt();
						c19riskNumberAtEvent = 10;
						System.out.println("What state do you live in (i.e. New York)?");
						System.out.println("We also have support for 'Washington DC' and 'King County' (Washington).");
						//System.out.println(c19riskuserRegion);
						c19riskuserRegion = in.nextLine();
						System.out.println(c19riskuserRegion);
						

							
							if(c19riskNumberAtEvent == 10) {
								if(c19riskuserRegion.equalsIgnoreCase("King County")) {
									c19riskChance = 4;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								else if(c19riskuserRegion.equalsIgnoreCase("Washington")) {
									c19riskChance = 4;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								else {
									c19riskChance = 5;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
							}
							else if(c19riskNumberAtEvent == 15) {
								 if(c19riskuserRegion.equalsIgnoreCase("King County")) {
									c19riskChance = 6;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								else {
									c19riskChance = 10;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
							}
							else if(c19riskNumberAtEvent == 20) {
								 if(c19riskuserRegion.equalsIgnoreCase("King County")) {
									c19riskChance = 8;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								else {
									c19riskChance = 10;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
							}
							else if(c19riskNumberAtEvent == 25) {
								 if(c19riskuserRegion.equalsIgnoreCase("King County")) {
									c19riskChance = 10;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								else {
									c19riskChance = 14;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
							}
							else if(c19riskNumberAtEvent == 50) {
								if(c19riskuserRegion.equalsIgnoreCase("King County")) {
									c19riskChance = 19;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								else if(c19riskuserRegion.equalsIgnoreCase("Washington DC")) {
									c19riskChance = 24;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								else {
									c19riskChance = 20;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
							}
							else if(c19riskNumberAtEvent == 100) { 
								if(c19riskuserRegion.equalsIgnoreCase("King County")) {
									c19riskChance = 35;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								else {
									c19riskChance = 33;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
							}
							else if(c19riskNumberAtEvent == 500) {
								if(c19riskuserRegion.equalsIgnoreCase("King County")) {
									c19riskChance = 88;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								else if(c19riskuserRegion.equalsIgnoreCase("Washington")) {
									c19riskChance = 98.67;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								if(c19riskuserRegion.equalsIgnoreCase("New York")) {
									c19riskChance = 98.45;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								if(c19riskuserRegion.equalsIgnoreCase("Vermont")) {
									c19riskChance = 72.28;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								if(c19riskuserRegion.equalsIgnoreCase("Connecticut")) {
									c19riskChance = 98.85;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								if(c19riskuserRegion.equalsIgnoreCase("Maine")) {
									c19riskChance = 82.23;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								if(c19riskuserRegion.equalsIgnoreCase("Massachusetts")) {
									c19riskChance = 92.13;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
								}
								else {
									c19riskChance = 89;
									System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
									c19riskCompleted = true;
									//make this an else if and then add an else statement or keep like this but decide later
								}
							}
							else if(c19riskNumberAtEvent == 1000) {
								c19riskChance = 99.99;
								System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
								c19riskCompleted = true;
							}
							else if(c19riskNumberAtEvent == 5000) {
								c19riskChance = 99.99;
								System.out.println("The chance that someone will get COVID-19 in the event is " + c19riskChance + "%.");
								c19riskCompleted = true;
							}
							else {
								System.out.println("Sorry there was an issue.");
								System.out.println("Error 1 - Number is not a positive integer or its not in the correct range.");
								System.out.println("Error 4 - Calculation could not be completed.");
							}	
					}
				}
	
				public static void give_feedback() {
					System.out.println("This program is continously being worked on and we love support.");
					System.out.println("We are trying to find new ways to give feedback more easily.");
					System.out.println("A way you can give feedback is by joining our discord using this link: https://discord.gg/eSCR4ZP");	
				}
				
				public static void give_credits() {
					System.out.println("This program was created by The Tech Frontier 2021");
					System.out.println("Original Creator: Coltigo");
					System.out.println("Programming Director: Coltigo");
					System.out.println("Design Director: Coltigo");
					System.out.println("");
					System.out.println("Bibliography:");
					System.out.println("COVID-19 data and suggestions comes from the CDC: https://www.cdc.gov/mmwr/volumes/69/wr/pdfs/mm6913e2-H.pdf");
					System.out.println("Real-time COVID-19 data comes from the COVID Tracking Project: https://covidtracking.com/api/");
					System.out.println("Population estimate data comes from US Census: https://www.census.gov/data/tables/time-series/demo/popest/2010s-state-total.html");
					System.out.println("Weather source linked is weather.com: https://weather.com/");
					System.out.println("Source for information on poweroutages: https://courses.washington.edu/cee518/Wind-Thresholds.pdf");
					System.out.println("Source 1 for weather data: https://www.weather.gov/ilx/swopwindscale");
				}
	
				public static void repeat_snow_delay_chance(boolean delayCalcCompleted, int delayChance) {
					if(delayCalcCompleted == true) {
						System.out.println("The chance of a delay is " + delayChance + "%.");
					}
					else {
						System.out.println("Error: You did not complete this calculator.");
					}
				}

				public static void repeat_snow_cancellation_chance(boolean cancellationCalcCompleted, int cancellationChance) {
					if(cancellationCalcCompleted == true) {
						System.out.println("The chance of a delay is " + cancellationChance + "%.");
					}
					else {
						System.out.println("Error: You did not complete this calculator.");
					}
				}
	
				public static void repeat_poweroutage_chance(boolean outageCalcCompleted, int outageChance) {
					if(outageCalcCompleted == true) {
						System.out.println("The chance of a delay is " + outageChance + "%.");
					}
					else {
						System.out.println("Error: You did not complete this calculator.");
					}
				}

				public static void repeat_covid_hospitalization_death_chance(boolean c19hurtCompleted, double c19hurtChanceDeath, double c19hurtChanceHospitalization) {
					if(c19hurtCompleted == true) {
						System.out.println("The chance of death due to COVID-19 is " + c19hurtChanceDeath + "%.");
						System.out.println("The chance of hopsitalization due to COVID-19 is " + c19hurtChanceHospitalization + "%.");
					}
					else {
						System.out.println("Error: You did not complete this calculator.");
					}
				}
	
				public static void repeat_covid_risk_assessment(boolean c19riskCompleted, double c19riskChance) {
					if(c19riskCompleted == true) {
						System.out.println("The chance of someone in the group getting COVID-19 is " + c19riskChance + "%.");
					}
					else {
						System.out.println("Error: You did not complete this calculator.");
					}
				}
				
}			
