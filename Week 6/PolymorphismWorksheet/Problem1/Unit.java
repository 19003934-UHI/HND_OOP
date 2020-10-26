
/*
 *  Author: Peter Pasieka
 *  Date Created: 19/10/2020
 *  Class Purpose:
 *  File Version: 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Unit 
{
        private String unitCode;
        private String unitTitle;
        private boolean studentResult;

        public Unit(String unitNumber, String unitName) 
        {
            unitCode = unitNumber;
            unitTitle = unitName;
        }

        // Setters
        public void setUnitCode(String newUnitCode)
        {
            this.unitCode = newUnitCode;

        }

        public void setUnitTitle(String newUnitTitle)
        {
            this.unitTitle = newUnitTitle;
        }

        // Getters
        public String getUnitCode()
        {
            return(unitCode);
        } 

        public String getUnitTitle()
        {
            return(unitTitle);
        }
    
        





}
