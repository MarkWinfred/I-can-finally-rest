public class convertertemp {

    public static double convert(int unit1, double value1, int unit2) {

            if (unit1 == 1) //1 is equal to Celsius
            {
                if(unit2==1){ //From Celsius to Celsius
                    return value1;
                }else if(unit2 == 2){ //From Celsius to Fahrenheit
                    return (value1*9.00/5.00)+32.00;
                }else{ //From Celsius to Kelvin
                    return value1+273.15;
                }
            }
            else if(unit1 == 2) //2 is equal to Fahrenheit
            {
                if(unit2==1){ //From Fahrenheit to Celsius
                    return (value1-32.00)*5.00/9.00;
                }else if(unit2 == 2){ //From Fahrenheit to Fahrenheit
                    return value1;
                }else{ //From Fahrenheit to Kelvin
                    return ((value1-32.00)*5.00/9.00)+273.15;
                }
            }
            else
            {
                if(unit2==1){ //From Kelvin to Celsius
                    return value1-273.15;
                }else if(unit2 == 2){ //From Kelvin to Fahrenheit
                    return ((value1-273.15)*9.00/5.00)+32;
                }else{ //From Kelvin to Kelvin
                    return value1;
                }
            }
    }
}
