public class convertersolid {

    public static double convert(int unit1, double value1, int unit2) {
        if (unit1 == 1) //1 is equal to Cups
        {
            if(unit2==1){ //From Cups to Cups
                return value1;
            }else if(unit2 == 2){ //From Cups to Kilograms
                return value1*0.25;
            }else{ //From Cups to Grams
                return value1*128.00;
            }
        }
        else if(unit1 == 2) //2 is equal to Kilograms
        {
            if(unit2==1){ //From Kilograms to Cups
                return value1*8;
            }else if(unit2 == 2){ //From Kilograms to Kilograms
                return value1;
            }else{ //From Kilograms to Grams
                return value1*1000;
            }
        }else{
            if(unit2==1){ //From Grams to Cups
                return value1/220.00;
            }else if(unit2 == 2){ //From Grams to Kilograms
                return value1/1000.00;
            }else{ //From Grams to Grams
                return value1;
            }
        }
    }
}

