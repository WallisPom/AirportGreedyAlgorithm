import java.io.BufferedReader;

import java.io.FileReader;
import java.util.Random;
import java.util.Arrays;

class Airport { 
	   
static int findNumGates(double start[], double finish[], int n) //method to find number of gates
{ 
	
	
   //arrange start and finish times in increasing order
	Arrays.sort(start); 
	Arrays.sort(finish); 

   //requiredGates is maximum number of gates required
   int requiredGates = 1;
   int tracker = 1; 
   int counter1 = 1;
   int counter2 = 0; 
  
   //counter1 is for arrival, counter2 is for departure, & n is the size of the array
   while (counter1 < n && counter2 < n) 
   { 
      //if next event in array is an arrival, increase required gates
      if (start[counter1] <= finish[counter2]) 
      { 
          requiredGates++; 
          counter1++; 
   
          //set tracker equal to required gates if requiredGates is greater than tracker 
          if (requiredGates > tracker)  
              tracker = requiredGates; 
      } 
   
      // else decrement tracker of gates needed 
      else
      { 
          requiredGates--; 
          counter2++; 
      } 
   } 
   
   return tracker; 
} 

   
public static void main(String[] args) 
{ 
		double start1[] = { 6.07, 6.1, 6.14, 6.15, 6.26, 6.72, 6.8, 7.16, 7.17, 7.18, 7.72, 8.11, 8.17, 8.19, 8.23,
				8.23, 8.46, 8.6, 8.97, 9.16, 9.22, 9.45, 9.66, 10.07, 10.11, 10.18, 10.21, 10.3, 10.35, 10.4, 10.4,
				10.4, 10.5, 10.72, 10.73, 10.81, 11.08, 11.2, 11.2, 11.23, 11.26, 11.37, 11.57, 11.7, 11.74, 11.75,
				11.95, 12.05, 12.19, 12.53, 12.57, 12.58, 12.66, 12.82, 12.99, 13.03, 13.1, 13.38, 13.41, 13.62, 13.63,
				14.02, 14.04, 14.06, 14.1, 14.12, 14.24, 14.43, 14.58, 14.58, 14.61, 14.67, 14.95, 15.07, 15.32, 15.48,
				15.55, 15.61, 15.68, 16.02, 16.1, 16.32, 16.32, 16.7, 16.72, 16.8, 16.86, 16.9, 16.95, 16.99, 17.08,
				17.4, 17.49, 17.69, 17.79, 17.91, 17.96, 18.05, 18.08, 18.19, 18.2, 18.35, 18.52, 18.65, 18.95, 19.18,
				19.36, 19.56, 19.57, 19.58, 19.95, 20.05, 20.06, 20.23, 20.34, 20.42, 20.54, 20.55, 20.56, 20.58, 20.6,
				20.63, 20.63, 20.66, 20.68, 20.91, 20.95, 21.06, 21.12, 21.27, 21.28 };
		double finish1[] = { 8.7728, 6.6494, 9.1787, 7.3636, 7.3128, 10.508, 9.6035, 9.0209, 8.2734, 8.4876, 8.3928,
				11.343, 11.702, 9.6455, 9.0132, 8.9524, 11.636, 9.8936, 10.565, 11.07, 10.109, 11.77, 12.597, 11.13,
				10.986, 12.068, 10.858, 13.326, 11.263, 11.43, 12.701, 11.149, 12.164, 13.292, 12.922, 15.008, 13.917,
				14.8, 11.809, 12.869, 11.882, 12.108, 12.08, 13.797, 14.706, 14.622, 12.889, 14.331, 14.304, 14.976,
				13.253, 14.191, 14.421, 13.844, 13.534, 16.459, 14.289, 14.479, 14.248, 14.54, 16.09, 14.947, 15.728,
				14.921, 14.742, 15.81, 16.179, 16.561, 16.051, 16.029, 17.965, 16.91, 15.971, 18.113, 17.199, 16.012,
				16.499, 18.692, 16.455, 16.91, 18.632, 18.556, 17.963, 17.575, 19.693, 17.573, 18.284, 17.965, 18.497,
				17.946, 19.232, 18.57, 18.69, 20.344, 19.757, 19.319, 18.63, 19.697, 19.585, 19.254, 19.85, 21.135,
				19.885, 19.789, 19.514, 21.543, 20.617, 20.549, 21.737, 20.782, 20.934, 20.7, 21.012, 20.766, 20.873,
				20.933, 22.434, 21.186, 25.022, 21.809, 21.394, 22.57, 23.2, 22.572, 22.321, 21.767, 21.763, 21.597,
				21.662, 21.981, 22.136 };

  
		double start2[] = { 6.01, 6.07, 6.24, 6.25, 6.46, 6.79, 6.8, 6.93, 7.42, 7.55, 7.59, 7.66, 7.66, 8.41, 8.52,
				8.59, 8.84, 8.89, 8.98, 9.08, 9.09, 9.11, 9.11, 9.12, 9.21, 9.34, 9.55, 9.75, 9.92, 10.04, 10.09, 10.22,
				10.51, 10.54, 10.63, 10.94, 11.07, 11.18, 11.19, 11.37, 11.42, 11.48, 11.72, 11.85, 11.87, 11.92, 11.92,
				12.24, 12.28, 12.33, 12.38, 12.42, 12.42, 12.48, 12.65, 12.71, 12.75, 12.76, 13.12, 13.15, 13.25, 13.33,
				13.46, 13.54, 13.58, 13.66, 13.71, 14.1, 14.11, 14.26, 14.41, 14.61, 14.64, 14.76, 14.89, 14.89, 14.94,
				15.05, 15.1, 15.12, 15.17, 15.3, 15.36, 15.73, 15.94, 16, 16.27, 16.29, 16.33, 16.38, 16.4, 16.45,
				16.46, 16.72, 17.1, 17.24, 17.44, 17.44, 17.63, 17.73, 17.76, 17.92, 17.94, 18.41, 18.79, 18.98, 19.07,
				19.21, 19.23, 19.35, 19.47, 19.47, 19.51, 19.53, 19.62, 19.9, 19.99, 20.02, 20.39, 20.41, 20.69, 20.71,
				21.03, 21.06, 21.23, 21.25, 21.44, 21.54, 21.71, 21.73, 21.8 };
		double finish2[] = { 7.9111, 8.2775, 9.6759, 9.3948, 7.445, 8.5989, 7.4769, 9.6846, 9.3028, 8.2949, 9.312,
				8.7656, 9.2942, 12.187, 9.1607, 9.5313, 10.097, 12.28, 10.262, 12.662, 9.9948, 10.023, 10.878, 13.777,
				11.087, 10.619, 11.99, 10.263, 10.77, 11.176, 12.794, 12.53, 11.306, 12.1, 12.955, 11.991, 13.471,
				12.612, 14.383, 13.457, 12.147, 12.597, 12.326, 15.25, 13.598, 14.313, 14.171, 13.595, 13.371, 14.356,
				13.255, 13.298, 14.077, 14.359, 14.428, 14.196, 14.38, 15.268, 14.598, 15.821, 15.685, 17.142, 16.114,
				14.133, 15.847, 15.638, 16.038, 15.248, 15.862, 15.03, 16.659, 15.194, 18.29, 17.113, 15.394, 16.079,
				18.595, 16.111, 15.968, 16.128, 17.287, 16.895, 17.234, 18.911, 17.671, 16.795, 18.105, 18.156, 16.848,
				16.989, 18.309, 17.963, 18.139, 20.419, 17.93, 19.189, 18.465, 19.293, 21.312, 20.103, 19.945, 19.665,
				18.623, 19.874, 19.408, 21.322, 20.367, 20.139, 20.071, 20.862, 21.525, 20.194, 20.486, 21.43, 21.205,
				21.132, 25.389, 20.568, 21.402, 21.035, 22.115, 21.997, 23.042, 24.304, 21.858, 21.852, 22.785, 22.75,
				24.765, 22.311, 23.622 };
		
		/*int percentage;
		int pickAircraftPercentage = (int)(Math.random() * 131);
		percentage = (pickAircraftPercentage/131) * 100; //Returns percentage of aircraft with delay
		
		for(int loopIterations = 0; loopIterations < percentage; loopIterations++) {
			int pickTheAircraft = (int)(Math.random()*131);
		}*/
		
		//int n = start1.length;
	    int n = start1.length; 
    
		int time = 15;
		
		System.out.println("Testing for set 1 & 2: ");
		System.out.println("Set 1: The minimum required gates WITHOUT delay: " + findNumGates(start1, finish1, n) + "\n");

		//adding delay
		//changing delay from 0.25 to 1 (15 mins to 1 hour)
		int avg1 = 0;
		int randTot1 = 0;
		int randAircraft1 = 0;
		int t1 = 15;
		for (double i = 0.25; i <= 1; i += 0.25) {

			for (int q = 0; q < 10; q++) {
				int rand3 = (int) (Math.random() * 52 + 0);		//MAXIMUM NUMBER OF AIRCRAFT EARLY AND LATE IS 40% - (52/131) 
				randTot1 += rand3;
			}
			
			avg1=randTot1/10;	//find avg out of 10
			
			for (int var1 = 0; var1<= avg1; var1++) {
				randAircraft1 = (int)(Math.random() * 131);
				double rand1 = (double)(Math.random() * i);
				double rand2 = (double)(Math.random() * i);
				double arrSet1SaveVal = start1[randAircraft1];
				double depSet1SaveVal = finish1[randAircraft1];
				
				start1[randAircraft1] = start1[randAircraft1] + rand1;
				finish1[randAircraft1] = finish1[randAircraft1] + rand2;
				
				if (start1[randAircraft1] > finish1[randAircraft1]) {
					start1[randAircraft1] = arrSet1SaveVal;
					finish1[randAircraft1] = depSet1SaveVal;
					var1--;
				}
			}
			System.out.println("Set 2: Minimum gates required with up to a " + t1 + " minute minimum delay is: "+ findNumGates (start1, finish1, n));
			
			t1 += 15;
			avg1 = 0;
			randTot1 = 0;
		}
		
		System.out.println("\nSet 1: The minimum required gates WITHOUT delay: " + findNumGates (start2, finish2, n) + "\n");
		
		int avg2 = 0;
		int randTot2 = 0;
		int 	randAircraft2 = 0;
		int t2 = 15;
		for (double i2 = 0.25; i2 <= 1; i2 += 0.25) {

			for (int q2 = 0; q2 < 10; q2++) {
				int rand3 = (int) (Math.random() * 52 + 0);			//MAXIMUM NUMBER OF AIRCRAFT EARLY AND LATE IS 40% - (52/131) 
				randTot2 += rand3;
			}
			avg2 = randTot2 / 10;
			
			for (int var2 = 0; var2 <= avg2; var2++) {
				randAircraft2 = (int)(Math.random() * 131);
				double rand1 = (double)(Math.random() * i2);
				double rand2 = (double)(Math.random() * i2);
				double arrSet2SaveVal = start2[randAircraft2];
				double depSet2SaveVal = finish2[randAircraft2];
				
				start2[randAircraft2] = start2[randAircraft2] + rand1;
				finish2[randAircraft2] = finish2[randAircraft2] + rand2;
				
				if (start2[randAircraft2] > finish2[randAircraft2]) {
					start2[randAircraft2] = arrSet2SaveVal;
					finish2[randAircraft2] = depSet2SaveVal;
					var2--;
				}
			}
			System.out.println("Set 2: Minimum gates required with up to a " + t2 + " minute minimum delay is: "+ findNumGates(start2, finish2, n));
			t2 += 15;
			avg2 = 0;
			randTot2 = 0;
			
		}

	}

}


