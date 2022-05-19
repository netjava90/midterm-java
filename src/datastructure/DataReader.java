package datastructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class DataReader {
		public static void main(String[] args) {
			/*
			 * User API to read the below textFile and print to console.
			 * Use BufferedReader class.
			 * Use try....catch block to handle Exception.
			 *
			 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
			 *
			 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
			 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
			 * order from LinkedList and retrieve as FILO order from Stack.
			 *
			 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
			 * Use For Each loop/while loop/Iterator to retrieve data.
			 */

            //read file using and print it to console.
			//using buffered reader and try and catch block

			String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			String filePath = "src/data/self-driving-car";

			try {
				fileReader = new FileReader(filePath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			try {
				if(fileReader != null){
					bufferedReader = new BufferedReader(fileReader);
					String str = " ";
					while ((str = bufferedReader.readLine()) != null){
						System.out.println(str);
					}
				}
			}catch (Exception e){
				e.printStackTrace();
			}


			try { if(fileReader != null) {
				fileReader.close();
			    }
			} catch (IOException e) {
				e.printStackTrace();
			}


			try { if (bufferedReader != null) {
				bufferedReader.close();
			    }
			} catch (IOException e) {
				e.printStackTrace();
			  }
		    }
        }

		  //store each word into LinkedList:


