package com.i2i.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;

/**
 * <h1> Util </h1>
 * This class gives some utility methods to the user
 *
 * @author Sivaranjani
 * 
 * @created 2016-08-02
 */


public class Utils {

    /**
     * This is a static method which is used to check whether the input string is not null
     * @param input 
     *     Input String that is to be validated
     *
     * @return true if input is not null
     *         false if input is null  
     */
    public static boolean isNotNull(String input) {
        return (input.matches(".+"));
    }

    /**
     * This is a static method which is used to check whether the input string contains alphabets, spaces and '.'
     *
     * @param input 
     *     Input String that is to be validated
     *
     * @return true if input matches the particular pattern
     *         false if input does not matches the particular pattern  
     */
    public static boolean isAlphabetic(String input) {
        return (input.matches("^[\\p{L} .]+$")) ;
    }  

    /**
     * This is a static method which is used to check whether the input is numeric
     *
     * @param input 
     *     Input String that is to be validated
     *
     * @return true if input string is numeric
     *         false if input string is not numeric 
     */
    public static boolean isNumeric(String input) {
        return (input.matches("^[\\d]+$")) ;
    }
    
    /**
     * This is a static method which is used to check whether the input is ten digit
     *
     * @param input 
     *     Input String that is to be validated
     *
     * @return true if input is ten digit
     *         false if input is not ten digit 
     */
    public static boolean isTenDigit(String input) {
        return (input.matches("^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]+$")) ;
    }

    /**
     * This is a static method which is used to check whether the input is single digit
     *
     * @param input 
     *     Input String that is to be validated
     *
     * @return true if input is single digit
     *         false if input is not single digit  
     */
    public static boolean isSingleDigit(String input) {
        return (input.matches("^[0-9]+$")) ;
    }

    /**
     * This is a static method which is used to check whether the input is alpha numeric
     *
     * @param input 
     *     Input String that is to be validated
     *
     * @return true if input is alpha numeric
     *         false if input is not alpha numeric 
     */ 
    public static boolean isAlphaNumeric(String input) {
        return (input.matches("^[a-zA-Z0-9_]{5,15}*$")) ;
    }
    
    /**
     * This is a static method which is used to write the exception into the log file
     *                                          along with the date and time when exception generated
     * @param exceptionLog 
     *     Exception Object which is to be written into the file
     *
     * @exception IOException 
     *     Exception is handled when it faces problem in file operations 
     */
    public static void writeIntoLogFile (Exception exceptionLog) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY hh-mm-ss");
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter("/home/apache-tomcat-8.0.36/webapps/Application/WEB-INF/classes/Log/exceptionLog.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            fileWriter.append(simpleDateFormat.format(date));
            fileWriter.append("\n");
            printWriter = new PrintWriter(bufferedWriter, true);
            exceptionLog.printStackTrace(printWriter);
        } catch (IOException e) {
            e.printStackTrace();
        } finally { 
            try {
                bufferedWriter.close();
            } catch (IOException e){
                e.printStackTrace();
            }
            printWriter.close();
         }
    }
}
