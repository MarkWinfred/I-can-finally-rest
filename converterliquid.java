public class converterliquid {

    public static double convert(int unit1, double value1, int unit2) {
        if (unit1 == 1) //1 is equal to Cups
        {
            if(unit2==1){ //From Cups to Cups
                return value1;
            }else if(unit2 == 2){ //From Cups to Liters
                return value1/4.00;
            }else{ //From Cups to Milliliters
                return value1*250.00;
            }
        }
        else if(unit1 == 2) //2 is equal to Liters
        {
            if(unit2==1){ //From Liters to Cups
                return value1*0.25;
            }else if(unit2 == 2){ //From Liters to Liters
                return value1;
            }else{ //From Liters to Milliliters
                return value1*1000;
            }
        }else{
            if(unit2==1){ //From Milliliters to Cups
                return value1/250.00;
            }else if(unit2 == 2){ //From Milliliters to Liters
                return value1/1000.00;
            }else{ //From Milliliters to Milliliters
                return value1;
            }
        }
    }
}
